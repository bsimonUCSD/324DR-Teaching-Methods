import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> favorites = new ArrayList<String>();
    favorites.add("chips");
    favorites.add("chicken");
    favorites.add("mac and cheese");
    favorites.add("corn");
    favorites.add("peach cobbler");
    favorites.add("ribs");
    favorites.add("collard greens");

    ArrayList<String> choices = new ArrayList<String>();
    choices.add("corn");
    choices.add("ice cream");
    choices.add("chips");
    choices.add("collard greens");
    choices.add("chicken");
    choices.add("devilled eggs");
    choices.add("ribs");
    choices.add("mac and cheese");
    choices.add("pie");
    choices.add("peach cobbler");
    choices.add("cookies");
    choices.add("hamburger");

    int numMatches = 0;
    String currentChoice;

    for (int i = 0; i < 4; i++)
    {
      for (String item: choices)
      {
        System.out.print(item + ", ");
      }
      System.out.println();
      System.out.println("What item would you like me to buy?");
      currentChoice = scan.nextLine();
 
      if (favorites.contains(currentChoice))
      {
        numMatches++;
        System.out.println("That's a favorite of mine!");
      }

      /*
      //Alternate solution using a loop
      for (String oneFavorite: favorites)
      {
        if (oneFavorite.equals(currentChoice))
        {
          numMatches++;
          System.out.println("That's a favorite of mine!");
        }
      }
      */
    }

    System.out.println("You picked " + numMatches + " foods that are also favorites of mine.");

  }
}