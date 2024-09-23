import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /*
    //Example 1
    //Print out all the values in the 2D array
    int [][] sillyExample = 
    { 
      { 90, 80, 70},
      { 10, 20, 30}
    };

    for (int i = 1; i <= sillyExample.length; i++)
    {
      for (int j = 1; j <= sillyExample[0].length; j++)
      {
        System.out.println("Here is sillyExample [" + i + "][" + j + "]: " + sillyExample[i][j]);

      }
    }
    //End Example 1
    */
    

    /*
    //Example 2
    //Print out all the values in the 2D array
    int [][] sillyExample = 
    { 
      { 90, 80},
      { 10, 20},
      { 200, 300}
    };

    for (int i = 0; i < sillyExample.length(); i++)
    {
      for (int j = 0; j < sillyExample.length(); j++)
      {
        System.out.println("Here is sillyExample [" + i + "][" + j + "]: " + sillyExample[i][j]);
      }
    }
    //End Example 2
    */
    

     
    //Example 3
    //Create a 2-D array to hold grades for all the students in a class.  Each row is the grades for one student in the class.  There are 3 grades for each student and 5 students in the course (wouldn't that be nice...).
    int [][] classGrades = new int[3][5];
    int grade;

    for (int i = 0; i < classGrades.length; i++)
    {
      System.out.println("Please enter the grades for student " + (i+1));
      for (int j = 0; j<classGrades[0].length; j++)
      {
        System.out.println("   Please enter grade " + (j+1) + " for student " + (i+1));
        grade = scan.nextInt();
        classGrades[i][j] = grade;
      }
      
    }
    //End Example 3
    
    
  }
}