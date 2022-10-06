package Exercises_From_StartIt.homework_1.exercise_CarFactory;

public class Engine {

  private int power;
  private double volume;
  private String type;

  public Engine(int power, double volume, String type) {
    this.power = power;
    this.volume = volume;
    this.type = type;
  }

  public double getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
