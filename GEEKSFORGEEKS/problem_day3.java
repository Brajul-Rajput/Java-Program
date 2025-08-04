package GEEKSFORGEEKS;

/*If a number is divisible by both 3 and 5, append "FizzBuzz" into result.
If it's only divisible by 3, append "Fizz" into result.
If it's only divisible by 5, append "Buzz" into result.
Otherwise, append the number itself into result.*/

public class problem_day3 {
    public static void main(String[] args) {
        int n = 15; // Example input
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("Fizz Buzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }
            if (i < n) {
                result.append(", "); // Add a comma for separation
            }
        }

        System.out.println(result.toString());
    }
}
