package DSAtest;

// Thuật toán
// Algorithm: PrintHollowStarSquare(m,n)
// Vẽ hình được xếp hàng một hình vuông có khoẳng trống ở giữa (m,n)
public class Test5 {

    public static void printHollowStarSquare(int m, int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star for the first and last row or columns
                // Print star for the first and last colums of other rows
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print space for the hollow part
                    System.out.print("  ");
                }
            }
            System.out.println();
            // move to the next line after each row

        }

    }

    public static void main(String[] args) {
        // Example: Print a hollow rectangle with 4 rows and 4 columns
        printHollowStarSquare(4, 4);

    }
}
