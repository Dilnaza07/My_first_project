package L50_Threads;

public class Printer {
    public static synchronized void synchronizedPrint(String text, int pageCount) {
        for (int i = 0; i < pageCount; i++) {
            System.out.println(text);
            System.out.println("Напечатано страниц синхронайз: " + (i + 1));
        }
    }
}
