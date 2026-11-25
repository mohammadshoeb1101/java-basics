public class ConvertNumberToString {
    public static String dashifyNumber(int number) {
        // Convert the number to a string (handles negative numbers if needed)
        String str = String.valueOf(number);

        // Split the string into individual characters and join them with a dash
        return String.join("-", str.split(""));
    }



    public static void main(String[] args) {
        int number = 12345;
        String result = dashifyNumber(number);
        System.out.println(result); // Output: 1-2-3-4-5
    }
}








