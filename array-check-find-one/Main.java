class Main {
  public static void main(String[] args) {
    
    int [] numbers = {100,90,80,60,60,50}; //Note this could be set to any values or length
    int currentNumber;
    boolean found;
    int i;

    //Check if a specific value exists 
    int lookFor = 60;
    found = false; //Assume we don't find it, can stop looking when found becomes true

    //i is the index we are next looking at in the array and (if found) the index where lookFor was 1st found in the array (from left to right)
    i = 0;
    //While not looked over entire array AND found is still false (!found is true)
    while (i < numbers.length && !found)
    {
      currentNumber = numbers[i];
      if (currentNumber == lookFor)
      {
        found = true;
      }
      else //Only update i if we didn't find it yet
      {
      i++;
      }
    }
    System.out.println("Found is "+ found);
    if (found)
    {
      System.out.println("At index "+ i);
    }



    //Check if at least ONE element is evenly divisible by 10 (has a specific property)
    found = false; //Assume we don't find it, can stop looking when found becomes true

    //i is the index we are next looking at in the array and (if found) the index where the first element in the array (from RIGHT TO LEFT) was found to have that property
    i = numbers.length-1;
    //While not looked over entire array (right to left) AND found is still false (!found is true)
    while (i >= 0 && !found)
    {
      currentNumber = numbers[i];
      if ((currentNumber % 10) == 0)
      {
        found = true;
      }
      else //Only update i if we didn't find it yet (reduce index by 1)
      {
      i--;
      }
    }
    System.out.println("Found is "+ found);
    if (found)
    {
      System.out.println("At index "+ i);
    }
    

    //Deteremine presence of duplicate elements (one right after the other)

    int previousNumber; //Holds the number to the left of currentNumber
    found = false; //Assume we don't find it, can stop looking when found becomes true

    //i is the index we are next looking at in the array and (if found) the index where right-most element of the 1st pair found is (from left to right)
    //Start with index 1 and compare to the element to the left (index 0)
    i = 1;

    //While not looked over entire array AND found is still false (!found is true)
    while (i < numbers.length && !found)
    {
      currentNumber = numbers[i];
      previousNumber = numbers[i-1];
      if (currentNumber == previousNumber)
      {
        found = true;
      }
      else //Only update i if we didn't find it yet
      {
      i++;
      }
    }
    System.out.println("Found is "+ found);
    if (found)
    {
      System.out.println("At index "+ i);
    }

  }
}