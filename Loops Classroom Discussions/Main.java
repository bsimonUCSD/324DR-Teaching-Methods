import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
    //Question 1 - for loop double count
    //For debugging/understanding only
    int independentCount = 1;

    for (int i = 10; i < 40; i++)
    {
      //For debugging
      System.out.println("independentCount at beginning of loop "+independentCount);
      System.out.println("i at beginning of loop "+i);

      if (i % 5 == 0)
      {
        System.out.println("Going up!");
      }
      i++;
      //For debugging
      independentCount++;
      
    }
    */
    
    /*
    //Question 2 -- random trending down
    int i = 100;
    int oneNum;
    int anotherNum;
    
    //For debugging/understanding only
    int count = 0;
    while (i > 0)
    {
      oneNum = (int)(Math.random()*50);
      anotherNum = (int)(-1* Math.random() * 100);
      i = i + (oneNum+anotherNum); 

      //For debugging/understanding only
      System.out.println("oneNum "+ oneNum);
      System.out.println("anotherNum "+ anotherNum);
      System.out.println("i "+ i);
      count++;
    }
    //For debugging/understanding only
    System.out.println("Ended after "+ count);
    //Gernally less than 20 but varies because of behavior of random.

*/
/*
    //Question 3 -- inner loop controlled by outer iterator
    for (int i = 1; i <= 4; i++)
    {
      for (int j= 1; j <= i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    */

/*
    //Question 4 -- replace t with tt (infinite loop)
    String text = "there's a turtle";
    int index = text.indexOf("t");
    while (index >= 0)
    {
       text = text.substring(0,index)+"tt"+text.substring(index+1,text.length());

       index = text.indexOf("t");
       //For debugging/understanding only
       //System.out.println("text at end of loop" + text);
       //System.out.println("index at end of loop" + index);
       
    }
    //Fro debugging/understanding
    System.out.println(text);
  */


    //Question 5
    Scanner scan = new Scanner(System.in);

    int x = 0;
    int y = 0;
    int number;
    for (int i= 1; i<=10; i++)
    {
        //Recommended debuging statements
        //System.out.print("Starting loop " + i);
        
        System.out.println("Please enter a number");
        number = scan.nextInt();
        if (number > y)
        {
          x = y;
          y = number;
          //Recommended debuging statements
          System.out.println("New max =" + y);System.out.println("New 2nd max =" + x);
        }
        else if (number > x)
        {
          x = number;
          //Recommended debuging statements
          System.out.println("New 2nd max =" + x);
        }
    }


  }
}