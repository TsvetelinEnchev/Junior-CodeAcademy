package Exercises_From_StartIt.Homework_6.exercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise_1a_List {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Въведете числа на един ред разделени със запетая!");
    List<Integer> listOfNumbers = fillListOfNumbers();

    System.out.printf("Броят на числата в списъка е: %d\n", listOfNumbers.size());

    printAscendingSortedList(listOfNumbers);

    List<Integer> reversedListOfNumbers = reverseList(listOfNumbers);

    //Направих два метода с две различни решения, защото не разбрах точно условието на задачата.

    //Първото решение сравнява първият списък със списъкът от обратно сортираните числа.
    checkNumbersIsItGreater(listOfNumbers, reversedListOfNumbers);

    //Второто решение сравнява първият списък с новосъздаден списък.
    //Подканвам потребителя да въведе същият брой числа като в първият списък,
    //за да няма грешки след това в сравняването на двата списъка.
    System.out.printf("Въведете %d числа на един ред разделени със запетая!\n", listOfNumbers.size());
    List<Integer> secondListOfNumbers = fillListOfNumbers();

    checkNumbersIsItGreater(listOfNumbers, secondListOfNumbers);
  }

  private static void checkNumbersIsItGreater(List<Integer> firstList, List<Integer> secondList) {

    for (int i = 0; i < firstList.size(); i++) {
      int elementOfFirstList = firstList.get(i);
      int elementOfSecondList = secondList.get(i);

      if (elementOfFirstList == elementOfSecondList) {
        System.out.printf("Елемент %d от списък 1 е равен с елемент %d от списък 2.\n",
            elementOfFirstList, elementOfSecondList);
      } else if (elementOfFirstList > elementOfSecondList) {
        System.out.printf("Елемент %d от списък 1 е по-голям от елемент %d от списък 2.\n",
            elementOfFirstList, elementOfSecondList);
      } else {
        System.out.printf("Елемент %d от списък 1 е по-малък от елемент %d от списък 2.\n",
            elementOfFirstList, elementOfSecondList);
      }
    }
  }

  private static List<Integer> reverseList(List<Integer> listOfNumbers) {
    List<Integer> list = new ArrayList<>(listOfNumbers);
    Collections.reverse(list);

    return list;
  }

  private static void printAscendingSortedList(List<Integer> listOfNumbers) {
    Collections.sort(listOfNumbers);

    System.out.println("Списъкът с числа сортирани възходящо: " + listOfNumbers);
  }

  private static List<Integer> fillListOfNumbers() {

    String input = scanner.next();
    String[] inputValues = input.split(",");

    List<Integer> list = new ArrayList<>();

    for (String element : inputValues) {
      list.add(Integer.valueOf(element));
    }

    return list;
  }

}
