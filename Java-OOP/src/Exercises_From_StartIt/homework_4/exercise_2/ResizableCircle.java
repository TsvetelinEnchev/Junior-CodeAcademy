package Exercises_From_StartIt.homework_4.exercise_2;

public class ResizableCircle extends Circle implements Resizable{

  public ResizableCircle(double radius) {
    super(radius);
  }

  @Override
  public String toString() {
    return "Circle`s area: " + getArea() + " cm.\n"
        + " Circle`s perimeter: " + getPerimeter() + " cm.\n";
  }

  @Override
  public double resize(int percent) {
    super.setRadius(super.getRadius() + percent);
    return super.getRadius();
  }

  @Override
  public double getArea() {
    return Math.round(Math.PI * Math.pow(super.getRadius(), 2));
  }

  @Override
  public double getPerimeter() {

    return Math.round(2 * Math.PI * super.getRadius());
  }
}
