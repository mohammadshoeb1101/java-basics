package Recursion;

public class SumOfFirst10Numbers {
    static int sum(int n){
        // Base Case
        if (n==1){
            return 1;
        }
        return n + sum(n- 1);
    }
    static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println("Sum of First"+" "+n+" "+"number is:"+result);

    }
}
