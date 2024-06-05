package Lesson41;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[]{new Cat("Merka"),
                new Cat("Anna")};

        try {
            for (int i = 0; i <= cats.length; i++) {
                System.out.println(cats[i].toString());
            }

        } catch (
                NullPointerException npe) {
            System.out.println("Поймали ошибку!");
        } catch (ArrayIndexOutOfBoundsException boundsException) {
            System.out.println("Вышли за пределы массива");
        } catch (
                Exception exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Я все равно выполнюсь");
        }
    }
}
