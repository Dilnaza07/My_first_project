package L50_Threads;

public class PrinterMain {

    public static void main(String[] args) {

        Printer printer = new Printer();

        PrinterChaoticThread printerChaoticThread1 = new PrinterChaoticThread(5, "Printer Chaotic 1", printer);
        PrinterChaoticThread printerChaoticThread2 = new PrinterChaoticThread(5, "Printer Chaotic 2", printer);
        PrinterChaoticThread printerChaoticThread3 = new PrinterChaoticThread(5, "Printer Chaotic 3", printer);

        printerChaoticThread1.start();
        printerChaoticThread2.start();
        printerChaoticThread3.start();

        PrinterSynchronizedThread printerSynchronizedThread1 = new PrinterSynchronizedThread(5, "Printer Synchronized 1");
        PrinterSynchronizedThread printerSynchronizedThread2 = new PrinterSynchronizedThread(5, "Printer Synchronized 2");
        PrinterSynchronizedThread printerSynchronizedThread3 = new PrinterSynchronizedThread(5, "Printer Synchronized 3");
        PrinterSynchronizedThread printerSynchronizedThread4 = new PrinterSynchronizedThread(5, "Printer Synchronized 4");
        PrinterSynchronizedThread printerSynchronizedThread5 = new PrinterSynchronizedThread(5, "Printer Synchronized 5");

        printerSynchronizedThread5.setPriority(10);

        printerSynchronizedThread1.start();
        printerSynchronizedThread2.start();
        printerSynchronizedThread3.start();
        printerSynchronizedThread4.start();
        printerSynchronizedThread5.start();


    }


}
