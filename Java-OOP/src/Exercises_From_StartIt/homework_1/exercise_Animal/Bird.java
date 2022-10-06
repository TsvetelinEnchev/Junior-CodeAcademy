package Exercises_From_StartIt.homework_1.exercise_Animal;

public class Bird extends Animal {
    public void fly(){
      System.out.println("I am flying");
    }

    public void sing(){
      walk();
      fly();
      System.out.println("I am singing");
    }
}
