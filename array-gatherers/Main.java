class Main {
  public static void main(String[] args) {
    

    int[] numbers = {100,90,80,70,60,50};
    int currentNumber;
    int sum;
    int average;

    //Sum and average of all
    sum = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      sum = sum + currentNumber;
    }
    System.out.println("Sum is "+ sum);
    System.out.println("Average is " + (double)sum/ (double)numbers.length);

    //Sum and average of evens
    sum = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      currentNumber = numbers[i];
      if ((currentNumber % 2)==0)
      {
        sum = sum + currentNumber;
      }
    }
    System.out.println("Sum is "+ sum);
    System.out.println("Average is " + (double)sum/ (double)numbers.length);
  }
}