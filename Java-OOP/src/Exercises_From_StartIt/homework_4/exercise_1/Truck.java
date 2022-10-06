package Exercises_From_StartIt.homework_4.exercise_1;

public class Truck extends Car{
    private double weight;

  public Truck(double speed, double regularPrice, String color, double weight) {
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public double getSalePrice(double regularPrice) {

    if (weight > 2000) {
      regularPrice -= regularPrice * 0.1;
    }else {
      regularPrice -= regularPrice * 0.2;
    }

    return super.getSalePrice(regularPrice);
  }
}
