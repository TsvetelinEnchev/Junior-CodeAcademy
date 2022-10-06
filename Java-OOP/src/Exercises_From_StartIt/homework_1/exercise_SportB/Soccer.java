package Exercises_From_StartIt.homework_1.exercise_SportB;

public class Soccer extends Sport {

  private String name;
  private int numberOfTeamMembers;

  public Soccer() {
    super();

  }

  public Soccer(String name, int numberOfTeamMembers) {
    super(name, numberOfTeamMembers);
    this.name = name;
    this.numberOfTeamMembers = numberOfTeamMembers;
  }

  @Override
  public String getName() {
    return "Soccer";
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getNumberOfTeamMembers() {
    return 11;
  }

  public void setNumberOfTeamMembers(int numberOfTeamMembers) {
    this.numberOfTeamMembers = numberOfTeamMembers;
  }
}
