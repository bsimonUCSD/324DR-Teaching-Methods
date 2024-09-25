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
    mostWantedFollower = number;

    for (int i = 2; i <= 10; i++)
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
  }
}