public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 50;
        int num3 = 30;
        System.out.println("Comapring" + " " + num1 + " " + "and" + " " + num2 + " " + "and" + " " + num3);
        if (num1 > num2 && num1> num3){
            System.out.println(num1 + " is the largest number.");
        } else if (num2>num1 && num2>num3){
            System.out.println(num2 + " is the largest number.");
        } else if (num3>num1 && num3>num1){
            System.out.println(num3 + " is the largest number.");
        } else{
            System.out.println("Three numbers are not largest");
        }

    }
}
