
import java.util.Scanner;

class HollowRectangle {
    //method
    public static void printHollowRect(char c, int width, int height) {
        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                if (h == 1 || h == height || w == 1 || w == width) { //prints on perimeter to make a hollow rectange
                    System.out.print(c);
                } 
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the desired symbol for your rectangle:");
        char character = scan.next().charAt(0);
        System.out.println("Enter desired height for the rectangle (5 or greater for hollowed result):");
        int high = scan.nextInt();
        System.out.println("Enter desired width for the rectangle (5 or greater for hollowed result:");
        int wid = scan.nextInt();

        System.out.println("Here is your desired rectangle:");
        printHollowRect(character, wid, high);
        System.out.println("Thanks for using the rectangle maker!");
        scan.close();
    }
}