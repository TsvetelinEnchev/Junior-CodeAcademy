package Exercises_From_StartIt.homework_3.exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<MyBook> myBooks = new ArrayList<>();
    String author;
    String title;
    double price;

    String input;

    System.out.println("Let`s make our own library!");
    System.out.println("To make a new book type \"add\" to exit type \"end\".");

    boolean isProgramClosed = false;

    while (!isProgramClosed) {

      input = scanner.next();

      if (input.equalsIgnoreCase("add")) {

        System.out.println("Title: ");
        title = scanner.next();

        System.out.println("Author: ");
        author = scanner.next();

        System.out.println("Price: ");
        price = Double.parseDouble(scanner.next());

        System.out.println("----------------");

        MyBook myBook = new MyBook(title, author, price);
        myBooks.add(myBook);

      } else if (input.equalsIgnoreCase("end")) {

        for (MyBook book : myBooks) {
          book.display();
        }
        isProgramClosed = true;
        continue;

      } else {
        System.out.println("Invalid input!");
      }

      System.out.println("Add or end?");
    }
  }
}
