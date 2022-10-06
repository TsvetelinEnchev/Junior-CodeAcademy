package Exercises_From_StartIt.homework_1.exercise_CarFactory;

import java.util.ArrayList;
import java.util.List;

public class Car extends Engine {

  private String model;
  private String brand;
  private double price;

  private boolean haveExtras = false;
  private List<Car> cars = new ArrayList<>();
  private List<Extras> extras = new ArrayList<>();
  Engine engine;

  public Car(int power, double volume, String type, String model, String brand, double price,
      Engine engine, boolean haveExtras) {
    super(power, volume, type);
    this.model = model;
    this.brand = brand;
    this.price = price;
    this.engine = engine;
    this.haveExtras = haveExtras;
  }

  public boolean isHaveExtras() {
    return haveExtras;
  }

  public void setHaveExtras(boolean haveExtras) {
    this.haveExtras = haveExtras;
  }

  public List<Extras> getExtras() {
    return extras;
  }

  public void setExtras(List<Extras> extras) {
    this.extras = extras;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  @Override
  public String toString() {
    if (haveExtras) {
      return "\n" + "Car info:" + "\n" +
          "Brand - " + brand + "\n" +
          "Model - " + model + "\n" +
          "Power (HP) - " + getPower() + "\n" +
          "Volume (cc) - " + getVolume() + "\n" +
          "Engine type - " + getType() + "\n" +
          "Price - " + price + " BGN.\n" +
          "Extras - " + extras.toString() + "\n";
    }
    return "\n" + "Car info:" + "\n" +
        "Brand - " + brand + "\n" +
        "Model - " + model + "\n" +
        "Power (HP) - " + getPower() + "\n" +
        "Volume (cc) - " + getVolume() + "\n" +
        "Engine type - " + getType() + "\n" +
        "Price - " + price + " BGN.\n" +
        "This car is not equipped with any extras." + "\n";
  }
}
