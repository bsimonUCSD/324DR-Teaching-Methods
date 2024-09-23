class Main {
  public static void main(String[] args) {
    
    /*
    //Example 1
    for (int i = 0; i == 10; i++) //Loop never runs (boolean expression is true when we want stop)
    {
      System.out.println("Counting up " + i);
    }
    System.out.println("After loop");
    //end Example 1
    */

    /*
    //Example 2
    for (int i = 10; i > 0; i++) //Infinite loop iterator doesn't get closer to goal
    {
      System.out.println("Counting up " + i);
    }
    System.out.println("After loop");
    //end Example 2
    */
  
    /*
    //Example 3
    for (int i = 0; i != 10; i+=3)  //Infinite loop increment skips iterator over stopping point
    {
      System.out.println("Counting up " + i);
    }
    System.out.println("After loop");
    //end Example 3
    */

    /*
    //Example 4
    String word = "starter";
    for (int i = 0; i < word.length(); i++) 
    //Infinte loop, String always increasing in length 
    {
      word = word + word.substring(0,1);
    }
    System.out.println("After loop");
    //end Example 4
    */
   
    
    //Example 4
    for (int i = 0; i < 10; i++) 
    {
      System.out.printn("Counting up "+ i);
    }
    System.out.println("After loop i is " + i);
    //Think iterator is available outside the loop

    //end Example 4
    

  }
}