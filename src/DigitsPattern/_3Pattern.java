package DigitsPattern;

public class _3Pattern {
    public static void main(String[] args) {
        pattern();

    }
    static void pattern() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i==0 || (i==1 && j==4) || (i==2 && (j!=0 && j!=1) || (i==3 && (j==4) || i==4))){
                    //(i == 0 || i == 4 || (i == 2 && j >= 2) || (j == 4 && (i == 1 || i == 3)))
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

