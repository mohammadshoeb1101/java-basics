package SmallAlphabetsPattern;

public class aPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if (i==0 && (j==1 || j==2) || (i==1 && (j==0 || j==2) || (i==2 && (j==1 || j==2 || j==3)))){
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
