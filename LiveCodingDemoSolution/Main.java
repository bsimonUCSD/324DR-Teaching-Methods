import java.util.*; //Magic

/* Write a program that implements a guessing game.  The computer should pick a random integer in the range [-10,10].  It should then take guesses from the user (using Scanner and the nextInt() method -- provided in the starter code) until the value guessed by the user is within 2 of the randomly selected integer.  A congratulatory message shoild be displayed and the randomly selected integer and the final guess should be displayed.
*/

class Main {
  public static void main(String[] args) {
    //Declarations and Initializations
    Scanner scan = new Scanner(System.in); //magic
    int targetNumber; 
    int guess;
    
    targetNumber = ( (int)(Math.random() * 20)) - 10; //Guess a number between [-10,10]
    System.out.println("Please enter your guess");
    guess = scan.nextInt(); //magic

    //Loop
    while ( Math.abs(guess-targetNumber) > 2)
    {
      System.out.println("Sorry - not close enough.  Please guess again!");
      guess = scan.nextInt(); //magic
    }

    //After Loop
    System.out.println("Great job!  You guessed within 2 of the taregtNumber!");
    System.out.println("The target number was "+ targetNumber);
    System.out.println("Your final guess was "+ guess);
  }
}