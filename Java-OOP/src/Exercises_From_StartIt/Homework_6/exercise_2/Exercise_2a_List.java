package Exercises_From_StartIt.Homework_6.exercise_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_2a_List {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Попълнете списък 1: ");
    ArrayList<String> firstList = fillListWithInfo();
    System.out.println("Попълнете списък2: ");
    ArrayList<String> secondList = fillListWithInfo();

    ArrayList<String> unionList = union(firstList, secondList);
    System.out.println("След обидиняване: " + unionList);

    ArrayList<String> intersectList = intersection(firstList, secondList);
    System.out.println("След направено сечение: " + intersectList);
  }
  private static ArrayList<String> intersection(ArrayList<String> firstList, ArrayList<String> secondList) {
    Set<String> set = new HashSet<>(firstList);

    set.retainAll(secondList);

    return new ArrayList<>(set);
  }

  private static ArrayList<String> union(ArrayList<String> firstList, ArrayList<String> secondList) {
    Set<String> set = new HashSet<>();

    set.addAll(firstList);
    set.addAll(secondList);

    return new ArrayList<>(set);
  }
  private static ArrayList<String> fillListWithInfo() {
    String input = scanner.nextLine();
    String[] inputValues = input.split(" ");

    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, inputValues);

    return list;
  }
}
