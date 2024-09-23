import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    int num = 6;

    /*
    //Solution 1
    if (num % 3 == 0)
    {
      System.out.print("Fizz");
    }
    if (num % 5 == 0)
    {
      System.out.print("Buzz");
    }
    if (num % 3 != 0 && num % 5 != 0)
    {
      System.out.print(num);
    }
    //End Solution 1
    */

    //Solution 2
    if ( (num % 3 == 0) && (num % 5 == 0))
    {
      System.out.println("FizzBuzz");
    }
    else if (num % 3 == 0)
    {
      System.out.println("Fizz");
    }
    else if (num % 5 == 0)
    {
      System.out.println("Buzz");
    }
    else {
      System.out.println(num);
    }
    //End Solution 2
  }
}