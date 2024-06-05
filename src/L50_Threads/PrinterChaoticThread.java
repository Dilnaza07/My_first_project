package L50_Threads;

public class PrinterChaoticThread extends Thread {

    private int count;
    private String text;
    private Printer printer;

    public PrinterChaoticThread(int count, String text, Printer printer) {
        this.count = count;
        this.text = text;
        this.printer = printer;
    }

    @Override
    public void run() {
            /*try {
                for (int i = 0; i < count; i++) {
                    System.out.println(text + " " + (i + 1));
                    sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Я словил эксепшн!!!");
            }*/
      //  printer.print(count, text);
    }
}
