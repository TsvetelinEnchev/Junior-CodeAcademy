package Exercises_From_StartIt.homework_4.exercise_2;

public class Main {

  public static void main(String[] args) {
    GeometricObject circle = new Circle(5.7);
    GeometricObject rectangle = new Rectangle(5 ,7);

    System.out.println(circle);
    System.out.println(rectangle);

    ResizableCircle resizableCircle = new ResizableCircle(5.8);
    System.out.println("Before resizing: ");
    System.out.println(resizableCircle);

    resizableCircle.resize(5);

    System.out.println("After resizing: ");
    System.out.println(resizableCircle);


  }
}
