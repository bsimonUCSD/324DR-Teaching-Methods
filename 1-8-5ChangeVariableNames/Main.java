import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   
    /* Problem Description: The following program should figure out the cost per person for a dinner including the tip.*/

    /* Directions: Change the variable names to be descriptive of what the variable represents in the code */

    double v1; 
    double v2;
    double v3;
    int v4;
    double v5; 
    
    System.out.println("How much is the bill?");
    v1 = scan.nextDouble();

    System.out.println("What percentage do you want to tip? e.g .1, .15, .2");
    v2 = scan.nextDouble();

    System.out.println("How many people are splitting the bill?");
    v4 = scan.nextInt();

    v3 = v1 + (v1 * v2);
    v5 = v3 / v4;

    System.out.println(v5);
  }
}