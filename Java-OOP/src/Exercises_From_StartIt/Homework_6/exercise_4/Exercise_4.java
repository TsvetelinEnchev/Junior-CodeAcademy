package Exercises_From_StartIt.Homework_6.exercise_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_4 {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Въведете списък с числа на един ред, разделени с интервал!");

    List<Integer> listOfNumbers = fillListFromConsole();

    for (int i = 0; i <= listOfNumbers.size(); i++) {
      for (int j = i + 1; j < listOfNumbers.size(); j++) {

        int max = getMax(listOfNumbers, i, j);

        int Ai = listOfNumbers.get(i), Aj = listOfNumbers.get(j);

        if (Ai * Aj <= max) {
          System.out.printf("(%d, %d)", i + 1, j + 1);
        }
      }
    }

  }

  private static Integer getMax(List<Integer> list, int currentIndex, int boundIndex) {
    int maxValue = list.get(currentIndex);

    for (int i = currentIndex + 1; i <= boundIndex; i++) {
      int value = list.get(i);

      if (maxValue < value) {
        maxValue = value;
      }
    }

    return maxValue;
  }

  private static List<Integer> fillListFromConsole() {
    String input = scanner.nextLine();
    String[] inputValues = input.split(" ");

    List<Integer> list = new ArrayList<>();

    for (String element : inputValues) {
      list.add(Integer.valueOf(element));
    }

    return list;
  }

}
