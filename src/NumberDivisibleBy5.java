public class NumberDivisibleBy5 {
    static String checkNumber(int num){
        if (num%5==0){
            return "Divisible";
        } else {
            return "Not Divisible";
        }
    }
    public static void main(String[] args) {
        System.out.println("Number is:"+" "+checkNumber(11));




    }
}
