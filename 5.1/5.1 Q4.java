/*
Write a method that will simulate the results of rolling two fair dice by printing two random integer values in the range 1 to 6 along with their total. Sample output from a call to the method could be: 4 and 3 - a total of 7
*/
class DiceGame {
    public static void main (String [] args) {
      printRollingTwoDice();
    }
  
    public static void printRollingTwoDice()
    {
      int diceroll1 = (int) (6*Math.random()) + 1; //first dice roll
      int diceroll2 = (int) (6*Math.random()) + 1;
      System.out.print(diceroll1 + " and " + diceroll2);
      System.out.println(" - a total of " + (diceroll1 + diceroll2));
    }
  }