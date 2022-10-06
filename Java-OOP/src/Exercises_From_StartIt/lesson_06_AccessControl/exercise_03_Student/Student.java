package Exercises_From_StartIt.lesson_06_AccessControl.exercise_03_Student;

public class Student {

  String lastName;
  String firstName;
  int age;
  int schoolClass;

  public Student(String lastName, String firstName, int age, int schoolClass) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
    this.schoolClass = schoolClass;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSchoolClass() {
    return schoolClass;
  }

  public void setSchoolClass(int schoolClass) {
    this.schoolClass = schoolClass;
  }

  @Override
  public String toString() {
    String fullName = firstName + " " + lastName;
    StringBuilder sb = new StringBuilder("Ученика ");
    sb.append(fullName).append(" е на ").append(age)
        .append(" години и учи в ")
        .append(schoolClass).append(" клас.");
    return sb.toString();
  }
}
