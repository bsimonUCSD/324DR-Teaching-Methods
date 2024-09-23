import java.util.*;

class Main {
  public static void main(String[] args) {
    
    double bill = 48.43; 
    double tip = .2;
    double mystery1;
    int mystery2 = 3;
    double perPersonCost; 

    mystery1 = bill + (bill * tip);
    perPersonCost = mystery1 / mystery2;

    System.out.println(perPersonCost);
  }
}