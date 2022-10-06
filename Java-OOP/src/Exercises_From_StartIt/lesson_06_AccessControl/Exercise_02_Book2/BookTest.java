package Exercises_From_StartIt.lesson_06_AccessControl.Exercise_02_Book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title;
        String author;
        String iSBN;
        int pages;
        String publisher;
        double price;
        int input;

        ArrayList<Book> books = new ArrayList<>();

        do {
            System.out.println("Изберете 1, за да въведете книга или 2 за изход.");
            input = Integer.parseInt(scanner.nextLine());

            if (input == 1){
                System.out.print("Въведете заглавие на книгата: ");
                title = scanner.nextLine();
                System.out.print("Въведете автора и: ");
                author = scanner.nextLine();
                System.out.print("Въведете номерът на книгата (ISBN): ");
                iSBN = scanner.nextLine();
                System.out.print("Въведете броят на страниците: ");
                pages = Integer.parseInt(scanner.nextLine());
                System.out.print("Въведете издател: ");
                publisher = scanner.nextLine();
                System.out.print("Въведете цената на книгата: ");
                price = Double.parseDouble(scanner.nextLine());

                Book book = new Book(title, author, iSBN, pages, publisher, price);
                books.add(book);
            }
            else if(input == 2){
                System.out.println(Book.bookCounter);
                System.out.println(books);
            }
            else {
                System.out.println("Невалидна опция!");
            }

        }while(input != 2);

    }
}
