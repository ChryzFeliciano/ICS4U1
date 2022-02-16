/*
Write two boolean methods, both called isPass.
 The methods should return true if and only if the result is a pass (at least ‘D’
 for a letter grade and at least 50 for a numerical grade)
 */

import java.util.Scanner;

class Main {
    public static boolean isPass(char result) {
        if (('A' <= result && result <= 'D') || ('a' <= result && result <= 'd')) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPass(int result) {
        if (result <= 100 && 50 <= result) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mark Checker (y/n)\n");
        char answer = scan.next().charAt(0);
        
        System.out.println("Value of grade?");
        if (answer == 'y') {
            char result = scan.next().charAt(0);
            System.out.println();
            if (isPass(result)) {
                System.out.println("Your grade of " + result + " is a passing grade");
            } 
            else {
                System.out.println("Your grade of " + result + " is a failing grade");
            }

            
        } 
        else {
            int result = scan.nextInt();
            System.out.println();
            if (isPass(result)) {
                System.out.println("Your grade of " + result + '%' + " is a passing grade");
            } 
            else {
                System.out.println("Your grade of " + result + '%' + " is a failing grade");
            }
        }
    }
}
