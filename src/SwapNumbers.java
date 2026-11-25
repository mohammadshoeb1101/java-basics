public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 1: Store 'a' in a temporary variable
        int temp = a;

        // Step 2: Assign 'b' to 'a'
        a = b;

        // Step 3: Assign the temporary variable (original 'a') to 'b'
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}