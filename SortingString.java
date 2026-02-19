import java.util.Arrays;

public class SortingString{
    public static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);        
    }
    
public static void main(String[] args) {
    String s1 = "skadd";
    System.out.println(sort(s1)); 
}
}

