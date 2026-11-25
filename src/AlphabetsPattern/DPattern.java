package AlphabetsPattern;


public class DPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if ((i==0 && j!=4)   || j==0 || (j==4 && (i==2 || i==3 || i==1) || (i==4 && (j==3 || j==2 || j==1)))  ){
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();

                 
            }
        }

    }

