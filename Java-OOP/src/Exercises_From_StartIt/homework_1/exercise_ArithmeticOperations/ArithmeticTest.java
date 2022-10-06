package Exercises_From_StartIt.homework_1.exercise_ArithmeticOperations;

import java.util.Scanner;

public class ArithmeticTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Arithmetic arithmetic = new Adder(2, 5);

    System.out.println(arithmetic.getClass());
    System.out.println(arithmetic.getClass().getSuperclass());

    arithmetic.add(5);
  }
}
