package Exercises_From_StartIt.homework_2;

import Exercises_From_Mentors.exercise_Animal.models.birdModels.Parrot;
import Exercises_From_Mentors.exercise_Animal.models.birdModels.Pigeon;
import Exercises_From_Mentors.exercise_Animal.models.birdModels.Seagull;
import Exercises_From_Mentors.exercise_Animal.models.enums.AnimalType;
import Exercises_From_StartIt.homework_2.models.mammalModels.Cat;
import Exercises_From_StartIt.homework_2.models.mammalModels.Dog;
import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    PetShop petShop = new PetShop();

    System.out.println("In our pet shop we have birds and mammals.");
    System.out.println("Select bird ot mammal to see their catalog.");

    String animal = scanner.next();
    animal = validateAnimal(animal);

    petShop.printCatalogue(animal);

    System.out.println("Now select the number you saw in front of your pet choice.");
    System.out.println("For example: 1, 2...etc.");

    int numOfCurrentAnimal = Integer.parseInt(scanner.next());
    numOfCurrentAnimal = validateCurrentAnimal(numOfCurrentAnimal, animal);

    printMethodOfTheSelectedAnimal(numOfCurrentAnimal, animal);
  }
  private static String validateAnimal(String animal) {
    while (!animal.equalsIgnoreCase(AnimalType.BIRD.getType()) &&
        !animal.equalsIgnoreCase(AnimalType.MAMMAL.getType())) {

      System.out.println("Invalid type of animal!");
      System.out.println("Please enter bird or mammal.");

      animal = scanner.next();
    }
    return animal;
  }
  private static int validateCurrentAnimal(int numOfCurrentAnimal, String animal) {

    if (animal.equalsIgnoreCase(AnimalType.BIRD.getType())) {
      while (numOfCurrentAnimal < 1 || numOfCurrentAnimal > 3) {
          System.out.println("Invalid pet! Please try again.");
          numOfCurrentAnimal = Integer.parseInt(scanner.next());
      }
    }
    if (animal.equalsIgnoreCase(AnimalType.MAMMAL.getType())) {
      while (numOfCurrentAnimal < 1 || numOfCurrentAnimal > 2) {
        System.out.println("Invalid pet! Please try again.");
        numOfCurrentAnimal = Integer.parseInt(scanner.next());
      }
    }
    return numOfCurrentAnimal;
  }

  private static void printMethodOfTheSelectedAnimal(int numOfCurrentAnimal, String animal) {

    if (animal.equalsIgnoreCase(AnimalType.BIRD.getType())) {
      if (numOfCurrentAnimal == 1) {
        Pigeon pigeon = new Pigeon();
        pigeon.sing();
      } else if (numOfCurrentAnimal == 2) {
        Parrot parrot = new Parrot();
        parrot.sing();
      } else if (numOfCurrentAnimal == 3) {
        Seagull seagull = new Seagull();
        seagull.sing();
      }
    } else {
      if (numOfCurrentAnimal == 1) {
        Dog dog = new Dog();
        dog.bark();
      } else if (numOfCurrentAnimal == 2) {
        Cat cat = new Cat();
        cat.meow();
      }
    }
  }
}
