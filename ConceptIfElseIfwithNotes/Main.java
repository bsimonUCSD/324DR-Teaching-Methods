import java.util.*;

class Main {
  public static void main(String[] args) {

     /*
     //Example 1
     int age = 5;
     if (age == 5)
     {
       System.out.println("Welcome to kindergarten!");
     }
     else if (age >= 18)
     {
       System.out.println("You can vote!");
     }
     else //Use isn't mutually exclusive -- if you are 5 you are also not old enough to vote
     {
       System.out.println("You aren't old enough the vote!");
     }
     //End of Example 1
     */


     /*
     //Example 2
    int num = 0;
    if (num % 2 == 0)
    {
      System.out.println("Num is even.");
    }
    else if (num % 2 == 1) //else IF not needed, should be a simple if/else (legal but bad design)
    {
      System.out.println("Num is odd.");
    }
    //End Example 2
    */
    
    /*
    //Example 3
    //Note there are 2 different types of conceptual errors
    boolean isReady;
    if (Math.random() < 0.5)
    {
      isReady = true;
    }
    else
    {
      isReady = false;
    }

    if (isReady == true) //isReady is itself a boolean variable and has one of 2 values: true or false.  Although this is legal, it is better to write if (isReady)
    {
      System.out.println("Your order is ready!");
    }
    else if (isReady == false) //This can just be an else (but otherwise it would be if (!isReady))
    {
      System.out.println("Sorry! Your order is not ready yet!");
    }
    //End Example 3
    */
  }
}