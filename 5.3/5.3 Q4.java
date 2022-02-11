import java.util.Scanner;

class LargestNumber {
    public static double largest(double a, double b, double c) {
        double largest;
        if (a > b && a > c)
            largest = a;
        else if (b > c)
            largest = b;
        else
            largest = c;

        return largest;
        
    }
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first value");
        double NumberOne = scan.nextDouble();
        System.out.println("Please enter second value");
        double NumberTwo = scan.nextDouble();
        System.out.println("Please enter last value");
        double NumberThree = scan.nextDouble();
        
        //output
        System.out.println("Here is your greatest value:");
        System.out.println(largest(NumberOne, NumberTwo, NumberThree));
        scan.close();
    }
}
