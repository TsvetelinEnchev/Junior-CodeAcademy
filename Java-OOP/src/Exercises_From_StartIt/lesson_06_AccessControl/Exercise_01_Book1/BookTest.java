package Exercises_From_StartIt.lesson_06_AccessControl.Exercise_01_Book1;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.printAttributes();

        book.setTitle("Как да станем програмисти с Java.");
        book.setAuthor("Цветелин Енчев");
        book.setiSBN("9785145522");
        book.setPages(315);
        book.setPublisher("BooksBG");
        book.setPrice(18.99);

        book.printAttributes();
    }

}
