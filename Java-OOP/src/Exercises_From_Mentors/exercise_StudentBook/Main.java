package Exercises_From_Mentors.exercise_StudentBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    fillStudentBookInfo(students);

    int input = 0;

    do {
      printMenu();
      System.out.println("Изберете опция.");
      input = Integer.parseInt(scanner.next());
        switch (input){
          case 1:
            System.out.println("Списък на всички ученици по азбучен ред.");
            sortStudentsByTheirNames(students);
            System.out.println(students);
            break;
          case 2:
            System.out.println("Списък на всички ученици разделени по възраст.");
            sortStudentsByTheirAges(students);
            break;
          case 3:
            System.out.println("Списък на всички ученици отпаднали от обучението.");
            List<Student> failedStudents = fillListOfFailedStudents(students);
            System.out.println(failedStudents);
            break;
          case 4:
            System.out.println("Списък на всички ученици завършили успешно.");
            List<Student> graduatedStudents = fillListOfGraduatedStudents(students);
            System.out.println(graduatedStudents);
            break;
          case 5:
            System.out.println("Списък на всички ученици с крайният им годишен успех.");
            printListWithAverageGrades(students);
            break;
          case 6:
            System.out.println("Стената на славата... ");
            printTop3Students(students);
            break;
          case 7:
            System.out.println("Довиждане...");
            break;
          default:
            System.out.println("Невалидна операция!");
            break;
        }

    } while (input != 7);
  }

  private static void sortStudentsByTheirAges(List<Student> students) {
    Comparator<Student> ascendingAgeSorter = Comparator.comparing(Student::getAge);
    students.sort(ascendingAgeSorter);
    System.out.println(students);
  }

  private static void printTop3Students(List<Student> students) {

    Comparator<Student> highestGradeSorter = Comparator.comparing(Student::getAverigeGrade).reversed();
    Comparator<Student> firstNameSorter = Comparator.comparing(Student::getFirstName);
    Comparator<Student> lastNameSorter = Comparator.comparing(Student::getLastName);
    Comparator<Student> fullNameSorter = firstNameSorter.thenComparing(lastNameSorter);
    Comparator<Student> sortedFromGreatestStudents = highestGradeSorter.thenComparing(fullNameSorter);
    students.sort(sortedFromGreatestStudents);

    System.out.println("На 1-во място с няй-добър успех се нарежда: \n"
        +"Име: " + students.get(0).getFirstName() + " " + students.get(0).getLastName() + ".\n"
    +"с успех: " + students.get(0).getAverigeGrade() + ".\n");
    System.out.println("На 2-ро място с няй-добър успех се нарежда: \n"
        +"Име: " + students.get(1).getFirstName() + " " + students.get(1).getLastName() + ".\n"
        +"с успех: " + students.get(1).getAverigeGrade() + ".\n");
    System.out.println("На 3-то място с няй-добър успех се нарежда: \n"
        +"Име: " + students.get(2).getFirstName() + " " + students.get(2).getLastName() + ".\n"
        +"с успех: " + students.get(2).getAverigeGrade() + ".\n");

  }

  private static void printListWithAverageGrades(List<Student> students) {
    List<String> studentAverigeGrade = new ArrayList<>();
    Subject subject;
    for (Student student : students) {
      studentAverigeGrade.add("Име: " + student.getFirstName() + " " + student.getLastName() + ".\n"
          + "Възраст: " + student.getAge() + "г.\n"
          +"годишен успех: "+ student.checkGradeSuffix(student.getAverigeGrade()) + student.getAverigeGrade() + "\n");
    }
    System.out.println(studentAverigeGrade);
  }

  private static void printMenu() {
    System.out.println("Изберете опция от помощното меню!");
    System.out.println("За да видите учениците и техните оценки натиснете 1.");
    System.out.println("За да видите учениците разделени по възраст натиснете 2.");
    System.out.println("За да видите отпадналите ученици натиснете 3.");
    System.out.println("За да видите завършилите ученици натиснете 4.");
    System.out.println("За да видите средният успех на учениците натиснете 5.");
    System.out.println("За да видите наградените по успех натиснете 6.");
    System.out.println("За да излезете от менюто натиснете 7.");
  }

  private static List<Student> sortStudentsByTheirNames(List<Student> students) {
    Comparator<Student> firstNameSorter = Comparator.comparing(Student::getFirstName);
    Comparator<Student> lastNameSorter = Comparator.comparing(Student::getLastName);
    Comparator<Student> fullNameSorter = firstNameSorter.thenComparing(lastNameSorter);
    students.sort(fullNameSorter);
    return students;
  }

  private static List<Student> fillListOfGraduatedStudents(List<Student> students) {

    List<Student> listOfGraduatedStudents = new ArrayList<>();
    for (Student student : students) {
      if (!checkForBadGradeInEachStudentBook(student)) {
        listOfGraduatedStudents.add(student);
      }
    }

    return listOfGraduatedStudents;
  }


  private static List<Student> fillListOfFailedStudents(List<Student> students) {
    List<Student> listOfShame = new ArrayList<>();
    for (Student student : students) {
      if (checkForBadGradeInEachStudentBook(student)) {
        listOfShame.add(student);
      }
    }

    return listOfShame;
  }

  private static boolean checkForBadGradeInEachStudentBook(Student student) {
    for (Subject subject : student.getSubjectList()) {
      if (subject.getGrade() == 2) {
        return true;
      }
    }
    return false;
  }

  private static List<Student> fillStudentBookInfo(List<Student> students) {

    Student student = new Student("Анна-Мария", "Иванова", 14);
    students.add(student);

    List<Subject> subjectList = new ArrayList<>();
    Subject subject1 = new Subject("Математика", 5);
    subjectList.add(subject1);
    Subject subject2 = new Subject("Български", 5);
    subjectList.add(subject2);
    Subject subject3 = new Subject("Английски", 6);
    subjectList.add(subject3);
    Subject subject4 = new Subject("Химия", 6);
    subjectList.add(subject4);
    Subject subject5 = new Subject("Биология", 5);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Боян", "Михайловски", 15);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 5);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 5);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 4);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 6);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 4);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Боян", "Митовски", 14);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 3);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 4);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 5);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 5);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 4);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Гергана", "Спасова", 13);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 4);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 6);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 6);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 5);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 5);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Георги", "Борисов", 16);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 3);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 3);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 2);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 2);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 3);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Михаела", "Цанкова", 14);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 5);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 5);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 6);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 6);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 5);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Янислава", "Хаджиева", 14);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 5);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 5);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 6);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 6);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 6);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Мария", "Атанасова", 15);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 3);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 3);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 2);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 3);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 2);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Камелия", "Пейкова", 14);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 5);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 5);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 5);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 5);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 5);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    student = new Student("Константин", "Коцев", 17);
    students.add(student);

    subjectList = new ArrayList<>();
    subject1 = new Subject("Математика", 2);
    subjectList.add(subject1);
    subject2 = new Subject("Български", 2);
    subjectList.add(subject2);
    subject3 = new Subject("Английски", 2);
    subjectList.add(subject3);
    subject4 = new Subject("Химия", 2);
    subjectList.add(subject4);
    subject5 = new Subject("Биология", 2);
    subjectList.add(subject5);
    student.setSubjectList(subjectList);

    return students;
  }

}
