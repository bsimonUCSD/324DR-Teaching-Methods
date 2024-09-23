class Main {
  public static void main(String[] args) {
    
    /*
    //Example 1
    for (int i = 10; i > 0; i--); 
    // No ; at end -- no loop body
    {
      System.out.println("Hello "); //This is just the next instruction AFTER the loop
    }
    System.out.println("After loop");
    //end Example 1
    */
    
    /*
    //Example 2
    for (int i = 10; i > 0; i--); 
    // No ; at end -- no loop body
    {
      System.out.println("Counting up " + i); //This is not in scope since there is no for loop body
    }
    System.out.println("After loop");
    //End Example 2
    */

    /*
    //Example 3
    for (int i = 10, i > 0, i--) 
    // for loop with , between instead of ;
    {
      System.out.println("Counting " + i); 
    }
    System.out.println("After loop");
    //End Example 3
    */

    /*
    //Example 4
    //This loop is intended to run 10 times.
    for (int i = 10; i > 0; i--) 
    {
      i--;
      // Putting the loop update ALSO at bottom of loop 
    }
    System.out.println("After loop");
    //End Example 4
    */

    /*
    //Example 5 This code is legal, but professionally unacceptable style
    //This loop is intended to run 10 times.
    for (int i = 10; i > 0; ) 
    ///Leave out update in for loop header and put just in bottom of loop (legal, but not preferred)
    {
      System.out.println("Counting " + i);
      i--;
    }
    System.out.println("After loop");
    //End Example 5
    */

  }
}