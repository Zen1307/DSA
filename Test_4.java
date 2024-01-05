package DSAtest;

// Bài toán Tổng số lẻ  
// Thuật toán
// Algorithm: SumOfOddNumbers(n)
import java.util.Scanner;

public class Test_4 {

    public class SumOfOddNumbers {

        public static void main(String[] args) {
            // Input: Get an integer n from the user
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer (upper limit): ");
            int n = scanner.nextInt();

            // Process: Calculate the sum of odd numbers
            int sumOfOdds = calculateSumOfOdds(n);

            // Output: Display the result
            System.out.println("Sum of odd numbers from 1 to " + n + ": " + sumOfOdds);

            scanner.close();
        }

        public static int calculateSumOfOdds(int n) {
            int sum = 0;

            // Iterate through all numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                // Check if the current number is odd
                if (i % 2 != 0) {
                    sum += i; // Add the odd number to the sum
                }
            }

            return sum;
        }
    }

}
// Câu 4 A