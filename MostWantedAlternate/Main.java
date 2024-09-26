import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int mostWanted;

    //Max of 10 integers
    mostWanted = Integer.MIN_VALUE;
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (number > mostWanted)
      {
        mostWanted = number;
      }
    }
    System.out.println("Max is "+ mostWanted);
  }
}