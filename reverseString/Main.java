class Main {
  public static void main(String[] args) {
    
    String orig = "Red Devils";
    String newString = "";
    for (int i = 0; i < orig.length(); i++)
    {
      newString = orig.substring(i,i+1) + newString;
    }
    System.out.println(newString);

    
    System.out.println(someThing("Red Devils"));

  }

    //public String someThing(String orig)


  public STATIC String someThing(String orig)
  {
     String newString = "";
     for (int i = 0; i < orig.length(); i++)
     {
       newString = orig.substring(i,i+1) + newString;
     }
     return newString;
  }


}