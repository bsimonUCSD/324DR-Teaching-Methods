import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int gatherer;

    //Average of negative values of 10 numbers Note: Zero is neither positive or negative
    double average;
    gatherer = 0;
    for (int i = 1; i < 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      
      if (number < 0) 
      {
        gatherer = gatherer + number;
      }
      
    }
    average = gatherer/10;
    System.out.println("Average of negative values is "+ average);
  }
}