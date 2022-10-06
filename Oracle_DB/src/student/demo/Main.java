package student.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import student.dao.CourseDAO;
import student.dao.StudentsDAO;
import student.model.Course;
import student.model.Student;

public class Main
{
  private static Scanner scanner  = new Scanner(System.in);
  private static String  URL      = "jdbc:oracle:thin:@//83.228.124.173:6223/tsvetelin_enchev";
  private static String  userName = "tsvetelin_enchev";
  private static String  password = "dbpass";

  public static void main(String[] args) throws SQLException
  {

    Connection connection = DriverManager.getConnection(URL, userName, password);

    int input;

    StudentsDAO studentsDAO = new StudentsDAO(connection);
    CourseDAO courseDAO = new CourseDAO(connection);

    do {
      printMenu();

      input = Integer.parseInt(scanner.next());

      switch (input) {
        case 1:
          System.out.println("Create student");
          createStudent(studentsDAO);
          break;
        case 2:
          System.out.println("Create course");
          createCourse(courseDAO, studentsDAO);
          break;
        case 3:
          System.out.println("Read student");
          readStudent(studentsDAO);
          break;
        case 4:
          System.out.println("Read course");
          readCourse(courseDAO);
          break;
        case 5:
          System.out.println("Update student");
          updateStudent(studentsDAO);
          break;
        case 6:
          System.out.println("Update course");
          updateCourse(courseDAO);
          break;
        case 7:
          System.out.println("Delete student");
          deleteStudent(studentsDAO);
          break;
        case 8:
          System.out.println("Delete course");
          deleteCourse(courseDAO);
          break;
        case 9:
          System.out.println("Exiting");
          break;
        default:
          System.out.println("Please enter a number between 1 and 9.");
      }
    }
    while (input != 9);
  }

  private static void deleteCourse(CourseDAO courseDAO)
  {
    System.out.println("Enter course id");
    int courseId = Integer.parseInt(scanner.next());

    Course course = courseDAO.read(courseId);
    courseDAO.delete(course);
    System.out.println(course + " - Deleted");
  }

  private static void deleteStudent(StudentsDAO studentsDAO)
  {
    System.out.println("Enter student id");
    int studentId = Integer.parseInt(scanner.next());

    Student student = studentsDAO.read(studentId);
    studentsDAO.delete(student);
    System.out.println(student + " - Deleted");
  }

  private static void updateCourse(CourseDAO courseDAO)
  {
    System.out.println("Enter course id to update");
    int courseId = Integer.parseInt(scanner.next());

    Course course = courseDAO.read(courseId);
    System.out.println(courseDAO.update(course));
  }

  private static void updateStudent(StudentsDAO studentsDAO)
  {
    System.out.println("Enter student id");
    int studentId = Integer.parseInt(scanner.next());

    Student student = studentsDAO.read(studentId);
    System.out.println(studentsDAO.update(student));
  }

  private static void readCourse(CourseDAO courseDAO)
  {
    System.out.println("Enter course id");
    int courseId = Integer.parseInt(scanner.next());
    System.out.println(courseDAO.read(courseId));
  }

  private static void readStudent(StudentsDAO studentsDAO)
  {
    System.out.println("Enter student id");
    int studentId = Integer.parseInt(scanner.next());
    System.out.println(studentsDAO.read(studentId));
  }

  private static void createCourse(CourseDAO courseDAO, StudentsDAO studentsDAO)
  {
    System.out.println("Enter course name");
    String courseName = scanner.next();

    System.out.println("Enter lecturer name");
    String lecturer = scanner.next();

    System.out.println("Enter duration");
    int duration = Integer.parseInt(scanner.next());

    System.out.println("Enter student id");
    int studentId = Integer.parseInt(scanner.next());

    Student student = studentsDAO.read(studentId);
    Course course = courseDAO.create(new Course(courseName, lecturer, duration, student));
    System.out.println(course);
  }

  private static void createStudent(StudentsDAO studentsDAO)
  {
    System.out.println("Enter student name:");
    String studentName = scanner.next();

    System.out.println("Enter student grade:");
    int studentGrade = Integer.parseInt(scanner.next());

    Student student = studentsDAO.create(new Student(studentName, studentGrade));
    System.out.println(student);
  }

  private static void printMenu()
  {
    System.out.println("1. Create student");
    System.out.println("2. Create course");
    System.out.println("3. Read student");
    System.out.println("4. Read course");
    System.out.println("5. Update student");
    System.out.println("6. Update course");
    System.out.println("7. Delete student");
    System.out.println("8. Delete course");
    System.out.println("9. Exit");
    System.out.println("Choose your option.");

  }
}
