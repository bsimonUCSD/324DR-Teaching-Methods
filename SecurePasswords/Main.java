class Main {
  public static void main(String[] args) {

    /* 
    -It must be at least 7 characters long
    -It must have characters from at least 3 of the following 4 categories: Uppercase (A-Z), Lowercase (a-z), Digits (0-9), and Symbols 

TASK: If password is secure, print "secure"; otherwise, print "insecure".
*/
    String password = "Pa55w0rd!";
    boolean hasLower = false;
    boolean hasUpper = false;
    boolean hasDigit = false;
    boolean hasSymbol = false;



    if (password.length() < 7)
    {
      System.out.println("insecure");
    }
    else
    {
      //Loop over all chars
      for (int i = 0; i < password.length(); i++)
      {
        if (password.substring(i,i+1))
        //NOT COMPLETE
      }
    }
}