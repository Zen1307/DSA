package DSAtest;

// Bài toán kiểm tra một số nguyên dương có phải một số nguyên tố không
import java.util.Scanner;

public class Test2 {

    public static boolean isPrime(int number) {
        // Step 2: If number is less than 2, return false
        if (number < 2) {
            return false;
        }

        // Step 3: If number is 2, return false
        if (number == 2) {
            return true;
        }

        // Step 4: If number is even, return false
        if (number % 2 == 0) {
            return false;
        }

        // Step 5: Set limit = square root of number
        int limit = (int) Math.sqrt(number);

        // Step 6: Check divisibility by odd integers from 3 to limit
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }

        // Step 7: If no divisors found, return true (number is prime)
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int userInput = scanner.nextInt();

        // Output: Check if the entered number is prime
        boolean isPrime = isPrime(userInput);

        // Display the result
        if (isPrime) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is not a prime number.");
        }

        scanner.close();
    }
}
// Câu 2 C