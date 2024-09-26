import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int mostWanted;
    int mostWantedFollower;

    //Second max (Second highest) of 10 numbers
    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    mostWanted = number;

    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    if (number > mostWanted)
    {
      mostWantedFollower = mostWanted;
      mostWanted = number;
    }
    else
    {
      mostWantedFollower = number;
    }

    for (int i = 3; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number > mostWanted)
      {
        mostWantedFollower = mostWanted;
        mostWanted = number;
      }
      else if (number > mostWantedFollower)
      {
        mostWantedFollower = number;
      }
    }
    System.out.println("Second max is "+ mostWantedFollower);

    //Second min (Second smallest) of 10 numbers
    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    mostWanted = number;

    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    if (number < mostWanted)
    {
      mostWantedFollower = mostWanted;
      mostWanted = number;
    }
    else
    {
      mostWantedFollower = number;
    }

    for (int i = 3; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number < mostWanted)
      {
        mostWantedFollower = mostWanted;
        mostWanted = number;
      }
      else if (number < mostWantedFollower)
      {
        mostWantedFollower = number;
      }
    }
    System.out.println("Second max is "+ mostWantedFollower);
    

    //Second closest to 50 of 10 numbers
    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    mostWanted = number;

    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    if (Math.abs(50-number) < Math.abs(50-mostWanted))
    {
      mostWantedFollower = mostWanted;
      mostWanted = number;
    }
    else
    {
      mostWantedFollower = number;
    }

    for (int i = 3; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 

      if (Math.abs(50-number) < Math.abs(50-mostWanted))
      {
        mostWantedFollower = mostWanted;
        mostWanted = number;
      }
      else if (Math.abs(50-number) < Math.abs(50-mostWantedFollower))
      {
        mostWantedFollower = number;
      }
    }
    System.out.println("Second closest to 50 is "+ mostWantedFollower);

  }
}
/* Other variations
-Second max even/odd/multiple of a number
-Second min even/odd/multiple of a number

-Second furthest from a number
*/