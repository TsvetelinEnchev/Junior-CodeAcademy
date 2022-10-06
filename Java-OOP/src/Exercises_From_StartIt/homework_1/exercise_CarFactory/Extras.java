package Exercises_From_StartIt.homework_1.exercise_CarFactory;

public enum Extras {
  AIR_CONDITION(1500, "Air_condition"),
  NAVIGATION(500, "Navigation"),
  CRUISE_CONTROL(350, "Cruise_control"),
  AUTOMATIC(3000, "Automatic"),
  ELECTRIC_WINDOWS(250, "Electric_windows");
  private double price;
  private String name;
  Extras(double price,String name) {
    this.price = price;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


}
