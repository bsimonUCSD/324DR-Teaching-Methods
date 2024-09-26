import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String text;
    int count;

  /*
    //Count occurrences of a specific letter in a String
    count = 0;
    text = "Red Devils";
    String lookFor = "e";

    for (int i = 0; i < text.length(); i++)
    {
      if (text.substring(i,i+1).equals(lookFor))
      {
        count++;
      }
    }
    System.out.println("Count is "+ count);
  */


  //Count occurences of vowels in a String
    text = "Red Devils";
    count = 0;

    for (int i = 0; i < text.length(); i++)
    {
      if (text.substring(i,i+1).equals("a") ||
          text.substring(i,i+1).equals("e") ||
          text.substring(i,i+1).equals("i") ||
          text.substring(i,i+1).equals("o") ||
          text.substring(i,i+1).equals("u") 
         )
      {
        count++;
      }
    }
    System.out.println("Count is "+ count);



/*
    //Count occurences of consonants in a String
    text = "Red Devils";
    count = 0;

    for (int i = 0; i < text.length(); i++)
    {
      if (!text.substring(i,i+1).equals("a") &&
          !text.substring(i,i+1).equals("e") &&
          !text.substring(i,i+1).equals("i") &&
          !text.substring(i,i+1).equals("o") &&
          !text.substring(i,i+1).equals("u") 
         )
      {
        count++;
      }
    }
    System.out.println("Count is "+ count);

*/
  
  }
}