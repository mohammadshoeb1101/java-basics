package DigitsPattern;

public class Print8Pattern {
    public static void main(String[] args) {
        print8();

    }
    static void print8(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                 if (i==0 || i==2 || i==4 || (i==1 &&(j==0 || j==4) ||(i==3 &&(j==0 || j==4)))){
                     System.out.print("* ");
                 } else{
                     System.out.print("  ");
                 }
            }
            System.out.println();
        }
    }


}
