package Exercises_From_Mentors.exercise_Zoo;

public class Lion extends Animal {

  private int fed = 0;
  private String weight;
  private String time;

  public int getFed() {
    return fed;
  }

  @Override
  public void eat() {

    fed++;
  }

  public void calWeight() {
    if (fed > 3) {
      setWeight(getWeight() + 3);
      this.weight = "gained weight";
    } else if (fed < 3) {
      setWeight(getWeight() - 1.5);
      this.weight = "lost weight";
    } else {
      this.weight = "no change";
    }
    if (fed == 1) {
      this.time = "time";
    } else {
      this.time = "times";
    }
  }

  @Override
  public String toString() {
    return "---Lion---" + '\n' + super.toString() + " (" + weight + ")" + '\n' +
        "Fed: " + fed + " " + time + '\n';

  }
}
