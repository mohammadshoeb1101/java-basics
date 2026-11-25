package Recursion;

public class SumOfFirstNaturalNumbers {
    public static int sum(int n) {
            // Base case: sum of 1 is 1
            if (n==1){
                return 1;
            }
            return n + sum(n-1);
        }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first"  + " " + n + " " + "number is:" + result);

    }

    }
