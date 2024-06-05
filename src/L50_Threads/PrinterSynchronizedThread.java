package L50_Threads;

public class PrinterSynchronizedThread extends Thread {

    private int count;
    private String text;

    public PrinterSynchronizedThread(int count, String text) {
        this.count = count;
        this.text = text;
    }

    @Override
    public void run() {
//        Printer.print(count, text);

    }
}
