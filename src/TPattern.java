public class TPattern {

    public static void main(String[] args) {

        System.out.println("Star T Pattern:");
        int n = 5;
        for (int i = 0; i < n; i++){

            for (int j = 0; j < 5; j++){

                if ((i==0) || (j==4)){

                    System.out.print("* ");
                }
                else {System.out.print(" ");
                }

            }
            System.out.print("\n");
        }


    }

}

