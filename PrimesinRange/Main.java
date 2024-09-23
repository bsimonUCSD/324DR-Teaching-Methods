import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int lowerLimit;
    int upperLimit;
    boolean notPrime = false;
    int countOfPrimes = 0;

    System.out.println("What is the lowest number you want to test?");
    lowerLimit = scan.nextInt();

    System.out.println("What is the highest number you want to test?");
    upperLimit = scan.nextInt();

    for (int i = lowerLimit; i<=upperLimit; i++)
    {
      notPrime = false;
      for (int j = 2; j < i; j++)
      {
        //System.out.println("Testing i " + i + " and j " + j);
        if (i % j == 0)
        {
          notPrime = true;
        }
      }
      if (notPrime == false)
      {
        countOfPrimes++;
        //System.out.println(i + " is prime");
      }
    }
    System.out.println(" There are " + countOfPrimes + " primes between " + lowerLimit + " and " + upperLimit);
  }
}