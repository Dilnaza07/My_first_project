package l49_Treads;

public class Thread1Ex2 extends Thread{
  private  int peopleCount;
  String text;

    public Thread1Ex2(String text, int peopleCount) {
        this.peopleCount = peopleCount;
        this.text = text;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < peopleCount; i++) {
                System.out.println(text);
                System.out.println("Обработан " + ( i + 1) + " человек");
                sleep(5000);
            }
        } catch (Exception exception) {
            System.out.println("Я словил ошибку");
        }
    }
}
