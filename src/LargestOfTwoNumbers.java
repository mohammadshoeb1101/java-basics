public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;

        System.out.println("Comparing " + num1 + " and " + num2 + ":");


        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        }

        else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        }

        else {
            System.out.println("Both numbers are equal.");
        }
    }
}