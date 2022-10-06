package Exercises_From_StartIt.lesson_06_AccessControl.exercise_09_PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneBookTest {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    menu();
    startProgram();
  }
  private static void startProgram() {
    List<String> phoneBookData = new ArrayList<>();
    PhoneBook phoneBook = new PhoneBook(phoneBookData);

    int input;

    do {

      input = Integer.parseInt(scanner.next());
      switch (input) {
        case 1 :
          addNewPhoneBookRecord(phoneBookData, phoneBook);
          phoneBook.insert();
          System.out.println("Изберете следваща опция");
        break;
      case 2 :
          System.out.println("Въведете телефонния номер за който искате да бъде изтрит записът.");
          String number = scanner.next();
          boolean isDeleted = phoneBook.deleteByPhoneNumber(number);
          printIsItDeletedFromPhoneBook(isDeleted);
          System.out.println("Изберете следваща опция");
       break;
        case 3 :
          String str = printAllRecordsStartsWithGivenString();
          phoneBook.getAllNamesStartingWith(str);
          System.out.println("Изберете следваща опция");
        break;
        case 4 :
          System.out.println(phoneBook);
          System.out.println("Изберете следваща опция");
        break;
        case 5:
          System.out.println("Излизане от програмата...");
          break;
        default:
          System.out.println("Невалидна опция! Моля опитайте отново.");
          break;
      }
      phoneBook.setData(phoneBookData);

    } while (input != 5);
  }
  private static void addNewPhoneBookRecord(List<String> phoneBookData, PhoneBook phoneBook) {
    System.out.println("Въведете име: ");
    String name = scanner.next();

    System.out.println("Въведете телефонен номер:");
    String phoneNumber = validatePhoneNumber();

    String formatRecord = String.format(name + "-" + phoneNumber);

    String existingRecord = searchForExistingRecord(phoneBookData, phoneNumber);

    if (existingRecord.equals("Not exist") || existingRecord.equals("Empty")) {
      phoneBookData.add(formatRecord);
      phoneBook.setData(phoneBookData);
      System.out.println("Записът се въвежда…");
    } else {
      System.out.println(
          "Запис за този номер съществува вече. Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
      processingData(phoneBookData, formatRecord, existingRecord);
    }
  }
  private static String validatePhoneNumber() {
    String phoneNumber = scanner.next();

    String regex = "[08]{2}\\d{8}";

    while (!Pattern.matches(regex, phoneNumber)){
      System.out.println("Невалиден номер! Телефонният номер трябва да е с дължина от 10 символа.");
      System.out.println("Въведете валиден телефонен номер: (Пример: 0889574565");
      phoneNumber = scanner.next();
    }

    return phoneNumber;
  }

  private static void processingData(List<String> phoneBookData, String formatRecord, String record) {

    int option = Integer.parseInt(scanner.next());

    while (true) {
      if (option == 1) {
        phoneBookData.remove(record);
        phoneBookData.add(formatRecord);
        break;
      } else if (option == 0) {
        System.out.println("Връщане в главното меню.");
        menu();
        break;
      } else {
        System.out.println(
            "Невалидна опция! Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
      }
    }
  }
  private static String searchForExistingRecord(List<String> phoneBookData, String phoneNumber) {

    if (phoneBookData.size() == 0) {
      return "Empty";
    }

    for (String currRecord : phoneBookData) {
      if (currRecord.contains(phoneNumber)) {
        return currRecord;
      }
    }
    return "Not exist";
  }
  private static void printIsItDeletedFromPhoneBook(boolean isDeleted) {
    if (isDeleted) {
      System.out.println("Записът беше успешно изтрит");
    } else {
      System.out.println("Запис за този номер не беше намерен.");
    }
  }
  private static String printAllRecordsStartsWithGivenString() {
    System.out.println("Въведете низ.");
    return scanner.next();
  }
  private static void menu() {
    System.out.println("Изберете опция:");
    System.out.println("1.Добави нов запис");
    System.out.println("2.Изтрий запис по номер");
    System.out.println("3.Покажи всички записи които започват с низ");
    System.out.println("4.Принтирай toString");
    System.out.println("5.Изход");
  }
}
