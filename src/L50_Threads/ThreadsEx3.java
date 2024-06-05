package L50_Threads;

public class ThreadsEx3 extends Thread {
    int pageCount;
    String text;

    public ThreadsEx3(int pageCount, String text) {
        this.pageCount = pageCount;
        this.text = text;
    }

    @Override
    public void run() {
        Printer.synchronizedPrint(text,pageCount);
        for (int i = 0; i < pageCount; i++) {
            System.out.println(text);
            System.out.println("Напечатано страниц: " + (i + 1));
        }
    }


}
