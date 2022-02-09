/*
Rewrite the method of Example 3 so that it avoids the use of a return statement.
*/

import java.util.Scanner;

class RewriteReturnStatement {
  public static void main (String[] args) {
  { 
    Scanner scan = new Scanner(System.in);
    boolean q = true;

    while (q == true) { //loops back if answer is negative
      System.out.println("Please give a non-negative value");
      double x = scan.nextDouble();
      if (x >= 0) {
        System.out.println("Square root is " + Math.sqrt(x));
        scan.close();
        q = false;
      }
    }
  }
}
}
