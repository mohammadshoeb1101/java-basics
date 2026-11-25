public class HeartPattern {
    public static void main(String[] args) {
        // Upper part of the heart (two bumps)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the heart (inverted triangle)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
