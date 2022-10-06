package Exercises_From_StartIt.homework_2;

import Exercises_From_StartIt.homework_2.models.enums.AnimalType;

public class PetShop {
  public void printCatalogue(String type){

    if (AnimalType.BIRD.getType().equalsIgnoreCase(type)){
      System.out.println("1. Birds:");
      System.out.println("  1.1. Pigeon");
      System.out.println("  1.2. Parrot");
      System.out.println("  1.3. Seagull");
    }else if (AnimalType.MAMMAL.getType().equalsIgnoreCase(type)){
      System.out.println("2. Mammal:");
      System.out.println("  2.1. Dog");
      System.out.println("  2.2. Cat");
    }else{
      System.out.println("Invalid catalogue!");
    }
  }
}
