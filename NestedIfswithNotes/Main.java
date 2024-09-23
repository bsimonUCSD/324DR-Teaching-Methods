import java.util.*;

class Main {
  public static void main(String[] args) {
    
    /*
    //Example 1 NOTE: Not a "bug" yet.

    //Single instruction is an entire if/else statement (not that students usually expect this, but it is true).
    int x = 9;
    int a = 0;
    int b = 1;

    if (x > 10)
      if (a > b)
        x = 10;
      else
        x = 11;
    else
      if (a > b)
        x = -10;
      else
        x = -11;

    System.out.println("x is "+ x);

    //End Example 1
    */

    /*
    //Example 2

    //indenting and { } don't logically match up

    int x = 9;
    int a = 0;
    int b = 1;

    if (x > 10)
    {
      if (a > b)
        x = 10;
    }
      else 
        x = 11;
    System.out.println("x is "+ x);
    //End Example 2
    */

    /*
    //Example 3
    int x = 11;
    int a = 1;
    int b = 0;

    if (x > 10)
    {
      if (x > 10 && a > b) //Not illegal, but poor programming style - don't need to recheck x > 10
      {
        x = 10;
      }
    }
    //End Example 3
    */

    /*
    //Example 4
    //This is legal and even good to show the equivalence with if-else if - else -- but that structure is a better one.  This is harder to read with the indenting.
    int score = 88;
    String grade = "F";
    if (score >= 90)
    {
      grade = "A";
    }
    else 
    {
      if (score >=80)
      {
        grade = "B";
      }
      else
      {
        if (score >= 70)
        {
          grade = "C";
        }
        else 
        {
          if (score >= 60)
          {
            grade = "D";
          }
          else
          {
            grade = "F";
          }
        }
      }
    }
    System.out.println("Grade is "+ grade);
    //End of Example 4
    */

    //Example 5
    int x = 11;
    int a = 1;
    int b = 0;
    if (x > 10)
    {
      if (a > b)
      {
        x = 10;
        a++; //Same code in both if and else - not illegal but is "bad" in terms of design and communication.  Important for programmer to recognize that the increment of a is JUST based on whether x > 10
        
      }
      else 
      {
        x = 11;
        a++; //Same code in both if and else - not illegal but is "bad" in terms of design and communication.  Important for programmer to recognize that the increment of a is JUST based on whether x > 10
      }
    }
    //End of Example 5



 


  }
}