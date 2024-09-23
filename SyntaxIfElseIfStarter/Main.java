class Main {
  public static void main(String[] args) {
    /*Note: This code doesn't make sense overall as a program that accomplishes a goal. Instead it is a series of independent if statements for debugging practice.
    
    For this debugging exercise, each example is placed in it's own comments.  Uncomment it to explore that example.  For students, you may prefer to make multiple separate programs with just one if example in each.
     */ 
    
    /*
    //Example 1
    int b = 3;
    if (b % 2 == 0); 
    {
      System.out.println("b is even");
    }
    //End Example 1
    */

   /* 
    //Example 2
    int c = 3;
    if (c % 2 == 0); 
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
    System.out.println("The value of d is "+d);
    //End Example 3
    */

    /*
    //Example 4 - 2 mistakes
    int num = 0;
    if (num > 0)
    {
      System.out.println("Num is positive.");
    }
    elseif (num = 0)
    {
      System.out.println("Num is zero.");
    }
    else
    {
      System.out.println("Num is negative.");
    }
    //End Example 4
    */

    
    //Note: How the String compareTo method works https://www.tutorialspoint.com/java/java_string_compareto.htm
    //Note: lexicographic order is "dictionary order", but upper case is all "before" lowercase in the dictionary https://en.wikipedia.org/wiki/List_of_Unicode_characters

    //Example 5
    String word = "alpha";
    if (word.compareTo("c") < 0)
    {
      System.out.println(word +" comes before c in the alphabet");
    }
    else if (word.compareTo("c") > 0) 
    {
      System.out.println(word +" comes after c in the alphabet");
    }
      System.out.println(word +" is c");  
    //End Example 5
    

    
  }
}