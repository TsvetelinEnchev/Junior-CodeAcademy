package Exercises_From_StartIt.homework_3.exercise_3;

public class Square extends Shape{
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  void getArea() {
    System.out.printf("Square`s area: %.2f cm.\n", side * side );
  }

  @Override
  void getPerimeter() {
    System.out.printf("Square`s perimeter: %.2f cm.\n", 4 * side);
  }
}
