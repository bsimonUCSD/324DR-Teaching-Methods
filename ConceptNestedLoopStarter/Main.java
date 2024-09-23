import java.util.*;

class Main {
  public static void main(String[] args) {

    /*
    //Example 1
    //Print a rectangle 3 rows, 5 columns each (height = 3, width = 5)
    for (int i = 1; i <= 3; i++)
    {
      for (int j = 1; j<=5; j++)
      {
        System.out.println("*");
      }
      System.out.println();
    }
    //End Example 1
    */

  
    /*
    //Example 2
    //Print a tree 4 high
    //*
    //**
    //***
    //****
    for (int i = 1; i <= 4; i++)
    {
      //Uses if statement instead of inner loop controlled by outer loop iterator value
      if (i==1) 
      {
        System.out.print("*");
      }
      else if(i == 2)
      {
        System.out.print("**");
      }
      else if(i == 3)
      {
        System.out.print("***");
      }
      else
      {
        System.out.print("****");
      }
      System.out.println();
    }
    //End Example 2
    */

    /*
    //Example 3
    //Print a right-justified tree
    //   *
    //  **
    // ***
    //****
    for (int i = 1; i <= 4; i++) 
    {
      if (i == 1) 
      {
        System.out.print("   ");
      } 
      else if (i == 2) 
      {
        System.out.print("  ");
      } 
      else if (i == 3) 
      {
        System.out.print(" ");
      } 
      else 
      {
        System.out.print("");
      }
      for (int j = 1; j <= i; j++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
    //End Example 3
    */

    
    //Example 4
     //This works, but can you re-write it in an easier to explain manner?
    //Print a triangle
    //*****
    //****
    //***
    //**
    //*
    for (int i = 1; i <= 5; i++)
    {
      for (int j = 1; j <= 5 - i + 1; j++)
     
      {
        System.out.print("*");
      }
      System.out.println();
    }
    //End Example 4
    
  
  }

}