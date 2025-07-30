package HASHMAP;
import java.util.HashMap;
import java.util.Map;
public class H1 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
   

        map.remove(3);
      System.out.println(  map.get(map.size()));

System.out.println(map.containsKey(2));

        // Iterating through the HashMap using forEach
     /*    map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
        */
    }
}
