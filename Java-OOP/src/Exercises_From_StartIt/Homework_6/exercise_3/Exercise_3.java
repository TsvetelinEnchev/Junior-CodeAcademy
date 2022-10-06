package Exercises_From_StartIt.Homework_6.exercise_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise_3 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Попълнете списък 1: ");
    List<String> firstList = fillListWithInfo();

    System.out.println("Попълнете списък 2: ");
    List<String> secondList = fillListWithInfo();

    sortTheLists(firstList,secondList);

    List<String> thirdList = joinTwoLists(firstList, secondList);

    deleteDuplicateElements(thirdList);

    System.out.println("This is the list after all changes: \n" + thirdList);
  }

  private static void deleteDuplicateElements(List<String> thirdList) {
    Set<String> set = new HashSet<>(thirdList);
    thirdList.clear();
    thirdList.addAll(set);
  }

  private static List<String> joinTwoLists(List<String> firstList, List<String> secondList) {
    List<String> list = new ArrayList<>();

    list.addAll(firstList);
    list.addAll(secondList);

    return list;
  }

  private static void sortTheLists(List<String> firstList, List<String> secondList) {
    Collections.sort(firstList);
    Collections.sort(secondList);
  }

  private static List<String> fillListWithInfo() {

    String input = scanner.nextLine();
    String[] inputValues = input.split(" ");

    List<String> list = new ArrayList<>();
    Collections.addAll(list, inputValues);

    return list;
  }

}
