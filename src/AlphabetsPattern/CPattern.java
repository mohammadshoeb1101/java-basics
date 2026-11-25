package AlphabetsPattern;

public class CPattern {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Corrected conditions:
                // 1. Top horizontal bar (row 0, excluding the very left edge)
                // 2. Bottom horizontal bar (row 5, excluding the very left edge)
                // 3. Left vertical bar (rows 1 through 4 at column 0)
                if ((i == 0 && j > 0) ||
                        (i == 5 && j > 0) ||
                        (j == 0 && i > 0 && i < 5)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces inside the 'C'
                }
            }
            System.out.println();
        }
    }
}