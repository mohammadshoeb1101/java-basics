package Functions;

public class Factorial {
    public static int factorialNum(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialNum(5)); // Output will be 120
    }
}
// Write a function to get second largest element from the array.
// Write a function to calculate first even number from the array
// Write  a function to swap two middle numbers from an array.
// write a function to swap first and last element.
// we have 100 chairs. write a functions for book single chair, book multilple chair, release single chair, release multiple chair, get available chairs,
