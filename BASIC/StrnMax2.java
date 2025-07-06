package BASIC;

public class StrnMax2 {
   
    public static void main(String[] args) {
        String[] arr = {"banana", "watermelon", "kiwi", "apple", "pineapple"};
        String max = arr[0];

        for (String str : arr) {
            if (str.length() > max.length()) {
                max = str;
            }
        }

        System.out.println("String with maximum length: " + max);
    }
}
 

