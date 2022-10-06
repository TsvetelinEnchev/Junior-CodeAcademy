package Exercises_From_StartIt.homework_1.exercise_SportB;

public class SportTest {

  public static void main(String[] args) {
    Sport soccer = new Soccer();
    Sport sport = new Sport();

    System.out.println(soccer.getName());
    System.out.println(soccer.getNumberOfTeamMembers());
    System.out.println(soccer.getClass());
    System.out.println(soccer.getClass().getSuperclass());

    System.out.println(sport.getName());
    System.out.println(sport.getNumberOfTeamMembers());
    System.out.println(sport.getClass());
    System.out.println(sport.getClass().getSuperclass());
  }

}
