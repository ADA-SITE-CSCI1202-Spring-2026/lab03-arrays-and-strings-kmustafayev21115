//package week05;
import java.util.Arrays;

public class ExploadedString {

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.substring(beginIndex: 0, i +_1));
        }
        return sb.toString();
    }
}
