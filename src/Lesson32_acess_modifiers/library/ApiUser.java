package Lesson32_acess_modifiers.library;

public class ApiUser {
    public static void main(String[] args) {
        Book book = new Book("Khe", "Aaa", 123);

        book.setTedBy("Inna");
        System.out.println(book.getTedBy());
    }
}
