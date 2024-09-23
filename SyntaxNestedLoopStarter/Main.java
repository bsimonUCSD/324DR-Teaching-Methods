import java.util.*;

class Main {
  public static void main(String[] args) {
    

    //Example 1
    for (int i = 0; i < 5; i++)
    {
      for (int i = 20; i < 25; i++)
      {
        System.out.println("Inner loop ");
      }
      System.out.println("Outer loop ");
    }
  
  //End Example 1

  

  
    //Example 2
    //Hint: Print out i and j to see what is happening
    for (int i = 0; i < 3; i++)
      for (int j = 20; j < 25; j++)
      {
        System.out.println("Inner loop");
      }
      System.out.println("Outer loop");
      
    //End Example 2
    
  

  }
}