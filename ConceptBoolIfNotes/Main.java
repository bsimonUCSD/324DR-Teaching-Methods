class Main {
  public static void main(String[] args) {
    /* Note: This code doesn't make sense overall as a program that accomplishes a goal. Instead it is a series of independent if statements for debugging practice.
    
    For this debugging exercise, each example is placed in it's own comments.  Uncomment it to explore that example.  For students, you may prefer to make multiple separate programs with just one if example in each.
     */ 

     /*
     //Example 1: This code should print "This is fun."" when a is less than 2.  It should always print "I love CS".

     int a = 1;
     if (a < 2)
     {
       System.out.println("This is fun.");
     }
     else //Students might think that both if and else cases of an if statement are run every time.  See also https://www.csteachingtips.org/tip/misconception-students-think-both-if-and-else-cases-conditional-are-executed-every-single-time
     {
       System.out.println("I love CS.");
     }
     //End Example 1
     */
    
    /*
    //Example 2: This code should increase the value of e if it is not a multiple of 3.  Note: This code works, but it is wierd and we don't want people to write code with an empty true block.  Fix the expression to correct it.

    int e = 7;
    if (e % 3 == 0) //if (! (e % 3 == 0) ) Note that because % has a higher precendence than == it will be done first.
    {

    }
    else
    {
      e++;
    }
    System.out.println("The value of e is " + e);

    //End Example 2
    */

    /*
    //Example 3:  This code shoudl set the String variable grade to either A, B, or C based on a 90,80,70 scale.

    int d = 81;
    String grade = "Not yet calcuated"; //Side note: if you don't initialize grade here, you get a compiler error warning (in the print) that grade may not be intialized.


    //BELOW: Students might think that conditions can't overlap.  That only one in a row can be true (that would be this case in an if else if - else). Alternately, each if can use a compound boolean expression.
    if (d >= 90)
    {
      grade = "A";
    }
    if (d >= 80) //(d>=80 && d <90)
    {
      grade = "b";
    }
    if (d >= 70)  //(d>=70 && d <80)
    {
      grade = "C";
    }
    System.out.println("Grade is " + grade);
    //End Example 3
    */

    /*
    //Example 4: This code works, but is inefficient and prone to errors when modified.  Change it to avoid duplicated code.
    
    int f = 11;
    int total = 0;
    if (f > 10)
    {
      f++;
      total = total + f;
      System.out.println("total is now "+ total);
    }
    else
    {
      f--;
      total = total + f;
      System.out.println("total is now "+ total);
    }
    //Move the calculation of total and the print statement (just one copy) to here, after the if statement.  Delete both lines from inside BOTH portions of the if and else code segments.

    //End Example 4
    */

  }
}