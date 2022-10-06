package Exercises_From_Mentors.exercise_Animal_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{

  public static void main(String[] args)
  {
    Animal seagull = new Seagull();
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal pigeon = new Pigeon();
    Animal parrot = new Parrot();
    List<Animal> animals = new LinkedList<>();
    animals.add(dog);
    animals.add(cat);
    animals.add(seagull);
    animals.add(parrot);
    animals.add(pigeon);
    Petshop petshop = new Petshop();
    petshop.setAnimals(animals);

    petshop.printCatalogue(AnimalType.BIRD);
    petshop.printCatalogue(AnimalType.MAMMAL);

    String animalTypeUserInput;
    Scanner scanner = new Scanner(System.in);

    System.out.println("BIRD / MAMMAL");
    animalTypeUserInput = scanner.nextLine();

    if (animalTypeUserInput.equalsIgnoreCase(String.valueOf(AnimalType.BIRD)) ||
        animalTypeUserInput.equalsIgnoreCase(String.valueOf(AnimalType.MAMMAL))) {

      petshop.printCatalogue(AnimalType.valueOf(animalTypeUserInput.toUpperCase()));

      List<Animal> animalListFiltered = animals
          .stream()
          .filter(animal -> animal.getAnimalType().equals(AnimalType.valueOf(animalTypeUserInput.toUpperCase())))
          .collect(Collectors.toList());

      String userInputNumInCatalogue;
      int userChoice;

      System.out.println("Please select a number from the catalogue: ");

      userInputNumInCatalogue = scanner.nextLine();
      List<String> elements = Arrays.stream(userInputNumInCatalogue.split("\\.")).collect(Collectors.toList());

      userChoice = Integer.parseInt(elements.get(elements.size() - 1));

      if (userChoice <= animalListFiltered.size()) {

        if (animalListFiltered.get(userChoice - 1) instanceof Bird) {
          System.out.println(animalListFiltered.get(userChoice - 1));
          ((Bird) animalListFiltered.get(userChoice - 1)).sing();

        }
        if (animalListFiltered.get(userChoice - 1) instanceof Dog) {
          System.out.println(animalListFiltered.get(userChoice - 1));
          ((Dog) animalListFiltered.get(userChoice - 1)).bark();
        }
        if (animalListFiltered.get(userChoice - 1) instanceof Cat) {
          System.out.println(animalListFiltered.get(userChoice - 1));
          ((Cat) animalListFiltered.get(userChoice - 1)).meow();
        }
      }
    }

  }

}
