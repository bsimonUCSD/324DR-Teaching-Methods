import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    /*
    //Example 1
    int i;
    System.out.println("Please enter an integer value for i and I will count up from there to 10");
    i = scan.nextInt();
    while (i > 10)   //Loop never runs (boolean expression is true when we want stop)
    {
      System.out.println("In loop i is "+ i);
      i--;
    }
    System.out.println("After loop i is "+ i);
    //End Example 1
    */

    /*  
    //Example 2
    int i;
    System.out.println("Please enter an integer value for i and I will count up from there to 10");
    i = scan.nextInt();
    while (i < 10)   
    {
      i--; //Infinite loop iterator doesn't get closer to goal
    }
    System.out.println("After loop i is "+ i);
    //End Example 2
    */

    /*
    //Example 3
    int i;
    System.out.println("Please enter an integer value for i and I will count up by 2s until I reach 15");
    i = scan.nextInt();
    while (i != 15)   
    {
      i+=2;  //Infinite loop increment skips iterator over stopping point
    }
    System.out.println("After loop i is "+ i);
    //End Example 3
    */
    
    /*
    //Example 4
    String word;
    System.out.println("Please enter a String value for i and I will print out the entire string, then the string without the first character, etc. until the string is gone");
    word = scan.nextLine();
    while (word.length() != 0)   
    {
      word = word.substring(0,word.length());
      System.out.println(word); 
       //Infinte loop, String always stays same length -- not reducing size by 1 
    }
    //End Example 4
    */
 
    /*
    //Example 5
    System.out.println("Please enter a number in the range [0,100] or -1 to stop");
    int i = scan.nextInt();
    while (i == -1)   //Loop behaves the opposite of what it should (boolean expression is complement of what it should be)
    {
      System.out.println("Please enter a number in the range [0,100] or -1 to stop");
      i = scan.nextInt();
    }
    System.out.println("After loop i is "+ i);
    //End Example 5
    */
  }
}