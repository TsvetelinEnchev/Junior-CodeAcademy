package Exercises_From_Mentors.exercise_Zoo;

public class Animal {

  private String type;
  private String name;
  private double weight;


  public Animal() {
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void calWeight() {
  }

  public void eat() {
  }

  @Override
  public String toString() {
    return "Name: " + name + '\n' +
        "Weight: " + weight + "kg";

  }
}
