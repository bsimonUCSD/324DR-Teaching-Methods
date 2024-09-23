import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /* Directions: Move the comments below to the place in the code the comment is describing */
    
    //Output cost per person
    
    //Calculate cost for each person
    
    //Declare variables
  
    //Calculate tip and total
    
    //Input data


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