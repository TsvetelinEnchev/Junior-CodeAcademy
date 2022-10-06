package Exercises_From_Mentors.exercise_Animal_2;

public class Mammal extends Animal
{

  public Mammal()
  {
    super.animalType = AnimalType.MAMMAL;
  }

  @Override
  public String toString()
  {
    return "Mammal{}";
  }
}
