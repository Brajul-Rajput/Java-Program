package Arry;

public class linearfl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5 ,5, 5, 5};
        int target = 5;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element found at index: " + i);
            }
        }
        
    
    }
}
