class Main {
  public static void main(String[] args) 
  {
    int foo = 3;
    int bar = 5;

    for (int i=1; i <= bar; i++)
    {
      for (int j=1; j<=foo/2; j++)
      {
        System.out.print("+");
      }
      for (int k=(foo/2)+1; k<=foo; k++)
      {
        System.out.print("-");
      }
      System.out.println();
    }
  }
}