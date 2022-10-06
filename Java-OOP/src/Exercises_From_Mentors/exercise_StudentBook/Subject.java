package Exercises_From_Mentors.exercise_StudentBook;

public class Subject{

  private String subjectName;
  private double grade;
  public Subject(String subjectName, double grade) {
    this.subjectName = subjectName;
    this.grade = grade;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
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
    final StringBuilder sb = new StringBuilder("\nПредмети: ");
    sb.append(subjectName)
        .append(" - ")
        .append(checkGradeSuffix(grade))
        .append(grade);
    return sb.toString();
  }

}
