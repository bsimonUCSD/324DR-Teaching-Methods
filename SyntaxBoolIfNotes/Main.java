
class Main {
  public static void main(String[] args) {
    /*Note: This code doesn't make sense overall as a program that accomplishes a goal. Instead it is a series of independent if statements for debugging practice.
    
    For this debugging exercise, each example is placed in it's own comments.  Uncomment it to explore that example.  For students, you may prefer to make multiple separate programs with just one if example in each.
     */ 

    
    /*
    //Example 1
    int b = 3;
    if (b % 2 == 0);  //There should not be a ; after the boolean expression.  This causes the if statement to be over (no instructions controlled).  The print statement is ALWAYS executed.
    {
      System.out.println("b is even");
    }
    //End Example 1
    */
    
    

    /*
    //Example 2
    int c = 3;
    if (c % 2 == 0); //There should not be a ; after the boolean expression.  This causes the if statement to be over (no instructions controlled).  In this case this leads to the compiler finding the else keyword below as an error: 'else' without 'if'
    {
      System.out.println("c is even");
    }
    else
    {
      System.out.println("c is odd");
    }
    //End Example 2
    */
    
    
    

    /* 
    //Example 3:  This code should decrease the value of d only if d is positive.  Note: You may need to try a different value for d to see what is happening.

    int d = -10;
    if (d > 0)
      System.out.println("About to decrease d by 10.");
      d = d - 10;
       //Indenting does not control what is in the true (or false) portion of an if.  You must use {} to indicate what instructions are controlled by the if, otherwise Java will assume only one instruction is controlled by the if.  Encourage students to always use {} even if there is only one instruction controlled
    System.out.println("The value of d is "+d);
    //End Example 3
    */

  }
}