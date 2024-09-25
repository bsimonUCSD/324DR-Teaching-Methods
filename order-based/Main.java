class Main {
  public static void main(String[] args) {

    int [] numbers = {100,90,80,70,60,50}; //Note this could be set to any values or length
    int currentNumber;
    int mostWanted;

    // Max of numbers array
    currentNumber = numbers[0];
    mostWanted = currentNumber;


    for (int i = 1; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      if (currentNumber > mostWanted)
      {
        mostWanted = currentNumber;
      }
    }
    System.out.println("Max is "+ mostWanted);

    //Count all positive multiples of 10 (meeting specific criteria)
    currentNumber = numbers[0];
    mostWanted = currentNumber;

    for (int i = 1; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      if (currentNumber < mostWanted)
      {
        mostWanted = currentNumber;
      }
    }
    System.out.println("Min is "+ mostWanted);


/*

    // Closest to 100 of 10 numbers 
    System.out.println("Please enter a number");
    number = scan.nextInt(); 
    mostWanted = number;

    for (int i = 2; i <= 10; i++)
    {
      System.out.println("Please enter a number");
      number = scan.nextInt(); 
      if (Math.abs(100-number) < Math.abs(100-mostWanted))
      {
        mostWanted = number;
      }
    }
    System.out.println("Closest to 100 is "+ mostWanted);
    */

  }
}

/* Other variations
-Furthest from a specific number
*/

    /*
    //Access consecutive pairs
    for (int i = 0; i < numbers.length-1; i++)
    {
      System.out.println("Pair (" + 
        numbers[i] + ", " +
        numbers[i+1] +")");
    }
    */
/*
    //Shift/rotate elements left
    int shiftedOff = numbers[0];
    for (int i = 0; i < numbers.length-1; i++)
    {
      numbers[i]=numbers[i+1];
    }
    numbers[numbers.length-1]= shiftedOff;
    printArray(numbers);
    */
/*
    //Shift/rotate elements right
    int shiftedOff = numbers[numbers.length-1];
    for (int i = numbers.length-2; i >= 0; i--)
    {
      numbers[i+1]=numbers[i];
    }
    numbers[0]= shiftedOff;
    printArray(numbers);
    */
/*
    //Reverse order of elements
    int temp;
    int countDown = numbers.length-1;
    for (int i = 0; i < numbers.length/2; i++)
    {
      temp = numbers[i];
      numbers[i] = numbers[countDown];
      numbers[countDown] = temp;
      countDown--;
    }
    printArray(numbers);

  }

  static void printArray(int[] num)
  {
    for (int n: num)
    {
      System.out.print(n + ", ");
    }
    System.out.println();
  }
  
}
*/