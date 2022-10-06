package Exercises_From_StartIt.homework_1.exercise_Shapes;

public class TestShapes {

  public static void main(String[] args) {
    Square square = new Square(2, 2);
    Rectangle rectangle = new Rectangle(3, 4);

    System.out.println(rectangle.getArea());
    System.out.println(rectangle.getPerimeter());

    System.out.println(square.getArea());
    System.out.println(square.getPerimeter());
  }
}
