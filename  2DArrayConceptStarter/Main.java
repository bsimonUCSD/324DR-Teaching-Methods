import java.util.*;

class Main {
  public static void main(String[] args) {
    
    //DON'T PANIC:  It looks long but many are very fast
    //If needed, check the reading where you got this link for hints (scroll down).

    /*
    //Example 1
    //Change to print out in column-major order (down the leftmost column, then move right to the next column, etc. )
    int[][] sillyExample  = 
    {
      {10, 20, 30},
      {40, 50, 60},
      {70, 80, 90},
      {100, 110, 120}
    };

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        System.out.println(sillyExample[i][j]);
      }
    }
    //End Example 1
    */
    
    
    /*
    //Example 2
    //Change to printout in row-major order, but each row from right to left. )
    int[][] sillyExample  = 
    {
      {10, 20, 30},
      {40, 50, 60},
      {70, 80, 90},
      {100, 110, 120}
    };

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        System.out.println(sillyExample[i][j]);
      }
    }
    //End Example 2
    */

    /*
    //Example 3
    //Change to make an "X" of zero values.  Replace the values on the diagonals of the array with zeros.
    //RESTRICTION: The 2D array must be "square" (equal length rows and columns)

    //Here's a 5 by 5 example to test 
    //int[][] sillyExample  = 
    //{
    //  {9, 2, 3, 5, 6},
    //  {4, 5, 6, 5, 6},
    //  {7, 8, 9, 5, 6},
    //  {6, 7, 8, 9, 9},
    //  {2, 4, 5, 5, 6}
    //};

    //Here's a 4 by 3 example to test
    int[][] sillyExample  = 
    {
      {9, 2, 3, 5},
      {4, 5, 6, 5},
      {7, 8, 9, 5},
      {6, 7, 8, 9}
    };

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        sillyExample[i][j] = 0;
      }
    }

    //Print out
    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        System.out.print(sillyExample[i][j] + " ");
      }
      System.out.println();
    }
    //End Example 3
    */
  
    /*
     //Example 4
    //Mirror around horizontal axis.  In the example below, just describing the first row it would become 35, 30, 20, 10
    //Would your solution work with an odd number of columns?
    int[][] sillyExample  = 
    {
      {10, 20, 30, 35},
      {40, 50, 60, 65},
      {70, 80, 90, 95},
      {100, 110, 120, 125}
    };

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        //Fill in code to mirror
      }
    }

    //Print out
    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        System.out.print(sillyExample[i][j] + " ");
      }
      System.out.println();
    }
    //End Example 4
    */
    
    
    //Example 5
    //Produce a second array the same size as the first with each item replaced by the average of itself and the items above, below, left and right of it.
    int[][] sillyExample  = 
    {
      {10, 20, 30, 30},
      {40, 50, 60, 60},
      {70, 80, 90, 90},
      {100, 110, 120, 120}
    };

    //OK to truncate avg calculation
    int [][] blurred = new int[4][4];
  
    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        //Add code to fill in blurred array
      }
    }
    //End Example 5
    */
  }
}