package AlphabetsPattern;

public class KPattern {
   public static void main(String[] args) {
       int rows = 5;
       int col = 5;
       for (int i = 0; i < rows; i++ ){
           for (int j = 0; j < col; j++){
               if (i==0 && (j == 0 || j == 4) || ( i == 1 && (j==0 || j==3) || (i==2 && (j==0 || j==1) || (i==3 && (j==0 || j==3) || (i==4 && (j==0 || j==4)))))) {
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
           }
           System.out.println();
       }

    }
}
