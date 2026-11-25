package Functions;

public class EvenOrOdd {
    public static void checkEvenOdd(int num) {
        if (num %2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
    public static void main(String[] args) {
        checkEvenOdd(11);

    }
}
