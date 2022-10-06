package Exercises_From_StartIt.Homework_6.exercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_1b_Set {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Въведете числа на един ред разделени със запетая!");
    Set<Integer> setOfNumbers = fillSetOfNumbers();

    System.out.printf("Броят на числата в списъка е: %d\n", setOfNumbers.size());

    printUnsortedSet(setOfNumbers);
    printSortedSet(setOfNumbers);

    addingNewElementInTheSet(setOfNumbers);
    System.out.println(setOfNumbers);
    Set<Integer> reversedSet = reverseSet(setOfNumbers);

    //Направих два метода с две различни решения, защото не разбрах точно условието на задачата.

    //Първото решение сравнява първият списък със списъкът от обратно сортираните числа.
    checkNumbersIsItGreater(setOfNumbers, reversedSet);

    //Второто решение сравнява първият списък с новосъздаден списък.
    //Подканвам потребителя да въведе същият брой числа като в първият списък,
    //за да няма грешки след това в сравняването на двата списъка.
    System.out.printf("Въведете %d числа на един ред разделени със запетая!\n", setOfNumbers.size());
    Set<Integer> secondSetOfNumbers = fillSetOfNumbers();

    checkNumbersIsItGreater(setOfNumbers, secondSetOfNumbers);
  }
  private static void checkNumbersIsItGreater(Set<Integer> firstSet, Set<Integer> secondSet) {

    Iterator<Integer> firstSetIterator = firstSet.iterator();
    Iterator<Integer> secondSetIterator = secondSet.iterator();

    while (firstSetIterator.hasNext()) {

      int firstSetElement = firstSetIterator.next();
      int secondSetElement = secondSetIterator.next();

      if (firstSetElement == secondSetElement) {
        System.out.printf("Елемент %d от списък 1 е равен с елемент %d от списък 2.\n",
            firstSetElement, secondSetElement);
      } else if (firstSetElement > secondSetElement) {
        System.out.printf("Елемент %d от списък 1 е по-голям от елемент %d от списък 2.\n",
            firstSetElement, secondSetElement);
      } else {
        System.out.printf("Елемент %d от списък 1 е по-малък от елемент %d от списък 2.\n",
            firstSetElement,secondSetElement);
      }
    }
  }
  private static Set<Integer> reverseSet(Set<Integer> setOfNumbers) {
    TreeSet<Integer> treeSet = new TreeSet<>(setOfNumbers);
    return treeSet.descendingSet();
  }

  private static void addingNewElementInTheSet(Set<Integer> set) {
    System.out.println("Добавете ново число.");

    boolean added = false;

    do {
      int newElement = Integer.parseInt(scanner.next());

      if (set.add(newElement)) {
        set.add(newElement);
        added = true;
      } else {
        System.out.println("Такъв запис вече съществува и не може да бъде добавен повторно.\n"
        + "Опитай отново!");
      }
    }
    while (!added);
  }

  private static void printSortedSet(Set<Integer> set) {
    System.out.println("Елементите в сисъка сортирани: " + set);
  }

  private static void printUnsortedSet(Set<Integer> set) {
    List<Integer> listOfUnsortedNumbers = new ArrayList<>(set);
    Collections.shuffle(listOfUnsortedNumbers);

    System.out.println("Елементите в сисъка несортирани: " + listOfUnsortedNumbers);
  }

  private static Set<Integer> fillSetOfNumbers() {

    String input = scanner.next();
    String[] inputValues = input.split(",");

    Set<Integer> set = new HashSet<>();

    for (String element : inputValues) {
      set.add(Integer.valueOf(element));
    }

    return set;
  }

}


