package Recursion;

public class FactorialOf5 {
    public static int factorial(int n) {
        // Base case: 0! and 1! are both 1
        if ( n == 1) {
            return 1;
        }

        // Recursive step
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
}
