package Lesson31_modificators;

import Lesson32_acess_modifiers.library.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Petrov", "Game",130);

        System.out.println(book);

        book.setAuthor("Ivanov");
        book.setPageCount(300);

        System.out.println();
        System.out.println(book);
    }
}
