class Main {
  public static void main(String[] args) {
    
    /*
    //Example 1
    int[] x = {1,3,5,6,8,9};

    for (int i = x.length-1; i >= 0; i--) 
    {
      System.out.println("Pairs are " + (x[i] + " " + x[i-1])); //Off-by-one array out of bounds off zero end
    }
    //Example 1
    */

    /*
    //Example 2
    //Shift up
    int[] x = {1,3,5,6,8,9};

    for (int i = 0; i < x.length-1; i++) 
    {
      x[i+1] = x[i]; //Ovrerwrites the value to the right, fix by looping from right to left; optional rotate rightmost value to leftmost location
    }
    for (int i = 0; i < x.length; i++) 
    {
      System.out.print(x[i] + " ");
    }
    //Example 2
    */

    /*
    //Example 3
    //Remove nth element
    int[] x = {1,3,5,6,8,9};
    int n = 3;

    for (int i = n; i < x.length-1; i++) 
    {
      x[i] = x[i+1]; 
    }
    //Last element is duplicated, fix by creating new array and copying in
    for (int i = 0; i < x.length; i++) 
    {
      System.out.print(x[i] + " ");
    }
    //Example 3
    */

  }
}