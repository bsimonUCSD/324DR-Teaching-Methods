class Main {
  public static void main(String[] args) {
    String name = "Beth";
    for (int i = 1; i < 6; i++) 
    {
      if (i == 1) 
      {
        for (int r = 0; r < 34 + name.length(); r++) 
        {
          System.out.print("*");
        }
        System.out.println();
      } 
      else if (i == 2) 
      {
        System.out.print("*");
        for (int r = 0; r < 32 + name.length(); r++) 
        {
          System.out.print(" ");
        }
        System.out.println("*");
      } 
      else if (i == 3) 
      {
        System.out.println("* Hello, " + name + "! Welcome to CSE 11! :) *");
      } 
      else if (i == 4) {
        System.out.print("*");
        for (int r = 0; r < 32 + name.length(); r++) 
        {
          System.out.print(" ");
        }
        System.out.println("*");
      } 
      else 
      {
        for (int r = 0; r < 34 + name.length(); r++) 
        {
          System.out.print("*");
        }
      }
    }

  }
}