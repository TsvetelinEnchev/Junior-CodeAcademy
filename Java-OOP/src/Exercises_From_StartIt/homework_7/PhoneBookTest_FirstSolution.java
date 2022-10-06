package Exercises_From_StartIt.homework_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookTest_FirstSolution {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    menu();
    startProgram();
  }

  private static void startProgram() {
    PhoneBook book = new PhoneBook();
    Map<String, String> bookMap = new HashMap<>();

    int input;

    do {

      input = Integer.parseInt(scanner.next());

      switch (input) {
        case 1 :
          book.setData(uploadContacts(bookMap));
          book.insert();
          System.out.println("Select next option.");
        break;
        case 2 :
          boolean isRemoved = book.deleteByPhoneNumber(selectNumberToRemove());
          printIsItRemoved(isRemoved);
          System.out.println("Select next option.");
        break;
        case 3 :
          book.getAllNamesStartingWith(findContactWithGivenString());
          System.out.println("Select next option.");
        break;
        case 4 :
          System.out.println(book);
          System.out.println("Select next option.");
        break;
        case 5 :
          System.out.println("Exit the program...");
        break;
        default :
          System.out.println("Invalid option! Please try again.");
          break;
      }

      book.setData(bookMap);

    } while (input != 5);
  }
  private static String findContactWithGivenString() {
    System.out.println("Enter a string to search with.");
    return scanner.next();
  }
  private static void printIsItRemoved(boolean isRemoved) {
    if (isRemoved) {
      System.out.println("Contact removed successfully!");
    } else {
      System.out.println("No such contact number exists");
    }
  }

  private static String selectNumberToRemove() {
    System.out.println("Enter the number of your contact you want to remove.");
    return scanner.next();
  }

  private static Map<String, String> uploadContacts(Map<String, String> bookMap) {

    System.out.println("Please name your new contact.");
    String name = scanner.next();

    System.out.println("Enter the phone number.");
    String phoneNumber = scanner.next();

    boolean exist = doesContactExist(phoneNumber, bookMap);

    if (!exist) {
      bookMap.put(name, phoneNumber);
      System.out.println("The entry is being entered...");
    } else {
      System.out.println(
          "An entry for this number already exists. Select 1 to overwrite it or 0 to return to the home menu");
      chooseOption(name, phoneNumber, bookMap);
    }
    return bookMap;
  }

  private static boolean doesContactExist(String phoneNumber, Map<String, String> bookMap) {

    if (bookMap.isEmpty()) {
      return false;
    }
    for (Map.Entry<String, String> e : bookMap.entrySet()) {
      if (e.getValue().contains(phoneNumber)) {
        return true;
      }
    }
    return false;
  }
  private static void chooseOption(String name, String phoneNumber, Map<String, String> bookMap) {
    int option = Integer.parseInt(scanner.next());

    while (true) {
      if (option == 1) {
        replaceExistingContact(name, phoneNumber, bookMap);
        break;
      } else if (option == 0) {
        System.out.println("Back to the main menu.");
        menu();
        break;
      } else {
        System.out.println(
            "Invalid option. Select 1 to overwrite it or 0 to return to the home menu");
      }
    }
  }
  private static void replaceExistingContact(String name, String phoneNumber,
      Map<String, String> bookMap) {

    for (Map.Entry<String, String> elemet : bookMap.entrySet()) {
      if (elemet.getValue().contains(phoneNumber)) {
        bookMap.remove(elemet.getKey(), elemet.getValue());
        bookMap.put(name, phoneNumber);
      }
    }
  }
  private static void menu() {
    System.out.println("Select option:");
    System.out.println("1.Add a new contact.");
    System.out.println("2.Remove the contact by their number.");
    System.out.println("3.Display all contacts with a given string.");
    System.out.println("4.Print toString");
    System.out.println("5.Exit");
  }
}

