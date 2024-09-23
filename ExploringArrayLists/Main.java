import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList <Integer> scores = new ArrayList<Integer>();
    scores.add(95);
    scores.add(62);
    scores.add(77);
    scores.add(98);
    int userInput;
    int mostWanted;

    System.out.println("What should I do?  Enter an integer");
    userInput = scan.nextInt();

    if (userInput == 1)
    {
      mostWanted = 100;
      for (Integer value: scores)
      {
        if (value < mostWanted)
        {
          mostWanted = value;
        }
      }
    }
    else
    {
      mostWanted = 0;
      for (Integer value: scores)
      {
        if (value > mostWanted)
        {
          mostWanted = value;
        }
      } 
    }
    System.out.println("The mostWanted value is " + mostWanted);
  }
}