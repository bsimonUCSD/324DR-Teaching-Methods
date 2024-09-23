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
     else
     {
       System.out.println("You aren't old enough to vote!");
     }
     //End of Example 1
     */

     
     //Example 2. This code works but is unprofessional in that it hinders readability
    int num = 11;
    if (num % 2 == 0)
    {
      System.out.println("Num is even.");
    }
    else if (num % 2 == 1)
    {
      System.out.println("Num is odd.");
    }
    //End Example 2
    
    
    
    
    //Example 3.  There are 2 different types of conceptual errors
    boolean isReady = false;
    if (Math.random() < 0.5)
    {
      isReady = true;
    }
    else
    {
      isReady = false;
    }

    if (isReady == true) 
    {
      System.out.println("Your order is ready!");
    }
    else if (isReady == false)
    {
      System.out.println("Sorry! Your order is not ready yet!");
    }
    //End Example 3
    
  }
}