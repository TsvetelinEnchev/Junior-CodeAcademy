package Exercises_From_StartIt.homework_4.exercise_2;

public class Rectangle implements GeometricObject {
  private double width;
  private double length;

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "Rectangle`s area: " + getArea() + " cm.\n" +
        "Rectangle`s perimeter: " + getPerimeter() + " cm.\n";
  }

  @Override
  public double getArea() {
    return Math.round(width * length);
  }

  @Override
  public double getPerimeter() {
    return Math.round(width * 2 + length * 2);
  }
}
