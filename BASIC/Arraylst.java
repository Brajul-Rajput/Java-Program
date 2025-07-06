package BASIC;
import java.util.*;

public class Arraylst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 3, 88, 29);
        int max = Collections.max(list);

        System.out.println("Maximum element using Collections: " + max);
    }
}
 
