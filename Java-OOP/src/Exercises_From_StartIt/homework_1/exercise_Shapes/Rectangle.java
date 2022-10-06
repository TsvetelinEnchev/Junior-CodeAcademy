package Exercises_From_StartIt.homework_1.exercise_Shapes;

public class Rectangle extends Shape {
      private int width;
      private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
            return width;
      }

      public void setWidth(int width) {
            this.width = width;
      }

      public int getHeight() {
            return height;
      }

      public void setHeight(int height) {
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
