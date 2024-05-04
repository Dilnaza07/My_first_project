package l49_Treads;

public class DocumentsThread extends Thread{
    private  int count;

    DocumentsThread(int count){
        this.count = count;
    }

    @Override
    public void run(){
        for (int i = 0; i < count; i++) {
            System.out.println("Печатаю " + (i + 1) + " копию документа ");
        }
    }
}
