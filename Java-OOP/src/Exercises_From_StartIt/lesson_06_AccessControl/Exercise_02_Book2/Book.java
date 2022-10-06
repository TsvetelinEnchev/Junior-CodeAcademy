package Exercises_From_StartIt.lesson_06_AccessControl.Exercise_02_Book2;

public class Book {
    static int bookCounter;
    private String title;
    private String author;
    private String iSBN;
    private int pages;
    private String publisher;
    private double price;

    public Book(String title, String author, String iSBN, int pages, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;
        this.bookCounter++;
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

    @Override
    public String toString() {
        return  "\n" + "Книгата се казва: " + title + ".\n"
                + "Авторът е: " + author + ".\n"
                + "Кодът (ISBN) на книгата е: " + iSBN + ".\n"
                + "Броят на страниците е: " + pages + "\n"
                + "Издателство: " + publisher + ".\n"
                + "Цена: " + price + "лв.\n";
    }
}

