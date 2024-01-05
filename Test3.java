package DSAtest;

import java.util.Scanner;

// Bài toán kiểm tra số chẳn lẻ
// Thuật toán
// Algoritthm: IsOddOrEven(number)
public class Test3 {
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        // Input: Get a number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        // Process: Check if the number is odd or even
        if (isEven(userInput)) {
            System.out.println(userInput + "Even");
        } else {
            System.out.println(userInput + "Odd");
        }
        scanner.close();
    }
}
// Câu 3 D