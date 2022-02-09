/*
Search one short lyric folk song and make a lyric program that will represent different chunks of the song by calling different methods.
*/
class DownByTheBay {
    public static void printChorus ()
    {
      //Chorus & Method
      System.out.println("Down by the bay"); // 2, 12, 22, 32
      System.out.println("Where the watermelons grow"); // 3, 13, 23, 33
      System.out.println("Back to my home"); // 4, 14, 24, 34
      System.out.println("I dare not go"); // 5, 15, 25, 35
      System.out.println("For if I do"); // 6, 16, 26, 36
      System.out.println("My mother will say"); // 7, 17,27, 37 
    }
    public static void main (String[] args)
    {
      //Lyrics
      printChorus(); // 1
      System.out.println("Did you ever you see a goose kissing a moose?"); // 8
      System.out.println("Down by the bay"); // 9
      System.out.println(""); // 10
      printChorus(); // 11
      System.out.println("Did you ever see a whale With a polka dot tail?"); // 18
      System.out.println("Down by the bay");// 19
      System.out.println(""); // 20
      printChorus(); // 21
      System.out.println("Did you ever see a fly Wearing a tie?"); // 28
      System.out.println("Down by the bay"); // 29
      System.out.println(""); // 30
      printChorus(); // 31
      System.out.println("Did you ever see a bear Combing his hear?"); // 38
      System.out.println("Down by the bay"); // 39
      System.out.println("Down by the bay!"); // 40
    }
  }