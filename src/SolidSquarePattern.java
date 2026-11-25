public class SolidSquarePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=4;i++){     //row
            for (int j = 1; j<=n; j++){ //column
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
