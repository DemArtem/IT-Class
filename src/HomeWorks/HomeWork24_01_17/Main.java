package HomeWorks.HomeWork24_01_17;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(Book.Color.RED);
        book.setColor(Book.Color.RED);
        book.getColor(Book.Color.RED);
        System.out.println(book);
    }
}