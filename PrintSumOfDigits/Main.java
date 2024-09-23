import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int lastDigit;
    int sum = 0;
    
    System.out.println("Please enter a positive integer number");
    number = scan.nextInt();

    while (number> 10)
    {
      lastDigit = number % 10;
      sum = sum + lastDigit;
      number = number / 10;
    }
    sum = sum + number;
    System.out.println("Sum of digits "+ sum);
  }
}