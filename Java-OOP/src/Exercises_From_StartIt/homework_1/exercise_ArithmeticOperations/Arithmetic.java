package Exercises_From_StartIt.homework_1.exercise_ArithmeticOperations;

import java.util.Random;

public class Arithmetic {

  private int num1;
  private int num2;

  private int N;

  public Arithmetic() {
  }

  public Arithmetic(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public void add(int N) {
    Random random = new Random();
    int number = 0;
    for (int i = 0; i < N; i++) {
      number += random.nextInt();
    }
    System.out.println(number);
  }
}
