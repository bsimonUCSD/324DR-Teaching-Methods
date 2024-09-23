import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int operator;
    double firstOperand;
    double secondOperand;

    System.out.println("What math would you like to do?");
    System.out.println("Enter 1 for +");
    System.out.println("Enter 2 for -");
    System.out.println("Enter 3 for *");
    System.out.println("Enter 4 for /");
    operator = scan.nextInt();

    System.out.println("What is your first operand?");
    firstOperand = scan.nextDouble();

    System.out.println("What is your second operand?");
    secondOperand = scan.nextDouble();

    if (operator == 1)
    {
      System.out.println("The result is "+ (firstOperand+secondOperand) );
    }
    else if (operator == 2)
    {
      System.out.println("The result is " + (secondOperand-firstOperand) );
    }
    else if (operator == 3)
    {
      System.out.println("The result is " + (firstOperand*secondOperand) );
    }
    else
    {
      System.out.println("The result is" + (firstOperand/secondOperand) );
    }
  }
}