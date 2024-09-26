import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Note: a check is a simplified count -- a count where the answer is either 0 or 1 -- it isn't meeting our description or it is.

    //Contains at least 1 occurence of a specific number in 10 numbers
  /*
    int number;
    boolean meetsCheck;
    int lookFor;
    
    lookFor = 42;
    meetsCheck = false;
    
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number == lookFor)
      {
        meetsCheck = true;
      }
    }
    System.out.println("meetsCheck is  "+ meetsCheck);


//Contains no occurences of a specific number in 10 numbers
    lookFor = 42;

    meetsCheck = true;
    
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number == lookFor)
      {
        meetsCheck = false;
      }
    }
    System.out.println("meetsCheck is  "+ meetsCheck);


    //Numbers entered are in increasing order -- each number is bigger than the last 
    int follower;
    meetsCheck = true;

    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    
    for (int i = 2; i <= 10; i++)
    {
      follower = number;
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number <= follower)
      {
        meetsCheck = false;
      }
    }
    System.out.println("meetsCheck is "+ meetsCheck);

*/
/*
//Numbers entered are in non-decreasing order -- each number equal to or bigger than the last 
    int follower;
    meetsCheck = true;

    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    
    for (int i = 2; i <= 10; i++)
    {
      follower = number;
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number < follower)
      {
        meetsCheck = false;
      }
    }
    System.out.println("meetsCheck is "+ meetsCheck);
  }
  */

 

  //is String a Palindrome (harder) - Option A
  String text = "radar"; //Also check raddar (true) and raddaar (false)
  String currText;
  String followerText;
  meetsCheck = true;

  for (int i = 0; i < text.length()/2; i++)
  {
    currText = text.substring(i,i+1);
    followerText = text.substring(text.length()-1-i,text.length()-i);
    
    if (!currText.equals(followerText))
    {
      meetsCheck = false;
    }
  }
  System.out.println("meetsCheck is "+ meetsCheck);


/*
  //Is String a Palindrome (easier, but doesn't match structure of other checks)
  String text = "radar"; //Also check raddar (true) and raddaar (false)
  String reversedText = "";
  for (int i = 0; i < text.length(); i++)
  {
    reversedText = text.substring(i,i+1)+ reversedText;
  }
  if (text.equals(reversedText))
  {
    meetsCheck = true;
  }
  else
  {
    meetsCheck = false;
  }
  System.out.println("meetsCheck is "+ meetsCheck);
  */


  
  }
}