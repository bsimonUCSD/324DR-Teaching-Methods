import java.util.*;

class Main { 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input;
    int mystery1 = 0;
    int mystery2 = 0;
    double mystery3;

    for (int i = 0; i < 5; i++)
    {
      System.out.println("Please enter a number");
      input = scan.nextInt();

      if(input > 0)
      {
        mystery1 = mystery1 + input;
        mystery2++;
      }
    }
    mystery3 = (double)mystery1 / mystery2;
    System.out.println("The answer is "+ mystery3);
  }
}