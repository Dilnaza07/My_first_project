package Lesson32_acess_modifiers.caller;

import Lesson32_acess_modifiers.library.Book;

public class ChildBook extends Book {


    public ChildBook(String author, String title, int pageCount) {
        super(author, title, pageCount);
    }

    public static void main(String[] args) {
        ChildBook childBook = new ChildBook("TT", "ee",120);

        childBook.setNeedsRepair(false);
    }
}
