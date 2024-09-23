import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int guess;
    int winningNumber= (int)(Math.random()*10)+1;
    
    System.out.println("Please guess an integer number in the range [1,10]");
    guess = scan.nextInt();

    while (guess != winningNumber)
    {
      if (guess > winningNumber)
      {
        System.out.println("Too high!");
      }
      else
      {
        System.out.println("Too low!");
      }
      System.out.println("Please guess an integer number in the range [1,10]");
      guess = scan.nextInt();
    }
    System.out.println("You guessed it!  The winning number was " + winningNumber);
  }
    
}