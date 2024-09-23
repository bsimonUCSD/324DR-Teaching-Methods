import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String movieTitle;
    String actor;
    String marqueeText;

    System.out.println("Please enter the movie title:");
    movieTitle = scan.nextLine();
    System.out.println("Please enter the starring actor name:");
    actor = scan.nextLine();

    marqueeText = "Now Playing: " + movieTitle + " Starring: " + actor;


    // first row
    for (int i = 0; i < marqueeText.length() + 2; i++) 
    {
      System.out.print("*");
    }
    System.out.println();

    // second row
    System.out.print("*");
    for (int i = 0; i < marqueeText.length(); i++) 
    {
      System.out.print(" ");
    }
    System.out.println("*");

    // third row
    System.out.print("*");
    System.out.print(marqueeText);
    System.out.println("*");

    // fourth row
    System.out.print("*");
    for (int i = 0; i < marqueeText.length(); i++) 
    {
      System.out.print(" ");
    }
    System.out.println("*");

    // fifth row
    for (int i = 0; i < marqueeText.length() + 2; i++) 
    {
      System.out.print("*");
    }
    System.out.println();

  }
}