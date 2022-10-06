package Exercises_From_StartIt.homework_4.exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyOwnAutoShop {

  static Scanner scanner = new Scanner(System.in);

  static double speed;
  static double regularPrice;
  static String color;
  static double length;
  static int year;
  static double manufacturerDiscount;
  static double weight;
  static String input;

  public static void main(String[] args) {

    List<Car> cars = new ArrayList<>();
    System.out.println("The vehicles we offer are:\n "
        + "(Sedan, Ford, Truck and Car)\n"
        +"To stop making vehicles type \"close\"!\n"
        + "---------------------------------\n"
        + "Enter the vehicle type: ");


    while (!(input = scanner.next().toLowerCase()).equals("close")) {
      switch (input) {
        case "sedan":
          fillSedanInfo(cars);
          break;
        case "ford":
          fillFordInfo(cars);
          break;
        case "truck":
          fillTruckInfo(cars);
          break;
        case "car":
          fillCarInfo(cars);
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }
    }
    System.out.println("Here are all vehicles and their prices.");
    printCarPrices(cars);
  }

  private static void printCarPrices(List<Car> cars) {

    for (Car car : cars) {
      if (car.equals("car")){
        System.out.printf("Car price is - %.2f BGN.",car.getSalePrice(car.getRegularPrice()));
      }else if(car.equals("truck")){
        System.out.printf("Truck price is - %.2f BGN.", car.getSalePrice(car.getRegularPrice()));
      }else if(car.equals("Ford")){
        System.out.printf("Ford price is - %.2f BGN.",car.getSalePrice(car.getRegularPrice()));
      }else {
        System.out.printf("Sedan price is - %.2f BGN.", car.getSalePrice(car.getRegularPrice()));
      }
    }
  }

  private static List<Car> fillCarInfo(List<Car> cars) {
    System.out.println("Speed: ");
    speed = Double.parseDouble(scanner.next());
    System.out.println("RegularPrice: ");
    regularPrice = Double.parseDouble(scanner.next());
    System.out.println("Color: ");
    color = scanner.next();

    Car car = new Car(speed, regularPrice, color);
    cars.add(car);
    System.out.println("Type: ");
    return cars;
  }

  private static List<Car> fillTruckInfo(List<Car> cars) {
    System.out.println("Speed: ");
    speed = Double.parseDouble(scanner.next());
    System.out.println("RegularPrice: ");
    regularPrice = Double.parseDouble(scanner.next());
    System.out.println("Color: ");
    color = scanner.next();
    System.out.println("Weight: ");
    weight = Double.parseDouble(scanner.next());

    Truck truck = new Truck(speed, regularPrice, color, weight);
    cars.add(truck);
    System.out.println("Type: ");
    return cars;
  }

  private static List<Car> fillFordInfo(List<Car> cars) {
    System.out.println("Speed: ");
    speed = Double.parseDouble(scanner.next());
    System.out.println("RegularPrice: ");
    regularPrice = Double.parseDouble(scanner.next());
    System.out.println("Color: ");
    color = scanner.next();
    System.out.println("Year: ");
    year = Integer.parseInt(scanner.next());
    System.out.println("Manufacturer discount: ");
    manufacturerDiscount = Double.parseDouble(scanner.next());

    Ford ford = new Ford(speed, regularPrice, color, year, manufacturerDiscount);
    cars.add(ford);
    System.out.println("Type: ");
    return cars;

  }

  private static List<Car> fillSedanInfo(List<Car> cars) {
    System.out.println("Speed: ");
    speed = Double.parseDouble(scanner.next());
    System.out.println("RegularPrice: ");
    regularPrice = Double.parseDouble(scanner.next());
    System.out.println("Color: ");
    color = scanner.next();
    System.out.println("Length: ");
    length = Double.parseDouble(scanner.next());

    Sedan sedan = new Sedan(speed, regularPrice, color, length);
    cars.add(sedan);
    System.out.println("Type: ");
    return cars;
  }
}
