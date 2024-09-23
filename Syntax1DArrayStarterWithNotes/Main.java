class Main {
  public static void main(String[] args) {
    
    /*
    //Example 1
    int[] x = {1,3,5,6,8,9};

    for (int i = 0; i < x.length(); i++) //Use ()
    {
      System.out.println(x(i)); //Use () instead of []
    }
    //End Example 1
    */

    /*
    //Example 2
    int[] x = {1,-1,2,-2};
    int sum = 0;

    for (int i = 1; i < x.length; i++)  
    {
      sum = sum + i; //Confuse index value with array value at that index
    }
    System.out.println("Sum is " + sum);
    //End Example 2
    */
    
    /*
    //Example 3
    int[] x = {1,3,5,6,8,9};

    for (int i = 1; i <= x.length; i++)  //Array index out of bound - Index [1,length] instead of [0,length)
    {
      System.out.println(x[i]);
    }
    //End Example 3
    */
     
     /*
    //Example 4
    int[] x = {1,3,5,6,8,9};

    for (int i = x.length; i >= 0; i--) //Array index out of bounds.  Start with x.length-1
    {
      System.out.println(x[i]);
    }
    //End Example 4
    */

    /*
    //Example 5
    int[] x = {1,3,5,6,8,9};

    for (int i = 0; i < x.length; i++) 
    {
      System.out.println("Difference is " + (x[i+1] - x[i])); //Off-by-one array out of bounds
    }
    //End Example 5
    */

  }
}