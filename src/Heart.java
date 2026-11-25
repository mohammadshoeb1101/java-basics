public class Heart {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                if ((i==00 & j%4==0) || (i==1 & j%4==0)){
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }

    }
}
