import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int gatherer;


    //Sum of 10 numbers
    gatherer = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 

      gatherer = gatherer + number;
    }
    System.out.println("Sum is "+ gatherer);
    

    //Average of 10 numbers
    double average;
    gatherer = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 

      gatherer = gatherer + number;
    }
    average = gatherer/10;
    System.out.println("Average is "+ average);
    

    //Average of positive values of 10 numbers NOTE: Zero is not positive or negative
    int positiveCount = 0;
    double average;
    gatherer = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      
      if (number > 0) 
      {
        gatherer = gatherer + number;
        positiveCount = positiveCount + 1;
      }
      
    }
    if (positiveCount != 0)
    {
      average = gatherer/positiveCount;
      System.out.println("Average is "+ average);
    }
    else
    {
      System.out.println("No positive numbers entered");
    }
    

    //Average of odd numbers in 10 numbers
    double average;
    int oddCount = 0;
    gatherer = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      
      if ((number % 2) == 1) 
      {
        gatherer = gatherer + number;
        oddCount = oddCount + 1;
      }
      
    }
    if (oddCount != 0)
    {
      average = gatherer/oddCount;
      System.out.println("Average is "+ average);
    }
    else
    {
      System.out.println("No odd numbers entered");
    }
    


  }
}