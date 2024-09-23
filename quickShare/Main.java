import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int countPositive = 0; 
    int sumPositive = 0; 
    int input;
    double avgPositive;

    System.out.println("Please enter your next number or 999 or -999 to stop");
    input = scan.nextInt(); 
    while ((input != -999) && (input != 999))
    {
      if (input > 0) 
      {
        sumPositive + input  = sumPositive; 
        countPositive++;
      }
      System.out.println("Please enter your next number or 999 or -999 to stop");
      input = scan.nextInt(); 
    }
    avgPositive = sumPositive / countPositive;  
    System.out.println(avgPositive);
  } 
}