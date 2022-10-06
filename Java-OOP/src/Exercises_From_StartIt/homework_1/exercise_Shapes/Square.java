package Exercises_From_StartIt.homework_1.exercise_Shapes;

public class Square extends Rectangle{

  private int width;
  private int height;
  public Square(int width, int height) {
    super(width, height);
    this.width = width;
    this.height = height;
  }

  @Override
  public int getArea() {
    return width * height;
  }

  @Override
  public int getPerimeter() {
    return width * 2 + height * 2;
  }
}
