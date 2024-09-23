class Main {
  public static void main(String[] args) {

    int x = 5;

    for (int i=0; i<x; i+=2) 
    { 
      
      for (int j=x-i; j>1; j-=2) 
      { 
        System.out.print("-"); //Print hyphens
      } 

      for (int j=0; j<=i; j++ ) 
      { 
        System.out.print("*"); //Print asterisks
      } 
    
      for (int j=x-i; j>1; j-=2) 
      { 
        System.out.print("-"); //Print hyphens
      } 

    System.out.println(); 
  } 
}

}