import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /* Problem Description: The following program should figure out the cost per person for a dinner including the tip.*/

    /* Directions: Write 5 comments to best describe what various sections of the code below are doing */

    double bill; 
    double tip;
    double total;
    int numPeople;
    double perPersonCost; 
    
    System.out.println("How much is the bill?");
    bill = scan.nextDouble();

    System.out.println("What percentage do you want to tip? e.g .1, .15, .2");
    tip = scan.nextDouble();

    System.out.println("How many people are splitting the bill?");
    numPeople = scan.nextInt();

    total = bill + (bill * tip);
    perPersonCost = total / numPeople;

    System.out.println(perPersonCost);
  }
}