package Lesson32_acess_modifiers.caller;

import Lesson32_acess_modifiers.library.Book;

public class main {
    public static void main(String[] args) {
        Book book = new Book("Petrov", "Intro", 100);
       // book.setTedBy("Ted");
       // System.out.println(book.getTedBy());

        ChildBook childBook = new ChildBook("TT", "ee",120);

       // childBook.setNeedsRepair(false);
    }
}
