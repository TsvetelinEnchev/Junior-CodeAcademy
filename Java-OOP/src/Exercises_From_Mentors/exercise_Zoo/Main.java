package Exercises_From_Mentors.exercise_Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Animal> animals = new ArrayList<>();
    ZooKeeper zooKeeper = new ZooKeeper();
    String[] info;

    int numberOfAnimals = Integer.parseInt(input.next());
    for (int i = 0; i < numberOfAnimals; i++) {
      info = input.next().split(", ");
      String type = info[0];
      String name = info[1];
      double weight = Double.parseDouble(info[2]);

      switch (type) {
        case "Lion":
          Lion lion = new Lion();
          lion.setType(type);
          lion.setName(name);
          lion.setWeight(weight);
          animals.add(lion);
          break;
        case "Monkey":
          Monkey monkey = new Monkey();
          monkey.setType(type);
          monkey.setName(name);
          monkey.setWeight(weight);
          animals.add(monkey);
          break;
        case "Fox":
          Fox fox = new Fox();
          fox.setType(type);
          fox.setName(name);
          fox.setWeight(weight);
          animals.add(fox);
          break;
        default:
          System.out.println("No such animal! Please try again.");
      }

    }
    zooKeeper.setAnimalList(animals);
    String animalToFeed;
    do {
      animalToFeed = input.nextLine();
      for (Animal animal : animals) {

        if (animalToFeed.equalsIgnoreCase("Feed " + animal.getName())) {
          zooKeeper.feedAnimal(animal.getName());

        }
      }

    } while (!animalToFeed.equals("0"));
    for (Animal animal : animals) {
      animal.calWeight();
      System.out.println(animal);
    }
  }
}
