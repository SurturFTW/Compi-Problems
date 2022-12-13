import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        else if (num < 0) {
            System.out.println(num + " is negative.");
        else {
            System.out.println(num + " is zero.");
        }
    }
}
