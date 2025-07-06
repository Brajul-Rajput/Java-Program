package BASIC;

public class StrngMax {
    
    public static void main(String[] args) {
        String str = "programming";
        char maxChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maxChar) {
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Lexicographically maximum character: " + maxChar);
    }
}


