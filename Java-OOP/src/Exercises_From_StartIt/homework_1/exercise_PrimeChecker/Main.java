package Exercises_From_StartIt.homework_1.exercise_PrimeChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int number;

    PrimeChecker primeChecker = new PrimeChecker();
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      number = scanner.nextInt();
      numbers.add(number);
    }
    primeChecker.checkPrime(numbers);

  }

}
