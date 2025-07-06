package BASIC;
public class MaxElement {

    public static void main(String[] args) {
        int[] numbers = {45, 22, 78, 14, 99, 36, 50};

        int max = numbers[0];  // Assume first element is max initially

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // Update max if current element is greater
            }
        }

        System.out.println("Maximum element in the array is: " + max);
    }

}
