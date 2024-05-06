package _Java.IT_Class.M20_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Имеется список книг.
//Вывести книги до определенного года издания
//и в отсортированном порядке.

public class Book_ArrayList {
    public static void main(String[] args) {

        int comparisonYear = 2019;

        List<Book> books = new ArrayList<>();
        books.add(new Book("Сhemistry", 2016));
        books.add(new Book("Mathematics", 1999));
        books.add(new Book("Biology", 2010));
        books.add(new Book("Literature", 2019));
        books.add(new Book("Informatics", 2020));

        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() <= comparisonYear) {
                filteredBooks.add(book);
            }
        }
        Collections.sort(filteredBooks, Comparator.comparing(Book::getYear));

        for (Book book : filteredBooks) {
            System.out.println(book.getTitle() + " year " + book.getYear());
        }
    }
    static class Book {
        private String title;
        private int year;

        public Book(String title, int year) {
            this.title = title;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }
    }
}