import java.util.*;

class Main {
  public static void main(String[] args) {
    

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

    //Example 3
    //Change to make an "X" of zero values.  In the array below you would replace these values with 0: 10, 50, 90, 125, 35, 60, 80, 100
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
        sillyExample[i][j] = 0;
      }
    }
    //End Example 3

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
        sillyExample[i][j] = 0;
      }
    }
    //End Example 4

    //Example 5
    //Produce a second array the same size as the first with each item replaced by the average of itself and the items above, below, left and right of it.
    int[][] sillyExample  = 
    {
      {10, 20, 30, 35},
      {40, 50, 60, 65},
      {70, 80, 90, 95},
      {100, 110, 120, 125}
    };

    int [][] blurred = new int[4][4];

    for (int i = 0; i < sillyExample.length; i++)
    {
      for (int j=0; j < sillyExample[i].length; j++)
      {
        //Add code to fill in the blurred array
      }
    }
    //End Example 5

  }
}