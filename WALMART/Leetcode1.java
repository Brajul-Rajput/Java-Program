package WALMART;
import java.util.Arrays;
public class Leetcode1 {
    public static void main(String[] args) {
       System.out.println( isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] aChars = a.toCharArray();
            char[] bChars = b.toCharArray();

            Arrays.sort(aChars);
            Arrays.sort(bChars);

            return Arrays.equals(aChars, bChars);
        }
    }
}
