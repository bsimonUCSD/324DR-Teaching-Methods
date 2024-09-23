import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    a = 0; 
    b = 0; 

    System.out.println("Please enter your next number or 999 or -999 to stop");
    x = scan.nextInt(); 
    while ((x != -999) && (x != 999))
    {
      if (x > 0) 
      {
        b + x = b; 
        a++;
      }
      System.out.println("Please enter your next number or 999 or -999 to stop");
      x = scan.nextInt();
    }
    c = b / a;  
    System.out.println(c);
  } 
}