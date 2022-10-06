package student.model;

public class Student extends Course
{
     private int pk_id;
     private String name;
     private int grade;

     public Student() {

     }

     public Student(String name, int grade) {
          this.name = name;
          this.grade = grade;
     }

     public int getPk_id() {
          return pk_id;
     }

     public void setPk_id(int pk_id) {
          this.pk_id = pk_id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getGrade() {
          return grade;
     }

     public void setGrade(int grade) {
          this.grade = grade;
     }

     @Override
     public String toString() {
          return "| Student ID - " + pk_id + " | " +
                  "Name: " + name + " | " +
                  "Grade:" + grade + " | ";
     }
}
