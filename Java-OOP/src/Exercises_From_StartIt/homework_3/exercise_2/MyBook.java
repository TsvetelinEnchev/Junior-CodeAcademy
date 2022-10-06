package Exercises_From_StartIt.homework_3.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class MyBook extends Book {

  private String title;
  private String author;
  private double price;

  private List<MyBook> myBooks = new ArrayList<>();
  public MyBook(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public List<MyBook> getMyBooks() {
    return myBooks;
  }

  public void setMyBooks(List<MyBook> myBooks) {
    this.myBooks = myBooks;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void display() {
      System.out.printf("Title: %s. Author: %s. Price: %.2f.\n", title, author, price);
  }
}
