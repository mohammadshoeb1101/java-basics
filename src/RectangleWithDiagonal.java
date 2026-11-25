public class RectangleWithDiagonal {
    public static void main(String[] args) {
        int n = 6; // Size of the grid (number of rows and columns)

        System.out.println("Rectangle with Diagonal:");
        for (int i = 0; i < n; i++) {             // outer loop (rows)
            for (int j = 0; j < n; j++) {         // inner loop (columns)
                // Print '*' if it's on the border (first/last row or col)
                // or on the main diagonal (row index equals column index)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for empty interior areas
                }
            }
            System.out.println();
        }
    }
}