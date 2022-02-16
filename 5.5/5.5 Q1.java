
/*
Write a boolean method isDi visible with two int parameters. The method
should return true if and only if the first parameter value is exactly divisible by
the second
*/
import java.util.Scanner;

class DivisibleChecker {
    public static boolean isDivisible(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to divisible checker");
        System.out.println("Please enter first value:");
        int FirstValue = scan.nextInt();
        System.out.println("Please enter second value:");
        int SecondValue = scan.nextInt();
        System.out.println(isDivisible(FirstValue, SecondValue));
        scan.close();

    }
}
