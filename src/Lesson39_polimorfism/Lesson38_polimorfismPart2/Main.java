package Lesson39_polimorfism.Lesson38_polimorfismPart2;

public class Main {
    public static void main(String[] args) {

        Swimable[] oceanarium2 = {
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
        };
    //    for (int i = 0; i < oceanarium2.length; i++) {
     //       oceanarium2[i].voice();
     //       oceanarium2[i].swim();
      //  }

        Swimable[] oceanarium = new Swimable[15];
        int j = 0;

        for (; j < (oceanarium.length / 3); j++) {
            oceanarium[j * 3] = new Turtle();
            oceanarium[j * 3 + 1] = new Shark();
            oceanarium[j * 3 + 2] = new Duck();
        }

        j = j * 3;

        if (j < oceanarium.length) {
            oceanarium[j] = new Turtle();
            j++;
        }
        if (j < oceanarium.length) {
            oceanarium[j] = new Shark();
        }


        for (int i = 0; i < oceanarium.length; i++) {
            oceanarium[i].voice();
            oceanarium[i].swim();

            if(oceanarium[i] instanceof Shark){
                ((Shark)oceanarium[i]).hunting();
            } else if (oceanarium[i] instanceof Turtle) {
                ((Turtle) oceanarium[i]).postponeableEggs();
            } else if (oceanarium[i] instanceof Duck) {
                ((Duck)oceanarium[i]).voice();
            }


            Shark [] sharks = new Shark[5];
            Duck [] ducks = new Duck[5];
            Turtle[] turtles = new Turtle[5];

//            for(int i = 0, sharkCounter = 0, duckCounter = 0, turtCounter = 0; i< oceanarium.length; i++){
//                if(sharkCounter < sharks.length && oceanarium[i] instanceof Shark){
//                   // sharks(sharkCounter++) = (Shark)oceanarium[i];
//                } else if (oceanarium[i] instanceof Turtle) {
//                  //  turtles(turtCounter++) = (Turtle)oceanarium[i];
//                } else if (oceanarium[i] instanceof Duck) {
//                  //  ducks(duckCounter++) = (Duck)oceanarium[i];
//                }
//
//            }
        }

    }
}
