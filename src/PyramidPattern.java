public class PyramidPattern {
    public static void main(String[] args) {
        int n = 4; // Height of the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (odd number of stars per row: 1, 3, 5, 7)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}