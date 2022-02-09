/*
 In the following program, the executable statements are numbered. Use these numbers to indicate the order in which the statements are executed.
*/
class Song {
    public static void printChorus ()
    {
      System.out.println(); //3, 8
      System.out.println("Ee-igh, ee-igh, oh!"); //4, 9
      System.out.println(); //5, 10
    }
    public static void main (String[] args)
    {
      System.out.println("Old McDonald had a farm"); //1 
      printChorus(); //2
      System.out.println(" And on that farm he had" + " a pig"); //6
      printChorus(); //7
    
    }
  }
  