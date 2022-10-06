package Exercises_From_StartIt.homework_4.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Car {
  private double speed;
  private double regularPrice;
  private String color;

  private List<Car> cars = new ArrayList<>();

  public Car(double speed, double regularPrice, String color) {
    this.speed = speed;
    this.regularPrice = regularPrice;
    this.color = color;
    List<Car> cars;
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSalePrice(double regularPrice){
      return regularPrice;
  }

}
