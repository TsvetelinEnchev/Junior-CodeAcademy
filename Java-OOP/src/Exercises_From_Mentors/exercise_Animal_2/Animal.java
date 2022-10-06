package Exercises_From_Mentors.exercise_Animal_2;

public class Animal
{

  protected AnimalType animalType;

  public Animal()
  {
  }

  public AnimalType getAnimalType()
  {
    return animalType;
  }

  public void walk()
  {
    System.out.println("I am walking");
  }

  @Override
  public String toString()
  {
    return "Animal{}";
  }
}

