public class PassOrFail_1 {
    //Write a function to check if a student has passed or failed based on the score. If the score is greater than or equal to 50, return "pass".Otherwise return "Fail".  (Java)
    static String checkResult(int score){
        if (score >= 50){
            return "pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        System.out.println("Result is :"+checkResult(40));


    }
}
