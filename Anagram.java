import java.util.Arrays;

public class Anagram {
    public static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);


        return n_s1.equals(n_s2);
    }

    public static boolean main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = anagram(s1, s2);

        return result;
    }
}