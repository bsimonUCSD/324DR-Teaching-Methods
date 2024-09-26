import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int followerNumber;
    String text;
    String currentText;
    String followerText;

    int count;

    //Occurrneces of an "a" following a space (" ")
    text = "a a r ed v ara k";
    currentText = text.substring(0,1);
    count = 0;

    for (int i = 1; i < text.length(); i++)
    {
      followerText = currentText;
      currentText = text.substring(i,i+1);

      if (currentText.equals(" ") && followerText.equals("a"))
      {
        count++;
      }
    }
    System.out.println("Count is "+ count);
    /*
    
    //Occurrences of "a" not followed by another "a"
    text = "aardvark";
    currentText = text.substring(0,1);
    count = 0;

    for (int i = 1; i < text.length(); i++)
    {
      followerText = currentText;
      currentText = text.substring(i,i+1);

      if (followerText.equals("a") && !currentText.equals("a"))
      {
        count++;
      }
    }
    System.out.println("Count is "+ count);

*/
  }
}