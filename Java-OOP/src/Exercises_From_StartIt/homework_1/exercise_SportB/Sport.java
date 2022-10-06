package Exercises_From_StartIt.homework_1.exercise_SportB;

public class Sport {

  private String name;
  private int numberOfTeamMembers;

  public Sport() {

  }

  public Sport(String name, int numberOfTeamMembers) {
    this.name = name;
    this.numberOfTeamMembers = numberOfTeamMembers;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumberOfTeamMembers(int numberOfTeamMembers) {
    this.numberOfTeamMembers = numberOfTeamMembers;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfTeamMembers() {
    return numberOfTeamMembers;
  }
}
