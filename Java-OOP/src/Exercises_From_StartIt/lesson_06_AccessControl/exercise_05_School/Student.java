package Exercises_From_StartIt.lesson_06_AccessControl.exercise_05_School;

public class Student {

  String lastName;
  String firstName;
  int age;
  int schoolClass;
  int countOfStudents = 0;

  public Student(String lastName, String firstName, int age, int schoolClass) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
    this.schoolClass = schoolClass;
    countOfStudents++;
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

 public void increaseAge(){
   age += 1;
   if (age <= 18){
     System.out.printf("%s %s вече е на %d години.\n", firstName , lastName, age);
   }else {
     System.out.printf("%s %s вече завърши!\n", firstName, lastName);
   }
 }

 public void increaseAge(int years){
   age += years;
   if (age <= 18){
     System.out.printf("%s %s вече е на %d години.\n", firstName , lastName, age);
   }else {
     System.out.printf("%s %s вече завърши!\n", firstName, lastName);
   }
 }

 public void goToNextClass(){
    if (schoolClass + 1 <= 12){
      System.out.printf("%s %s вече е в %d клас.\n", firstName , lastName, schoolClass + 1);
    }else {
      System.out.printf("%s %s вече завърши!\n", firstName, lastName);
    }
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
