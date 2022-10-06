package Exercises_From_StartIt.homework_3.exercise_3;

public class Circle extends Shape{
  private final double pi = Math.PI;
  private double r;

  public Circle(double r) {
    this.r = r;
  }

  public double getPi() {
    return pi;
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  void getArea() {
    System.out.printf("Circle`s area: %.2f cm.\n", pi * Math.pow(r, 2));
  }

  @Override
  void getPerimeter() {
    System.out.printf("Circle`s perimeter: %.2f cm.\n", 2 * pi * r);
  }
}
