public class SquarePattern {
        public static void main(String[] args) {
            int rows = 4;
            int cols = 5;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    // Print star if it's the first row, last row, first column, or last column
                    if (i == 1 || i == rows || j == 1 || j == cols) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Print spaces for the inside
                    }
                }
                System.out.println();
            }
        }
    }


