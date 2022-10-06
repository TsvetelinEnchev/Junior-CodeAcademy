package student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import student.model.Course;

import java.sql.Connection;
import student.model.Student;

public class CourseDAO implements EntityDAO<Course, Integer>
{
  private final Connection connection;
  private static final Scanner scanner = new Scanner(System.in);
  public CourseDAO(Connection connection)
  {
    this.connection = connection;
  }

  @Override
  public Course create(Course entity)
  {
    Course course = new Course(entity.getName(), entity.getLecturer(), entity.getDuration(), entity.getStudent());

    String sqlCommand = "INSERT INTO     "
                      + "COURSES (       "
                      + "NAME,           "
                      + "LECTURER,       "
                      + "DURATION,       "
                      + "STUDENT_ID)     "
                      + "VALUES (?,?,?,?)";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setString(1, entity.getName());
      preparedStatement.setString(2, entity.getLecturer());
      preparedStatement.setInt(3, entity.getDuration());
      preparedStatement.setInt(4, entity.getStudent().getPk_id());
      preparedStatement.executeQuery();
      connection.commit();

      sqlCommand = "SELECT PK_ID "
                 + "FROM COURSES "
                 + "WHERE        "
                 + "ROWNUM = 1   "
                 + "ORDER BY     "
                 + "PK_ID DESC   ";

      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sqlCommand);

      if (resultSet.next()) {
        course.setPk_id(resultSet.getInt(1));
      }
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return course;
  }

  @Override
  public Course read(Integer id)
  {
    Course course = new Course();
    Student student = null;

    String sqlCommand = "SELECT *       "
                      + "FROM COURSES   "
                      + "WHERE PK_ID = ?";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        course.setName(resultSet.getString(2));
        course.setLecturer(resultSet.getString(3));
        course.setDuration(resultSet.getInt(4));
        course.setPk_id(resultSet.getInt(1));
      }
      String sql = "SELECT *        "
                 + "FROM STUDENTS   "
                 + " WHERE PK_ID = ?";

      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, resultSet.getInt(5));
      ResultSet resultSet1 = preparedStatement.executeQuery();

      if (resultSet1.next()) {
        student = new Student(resultSet1.getString(2), resultSet1.getInt(3));
        student.setPk_id(resultSet1.getInt(1));
      }
      course.setStudent(student);
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return course;
  }

  @Override
  public Course update(Course entity)
  {
    System.out.println("Enter new course name");
    String courseName = scanner.next();
    System.out.println("Enter new lecturer name");
    String lecturerName = scanner.next();
    System.out.println("Enter duration");
    int duration = Integer.parseInt(scanner.next());
    System.out.println("Enter new student id");
    int studentId = Integer.parseInt(scanner.next());
    System.out.println("Enter student grade");
    int studentGrade = Integer.parseInt(scanner.next());
    Course course = new Course();
    Student student = null;

    String sqlCommand = "UPDATE COURSES  "
                      + "SET NAME = ?,   "
                      + "LECTURER = ?,   "
                      + "DURATION = ?,   "
                      + "STUDENT_ID = ?  "
                      + "WHERE PK_ID = ? ";
    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setString(1, courseName);
      preparedStatement.setString(2, lecturerName);
      preparedStatement.setInt(3, duration);
      preparedStatement.setInt(4, studentId);
      preparedStatement.setInt(5, entity.getPk_id());
      preparedStatement.executeQuery();
      connection.commit();

      sqlCommand = "SELECT *       "
                 + "FROM COURSES   "
                 + "WHERE PK_ID = ?";

      preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, entity.getPk_id());
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        course.setPk_id(resultSet.getInt(1));
        course.setName(resultSet.getString(2));
        course.setLecturer(resultSet.getString(3));
        course.setDuration(resultSet.getInt(4));
      }

      sqlCommand = "SELECT *       "
                 + "FROM STUDENTS  "
                 + "WHERE PK_ID = ?";

      preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1,resultSet.getInt(5));
      resultSet = preparedStatement.executeQuery();

      if (resultSet.next()){
        student = new Student(resultSet.getString(2), studentGrade);
        student.setPk_id(resultSet.getInt(1));
      }
      course.setStudent(student);
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return course;
  }

  @Override
  public void delete(Course entity)
  {
    String sqlCommand = "DELETE FROM    "
                      + "COURSES        "
                      + "WHERE PK_ID = ?";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, entity.getPk_id());
      preparedStatement.executeQuery();
      connection.commit();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}