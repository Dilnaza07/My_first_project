package CodingBat.Warmup_1;

public class backAround_task13 {
    public String backAround(String str) {
        char last = str.charAt(str.length()-1);
        return last + str + last;

    }
}
