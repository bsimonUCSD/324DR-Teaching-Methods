import java.util.*;

class Main {
  public static void main(String[] args) {
    /* 
    //Example 1
    //Print a rectangle 3 rows, 5 columns each (heigth = 3, width = 5)
    for (int i = 1; i <= 3; i++)
    {
      for (int j = 1; j<=5; j++)
      {
        System.out.println("*");
        //Should use print, not println
      }
      System.out.println();
    }
    //End Example 1
    */ 
    

    //Print out items bottom to top, leftmost column to rightmost.
    //Error -- entire row at a time, dtarting from bottom. -- swap so inner loop is changing rows.

    //Mirror horizontal  (make it vertical)
    // Error 1 -- copy top rowws into bottom
    // Error 2 -- copy left ro3ws into right
    //Fix Swap left and right

    //Each item is the average of those (blurring?) -- copying into new array -- see 
    //https://petapixel.com/2015/10/03/a-look-at-the-math-behind-image-blurs-and-filters/
  }