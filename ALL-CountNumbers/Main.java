import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int count;

    //Count number of occurrences of a specific number in 10 numbers
    int lookFor = 42;
    count = 0;
    
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number == lookFor)
      {
        count = count + 1;
      }
    }
    System.out.println("The count is "+ count);


    //Count number of negatives in 10 numbers (meeting specific criteria)
    count = 0;
    
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number < 0) 
      {
        count = count + 1;
      }
    }
    System.out.println("The count is "+ count);

    //Count all positive multiples of 10 (meeting specific criteria)
    count = 0;
    
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number > 0 && ((number % 10) == 0)) 
      {
        count = count + 1;
      }
    }
    System.out.println("The count is "+ count);
  }
}