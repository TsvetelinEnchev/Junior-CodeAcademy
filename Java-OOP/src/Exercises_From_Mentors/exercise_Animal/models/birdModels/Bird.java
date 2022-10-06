package Exercises_From_Mentors.exercise_Animal.models.birdModels;
import Exercises_From_Mentors.exercise_Animal.Animal;
public class Bird extends Animal {

  public void fly() {
    System.out.println("I am flying");
  }

  public void sing() {
    walk();
    fly();
    System.out.println("I am singing");
  }

}
