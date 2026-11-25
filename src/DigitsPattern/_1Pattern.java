package DigitsPattern;

public class _1Pattern {
    public static void main(String[] args) {
          pattern();
    }

    static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 1) || (i == 1 && j != 2) || (i == 2 && j == 1) || (i == 3 && j == 1) || (i == 4)) {

                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}




