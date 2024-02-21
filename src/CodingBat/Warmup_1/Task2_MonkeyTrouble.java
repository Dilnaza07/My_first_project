package CodingBat.Warmup_1;

public class Task2_MonkeyTrouble {
    public static void main(String[] args) {
        monkeyTrouble(true, true);
        monkeyTrouble2(true, true);
        monkeyTrouble3(true, true);


    }

//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//    We are in trouble if they are both smiling or if neither of them is smiling.
//    Return true if we are in trouble.
//
//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    //короткая версия
    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }


    //еще более короткая версия
    public static boolean monkeyTrouble3(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }
}


//public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//        if(aSmile && bSmile){
//            return true;
//        }else if(!aSmile && !bSmile){
//            return true;
//        }
//        return false;
//    }
//
//}

//The above can be shortened to:
////   return ((aSmile && bSmile) || (!aSmile && !bSmile));
//// Or this very short version (think about how this is the same as the above)
////   return (aSmile == bSmile);
