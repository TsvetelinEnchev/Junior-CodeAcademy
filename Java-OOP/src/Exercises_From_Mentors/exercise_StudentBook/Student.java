package Exercises_From_Mentors.exercise_StudentBook;

import java.util.List;

public class Student {

  private String firstName;
  private String lastName;
  private int age;
  private List<Subject> subjectList;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    List<Subject> subjectList;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Subject> getSubjectList() {
    return subjectList;
  }

  public void setSubjectList(List<Subject> subjectList) {
    this.subjectList = subjectList;
  }

  public double getAverigeGrade(){
    double averigeGrade = 0;
    double countOfSubjects = 0;
    for (Subject subject : subjectList) {
      averigeGrade += subject.getGrade();
      countOfSubjects++;
    }
    double result = averigeGrade / countOfSubjects;
    return result;
  }
  public String checkGradeSuffix(double grade) {
    if (grade <= 2.5){
      return "Слаб ";
    }else if (grade > 2.5 && grade <= 3.5){
      return "Среден ";
    }else if (grade > 3.5 && grade <= 4.5){
      return "Добър ";
    }else if (grade > 4.5 && grade <= 5.5){
      return "Мн.добър ";
    }else
      return "Отличен ";
  }


  @Override
  public String toString() {
    return "\nИме и фамилия: " + firstName + " " + lastName
        + "\n" + "Възраст: " + age + "г."
        + "\n" + "Годишни оценки: "
        + "\n"+ subjectList + "\n";
  }

}
