package AlphabetsPattern;

public class EPattern {
    public static void main(String[] args) {
        int row = 5;
        int cols = 4;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i==2 || i==4)||
                        (i==1 && j==0) || (i==3 && j==0)  ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
