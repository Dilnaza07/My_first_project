package Lesson18NestedLoops;

public class NestedLoopsTask2 {
    public static void main(String[] args) {
        int boxKiloCount1 = 15, boxKiloCount2 = 17, boxKiloCount3 = 21, buyValue = 10000, waysCount = 0;

        for (int firstBoxCount = 0; firstBoxCount * boxKiloCount1 <= buyValue; firstBoxCount++) {
            for (int secondBoxCount = 0; secondBoxCount * boxKiloCount2 <= buyValue; secondBoxCount++) {
                for (int thirdBoxCount = 0; thirdBoxCount * boxKiloCount3 <= buyValue; thirdBoxCount++) {
                    int firstBoxesSum = firstBoxCount * boxKiloCount1;
                    int secondBoxesSum = secondBoxCount * boxKiloCount2;
                    int thirdBoxesSum = thirdBoxCount * boxKiloCount3;
                    int totalBoxesSum = firstBoxesSum + secondBoxesSum + thirdBoxesSum;
//                    int thirdBoxesSum2 = firstBoxCount * boxKiloCount1 + secondBoxCount * boxKiloCount2 + thirdBoxCount * boxKiloCount3;
                    if (totalBoxesSum == buyValue) {
                        System.out.println(++waysCount + " способ: " +
                                " количество ящиков " + boxKiloCount1 + " кг. = " + firstBoxCount +
                                ", количество ящиков " + boxKiloCount2 + " кг. = " + secondBoxCount +
                                ", количество ящиков " + boxKiloCount3 + " кг. = " + thirdBoxCount);
                        break;
                    }
                }
            }
        }
    }
}
