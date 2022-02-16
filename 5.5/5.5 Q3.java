/*
Write a boolean method isPrime that returns true if and only if its int
parameter is a prime number
*/

import java.util.Scanner;

class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, i, a = 0;

        System.out.println("Enter a number: ");
        number = scan.nextInt();

        for (i = 1; i < (number + 1); i++) {
            if (number % i == 0) {
                a++;
            }
        }

        System.out.println(prime(a));
    }

    public static boolean prime(int a) {
        if (a != 2) {
            return false;
        }

        return true;
    }
}
