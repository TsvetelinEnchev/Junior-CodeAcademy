package Exercises_From_StartIt.homework_4.exercise_2;

public class Circle implements GeometricObject {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }


  @Override
  public String toString() {
    return "Circle`s area: " + getArea() + " cm.\n"
        + " Circle`s perimeter: " + getPerimeter() + " cm.\n";
  }

  @Override
  public double getArea() {
    return Math.round(Math.PI * Math.pow(radius, 2));
  }

  @Override
  public double getPerimeter() {
    return Math.round(2 * Math.PI * radius);
  }
}
