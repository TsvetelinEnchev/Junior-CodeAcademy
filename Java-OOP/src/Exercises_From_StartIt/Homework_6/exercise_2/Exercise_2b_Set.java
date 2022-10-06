package Exercises_From_StartIt.Homework_6.exercise_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_2b_Set {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Попълнете списък 1: ");
    Set<String> firstSet = fillTheSet();
    System.out.println("Попълнете списък 2: ");
    Set<String> secondSet = fillTheSet();

    Set<String> unionSet = union(firstSet, secondSet);
    System.out.println("След обидиняване: " + unionSet);

    Set<String> intersectSet = intersection(firstSet,secondSet);
    System.out.println("След направено сечение: " + intersectSet);

  }

  private static Set<String> intersection(Set<String> firstSet, Set<String> secondSet) {
    Set<String> set = new HashSet<>(firstSet);
    set.retainAll(secondSet);

    return set;
  }

  private static Set<String> union(Set<String> firstSet, Set<String> secondSet) {
    Set<String> set = new HashSet<>();

    set.addAll(firstSet);
    set.addAll(secondSet);

    return set;
  }

  private static Set<String> fillTheSet() {

    String input = scanner.nextLine();
    String[] inputValues = input.split(" ");

    Set<String> set = new HashSet<>();
    Collections.addAll(set, inputValues);

    return set;
  }
}

