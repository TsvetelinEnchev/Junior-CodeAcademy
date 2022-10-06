package Exercises_From_StartIt.homework_1.exercise_CarFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String model;
    String brand;
    double price;
    final double INITIAL_PRICE = 60_000;
    int power;
    double volume;
    String type;

    int carsCount = 0;
    int carsCountWithExtras = 0;

    double totalPriceOfExtras = 0;
    double totalPriceOfAllCars = 0;

    boolean haveExtras = false;

    List<Car> cars = new ArrayList<>();
    List<Extras> extras;

    System.out.println("Enter the number of cars we need to produce for the day!");
    int N = Integer.parseInt(scanner.next());

    System.out.println("Every second car must be equipped with at least 2 extras!");

    while (N != carsCount) {

      price = INITIAL_PRICE;

      System.out.println("First enter the car brand.");
      brand = scanner.next();

      System.out.println("Enter the car model.");
      model = scanner.next();

      System.out.println("Enter the power of the car (HP).");
      power = Integer.parseInt(scanner.next());

      System.out.println("Enter the volume (cc).");
      volume = Double.parseDouble(scanner.next());

      System.out.println(
          "Now you need to select the engine type(diesel, petrol, hybrid or electrical).");
      type = scanner.next().toUpperCase();

      Engine engine = new Engine(power, volume, type);
      Car car = new Car(power, volume, type, model, brand, price, engine, haveExtras);

      carsCount++;

      if (carsCount % 2 == 0) {

        carsCountWithExtras++;

        car.setHaveExtras(true);

        System.out.println("The life is better with extras! Let's add some.");
        printExtras();

        System.out.println("How many of them did you like?");
        int numberOfExtras = Integer.parseInt(scanner.next());

        extras = new ArrayList<>();

        for (int i = 0; i < numberOfExtras; i++) {
          String theExtra = scanner.next();

          for (Extras extra : Extras.values()) {
            if (theExtra.equalsIgnoreCase(extra.name())) {

              totalPriceOfExtras += extra.getPrice();
              extras.add(Extras.valueOf(extra.name()));
              car.setExtras(extras);

              break;
            }
          }
          car.setPrice(price + totalPriceOfExtras);
        }
      }
      cars.add(car);
      totalPriceOfAllCars += car.getPrice();
    }

    System.out.printf("Today we produced %d cars.\n", carsCount);
    System.out.printf("Total value is: %.2f BGN.\n", totalPriceOfAllCars);
    System.out.printf("The number of cars with extras produced is %d.\n", carsCountWithExtras);
    printCountOfAnyTypeEngine(cars);
    System.out.println("These are the cars we made:");
    System.out.println(cars);

  }

  private static void printCountOfAnyTypeEngine(List<Car> cars) {

    for (EngineType type : EngineType.values()) {
      int counter = 0;
      for (Car engine : cars) {
        if (engine.getType().equalsIgnoreCase(type.getTypeEngine())) {
          counter++;
        }
      }
      System.out.printf("Number of %s type engine is %d\n", type.getTypeEngine(), counter);
    }
  }

  public static void printExtras() {
    System.out.println("We offer the following extras:");
    System.out.println("----------------------------------------");
    for (Extras extras : Extras.values()) {
      System.out.printf("%s costs - %.2f BGN.\n", extras.getName(), extras.getPrice());
    }
    System.out.println("----------------------------------------");
  }
}
