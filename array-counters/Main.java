class Main {
  public static void main(String[] args) {

    int [] numbers = {100,90,80,70,60,50}; //Note this could be set to any values or length
    int currentNumber;
    int count;

    //Count number of occurrences of a specific number in 10 numbers
    int lookFor = 42;
    count = 0;

    for (int i = 0; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      if (currentNumber == lookFor)
      {
        count = count + 1;
      }
    }
    System.out.println("Count is "+ count);
  

  //Count all positive multiples of 10 (meeting specific criteria)
  count = 0;

    for (int i = 0; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      if ((currentNumber > 0) && ((currentNumber % 10) == 0)) 
      {
        count = count + 1;
      }
    }
    System.out.println("Count is "+ count);
    
  }
}