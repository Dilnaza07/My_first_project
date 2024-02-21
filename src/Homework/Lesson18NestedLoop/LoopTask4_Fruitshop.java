package Homework.Lesson18NestedLoop;

public class LoopTask4_Fruitshop {
    public static void main(String[] args) {

        int sum = 1000;
        int boxKiloCount1 = 15;
        int boxKiloCount2 = 17;
        int boxKiloCount3 = 21;

        int boxCount1 = 0;
        int boxCount2 = 0;
        int boxCount3 = 0;

        int sumBoxCount = 0;
        int WeistCount=0;

        for (int i = 0; i * boxKiloCount3<= sum; i++) {
            boxCount3 = i;
            int sumBoxCount3 = boxCount1 * boxKiloCount1 + boxCount2 * boxKiloCount2 + boxCount3 * boxKiloCount3;
            if (sumBoxCount3 == sum) {
                System.out.println("Коробок: 15 кило: " + boxCount1 + " 17 kilo: " + boxCount2 + " 21 kilo: " + boxCount3);
                WeistCount++;
                break;
            }
            for (int j = 0; j * boxKiloCount2 <= sum; j++) {
                boxCount2 = j;
                int sumBoxCount2 = boxCount1 * boxKiloCount1 + boxCount2 * boxKiloCount2 + boxCount3 * boxKiloCount3;
                if (sumBoxCount2 == sum) {
                    System.out.println("Коробок: 15 кило: " + boxCount1 + " 17 kilo: " + boxCount2 + " 21 kilo: " + boxCount3);
                    WeistCount++;
                    break;
                }

                for (int k = 0; k * boxKiloCount1<=sum; k++) {
                    boxCount1 = k;


                    int sumBoxCount1 = boxCount1 * boxKiloCount1 + boxCount2 * boxKiloCount2 + boxCount3 * boxKiloCount3;
                    if (sumBoxCount1 == sum){
                        System.out.println("Коробок: 15 кило: " + boxCount1 + " 17 kilo: " + boxCount2 + " 21 kilo: " + boxCount3);

                        WeistCount++;
                        break;
                    }


                }

            }
        }                        System.out.println("Количество способов: " + WeistCount);
    }
}
