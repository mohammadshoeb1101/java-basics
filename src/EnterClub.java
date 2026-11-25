public class EnterClub {
    // Write a function to check
    static String checkEntry(int age){
        if (age>=18){
            return "Can Enter";
        } else {
            return "Can Not Enter";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Enter Club:"+ " "+checkEntry(19));

    }
}
