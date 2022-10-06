package Exercises_From_Mentors.exercise_Animal.models.enums;

public enum AnimalType {
  MAMMAL("Mammal"), BIRD("Bird");
 private String type;
  AnimalType(String type) {
    this.type = type;
  }
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
