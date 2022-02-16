
/*
Write a boolean method isLetter that returns true if and only if its single
char parameter is a letter of the alphabet (either upper case or lower case).
*/
import java.util.Scanner;

class AlphabetChecker {
    public static boolean isLetter(char letter) {
        if (('A' <= letter && letter <= 'Z') ||
                ('a' <= letter && letter <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to alphabet checker");
        System.out.println("Please enter a letter:");
        char letter = scan.next().charAt(0);
        System.out.println(isLetter(letter));
        scan.close();

    }
}
