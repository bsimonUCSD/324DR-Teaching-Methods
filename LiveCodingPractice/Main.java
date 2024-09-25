import java.util.*; //Magic

/* Write a program that implements a guessing game.  
1) The computer should pick a random integer (targetNumber) in the range [-10,10].  
2) The user should repeatedly guess a value (guess)
3) Repeat until user's guess is within 2 of the randomly selected integer (targetNumber). 
4) A congratulatory message shoild be displayed and the randomly selected integer and the final guess should be displayed.
*/

class Main {
  public static void main(String[] args) {
    
    //Magic code (copy paste this code for use in your program -- maybe more than once)
    Scanner scan = new Scanner(System.in); //magic
    
  

    //Declarations & Init
    int targetNumber;
    int guess;

    targetNumber = ( (int) (Math.random() * 21) - 11);
    System.out.println("DEBUGGING: targetNumber is "+ targetNumber);
    System.out.println("Please enter a guess in the range [-10,10]");
    guess = scan.nextInt(); //magic

    //Loop guessing
    while ( Math.abs(guess-targetNumber) > 2)
    {
      System.out.println("Sorry!  Not close enough...");
      System.out.println("Please enter a guess in the range [-10,10]");
      guess = scan.nextInt(); //magic
    }

    //Congrats
    System.out.println("Great job!  You guessed within 2 of the taregtNumber!");
    System.out.println("The target number was "+ targetNumber);
    System.out.println("Your final guess was "+ guess);

  }
}