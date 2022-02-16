import java.util.Scanner;

 class Overloading {

    public static int sum(int a, int b) {
        int answer = (a + b) / 2;
        return answer;
    }

    public static double AverageResult(float a, float b) {
        double answer = (a + b) / 2;
        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int decision = 0;
        System.out.println("Average Finder:");

        while (decision != 1 && decision != 2) {
            System.out.println("Please enter 1 to find the average as a integer");
            System.out.println("Please enter 2 to find the average as a floating point");
            decision = scan.nextInt();
        }

        if (decision == 1) {
            System.out.println("Enter the first number");
            int opt1 = scan.nextInt();
            System.out.println("Enter the second number");
            int opt2 = scan.nextInt();
            System.out.println("The average of the numbers is: " + AverageResult(opt1, opt2));
        }
        if (decision == 2) {
            System.out.println("Enter the first number");
            float opt3 = scan.nextFloat();
            System.out.println("Enter the second number");
            float opt4 = scan.nextFloat();
            System.out.println("The average of the numbers is: " + AverageResult(opt3, opt4));
        }
        System.out.println("Thanks for using the average finder!");
        scan.close();
    }
}