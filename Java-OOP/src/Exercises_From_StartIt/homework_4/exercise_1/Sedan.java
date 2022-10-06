package Exercises_From_StartIt.homework_4.exercise_1;

public class Sedan extends Car {
    private double length;

  public Sedan(double speed, double regularPrice, String color, double length) {
    super(speed, regularPrice, color);
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getSalePrice(double regularPrice) {
    if (length > 6.5){
      regularPrice -= regularPrice * 0.05;
    }else {
      regularPrice -= regularPrice * 0.10;
    }
      return super.getSalePrice(regularPrice);
  }
}
