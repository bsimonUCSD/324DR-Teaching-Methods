import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int input;

    System.out.println("Please enter your next number or 999 or -999 to stop");
    input = scan.nextInt();
    while (input != -999) && (input != 999)) //Missing ( in 1st expression
    {
      sum = sum + input;
      if input > 0 //Missing () -- this is different.  Syntax of language.  
      {
        count++ //Missing ;
      }
      //Missing Closing " below
      System.out.println("Please enter your next number or 999 or -999 to stop); 
      
    }
    //Missing } to close off main
}

//exmaple 1 is syntax of typing (really)
//example 2 Syntax of langauge -- how are instructions formed.

//Forgetting to put () around if statement expression
//= vs ==
// 5 = A -- putting variable on right



//Not done yet.

//- storing double into int
//
//Forgetting to put the type first when declaring a variable.