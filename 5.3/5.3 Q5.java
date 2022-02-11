import java.util.Scanner;

class ReturnGCD {
    public static int gcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greatest Common Denominator Calculator");
        System.out.println("Please enter first value:");
        int NumberOne = scan.nextInt();
        System.out.println("Please enter second number:");
        int NumberTwo = scan.nextInt();
       
        //output
        System.out.println("Here is your greatest common denominator:");
        System.out.println(gcd(NumberOne, NumberTwo));
        scan.close();
    }

}