import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String movieTitle;
    String actor;

    System.out.println("Please enter the movie title:");
    movieTitle = scan.nextLine();
    System.out.println("Please enter the starring actor name:");
    actor = scan.nextLine();

    String totalLen = "*Now Playing: " + movieTitle + " Starring: " + actor+"*";
    String firstLine = "";
    String secondLine = "";

    for (int i = 0; i < totalLen.length(); i++) {
      firstLine += "*";
      if (i == 0 || i == (totalLen.length() - 1)) {
        secondLine += "*";
      } else {
        secondLine += " ";
      }
    }

    System.out.println(firstLine);
    System.out.println(secondLine);
    System.out.println(totalLen);
    System.out.println(secondLine);
    System.out.println(firstLine);

  }
}