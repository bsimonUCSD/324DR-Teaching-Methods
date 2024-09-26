import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    boolean isSelfDivisor = true;
    int number;
    int currNumber;
    int digit;

    System.out.println("What number do you want to check is a self-divisor?");
    number = scan.nextInt(); 
    currNumber = number;

    while (currNumber > 0 && isSelfDivisor)
    {
      digit = currNumber % 10;

      //Any number with a zero digit can't be a self-divisor (we can't divide by zero)
      if (digit == 0)
      {
        isSelfDivisor = false;
      }
      else if (number % digit != 0)
      {
        //If this digit doesn't divide with zero remainder into the original number, this isn't a selfDivisor
        
        isSelfDivisor = false;
      }
      else
      {
        currNumber = currNumber / 10;
      }

    } //end while loop

    if (isSelfDivisor)
    {
      System.out.println(number + " is a self divisor");
    }
    else
    {
      System.out.println(number + " is NOT a self divisor");
    }
  }
}