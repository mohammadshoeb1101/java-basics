package Recursion;

public class SubtractionOfFirst5Numbers {
    static int subt(int n){
        if(n==0){
            return 1;
        }
        return n - subt(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = subt(n);
        System.out.println(result);



    }
}
