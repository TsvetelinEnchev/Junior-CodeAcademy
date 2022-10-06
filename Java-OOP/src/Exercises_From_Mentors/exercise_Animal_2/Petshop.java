package Exercises_From_Mentors.exercise_Animal_2;

import java.util.List;

public class Petshop
{

  static final int countAnimalsInSection = 1;
  static       int countSections         = 1;
  int catalogueSection;
  int numInCatalogue;
  private List<Animal> animals;

  public Petshop()
  {
    this.catalogueSection = getCountSections();
    this.numInCatalogue = getCountAnimalsInSection();
  }

  public static int getCountSections()
  {
    return countSections;
  }

  public static int getCountAnimalsInSection()
  {
    return countAnimalsInSection;
  }

  public int getCatalogueSection()
  {
    return catalogueSection;
  }

  public int getNumInCatalogue()
  {
    return numInCatalogue;
  }

  public void printCatalogue()
  {
    System.out.println("1. Birds: ");
    int counter = 1;
    for (Animal animal : animals
    ) {
      if (animal instanceof Bird) {
        System.out.println(" " + "1." + counter + " " + animal);
        counter++;
        animals.indexOf(animal);
        animals.get(1);
      }
    }
    System.out.println("2. Mammal:");
    counter = 1;
    for (Animal animal : animals
    ) {
      if (animal instanceof Mammal) {
        System.out.println(" " + "2. " + counter + " " + animal);
        counter++;
      }
    }
  }

  public List<Animal> getAnimals()
  {
    return animals;
  }

  public void setAnimals(List<Animal> animals)
  {
    this.animals = animals;
  }

  public void printCatalogue(AnimalType animalType)
  {
    System.out.println(getCatalogueSection() + ". " + animalType);

    for (Animal animal : animals) {
      if (animalType.equals(animal.getAnimalType())) {

        String section = getCatalogueSection() + "." + getNumInCatalogue() + ". ";
        String className = animal.getClass().getName();

        System.out.println(" " + section + className.substring(className.lastIndexOf(".") + 1));
        this.numInCatalogue++;
      }
    }
    this.numInCatalogue = countAnimalsInSection; //Back to to start value
    this.catalogueSection++; //Increment after call

  }
// TODO: Implement when you learn :))))

//  public Map<String, String> printCatalogue2(AnimalType animalType)
//  {
//    Map<String, String> mapOfTheAnimals = new HashMap<>();
//
//    for (Animal animal : animals) {
//      if (animalType.equals(animal.getAnimalType())) {
//
//        String className = animal.getClass().getName();
//        mapOfTheAnimals.put(getCatalogueSection() + "." + getNumInCatalogue() + ". ", className.substring(className.lastIndexOf(".") + 1));
//        this.numInCatalogue++;
//      }
//    }
//    this.numInCatalogue = countAnimalsInSection;
//    this.catalogueSection++;
//    return mapOfTheAnimals;
//  }
}



