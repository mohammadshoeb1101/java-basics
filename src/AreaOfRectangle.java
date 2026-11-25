import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length of the rectangle:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
