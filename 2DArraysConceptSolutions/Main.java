import java.util.*;

class Main {
  public static void main(String[] args) {
  

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
    for (int j=0; j < sillyExample[0].length; j++)
    //The column index changes slower than the row index -- so it is the outer loop.  Since we assume all rows are of same length (number of columns -- we can use the length of the 0th row)
    {
      for (int i = 0; i < sillyExample.length; i++)
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
      for (int j=sillyExample[i].length-1; j>=0; j--)
      //To print columns from right to left, count down starting at length-1 and including 0.
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
        if ((i == j) || ((i+j)==(sillyExample.length-1)))
        //The first expression catches the top left to bottom right line of the X
        //The second expression catches the top right to bottom left line of the X
        {
          sillyExample[i][j] = 0;
        }
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

    int temp;

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length/2; j++)
      //only loop over the first half of the row -- using integer truncated division -- if a rows is of odd length, the "middle" element is not touched.  This is just like reversing a 1-D array -- but done for each row.
      {
        
        temp = sillyExample[i][j];
        sillyExample[i][j] = sillyExample[i][sillyExample.length-1-j];
        sillyExample[i][sillyExample.length-1-j] = temp;
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
    

    /*
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
    int sum;
    int count;

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        sum = 0;
        count = 0;
        //Add code to fill in the blurred array
        //left
        if ((j-1)>=0) 
        {
          sum += sillyExample[i][j-1];
          count++;
        }
        //right
        if ((j+1 < sillyExample[i].length))
        {
          sum += sillyExample[i][j+1];
          count++;
        }
        //above
        if ((i-1)>=0) 
        {
          sum += sillyExample[i-1][j];
          count++;
        }
        //below//right
        if ((i+1 < sillyExample.length))
        {
          sum += sillyExample[i+1][j];
          count++;
        }
        sum += sillyExample[i][j];
        count++;

        blurred[i][j] = (int) ((double)sum) / count;
      }
    }

    //Print out
    for (int i = 0; i < blurred.length; i++)
    {
      for (int j=0; j < blurred[i].length; j++)
      {
        System.out.print(blurred[i][j] + " ");
      }
      System.out.println();
    }
    //End Example 5
  }
  */
}