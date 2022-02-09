import java.util.Scanner;

class FilledRectangle {
    public static void printRect(char symbol, int width, int height) {
        //method
        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                System.out.print(symbol); //desired symbol
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the desired symbol for your rectangle:");
        char character = scan.next().charAt(0);
        System.out.println("Enter desired height for the rectangle:");
        int high = scan.nextInt();
        System.out.println("Enter desired width for the rectangle:");
        int wid = scan.nextInt();

        System.out.println("Here is your desired rectangle:");
        printRect(character, wid, high);
        System.out.println("Thanks for using the rectangle maker!");
        scan.close();
    }
}