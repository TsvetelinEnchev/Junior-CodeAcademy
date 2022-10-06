package Exercises_From_StartIt.lesson_06_AccessControl.Exercise_01_Book1;

public class Book {
    private String title;
    private String author;
    private String iSBN;
    private int pages;
    private String publisher;
    private double price;


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

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printAttributes() {
        System.out.printf("Title: %s\n", getTitle());
        System.out.printf("Author: %s\n", getAuthor());
        System.out.printf("ISBN: %s\n", getiSBN());
        System.out.printf("Pages: %d\n", getPages());
        System.out.printf("Publisher: %s\n", getPublisher());
        System.out.printf("Price: %.2f\n", getPrice());
    }
}

