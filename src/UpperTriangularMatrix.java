public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int n = 5; // Size of the matrix

        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' if column index is greater than or equal to row index
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    // Print spaces to maintain matrix alignment for lower elements
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
