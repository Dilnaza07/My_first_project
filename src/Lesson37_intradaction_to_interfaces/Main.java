package Lesson37_intradaction_to_interfaces;

public class Main {
    public static void main(String[] args) {

      //  Board board = new Board();
        Board blackBoard = new BlackBoard();
        Board whiteBoard = new WhiteBoard();

        blackBoard.write();
        whiteBoard.write();

      Writeable blackBoard2 = new BlackBoard();
      Writeable whiteBoard2 = new BlackBoard();

        blackBoard2.write();
        whiteBoard2.write();


    }


}
