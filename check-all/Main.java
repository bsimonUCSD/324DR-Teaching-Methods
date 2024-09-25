class Main {
  public static void main(String[] args) {

    int [] numbers = {100,90,80,60,60,50}; //Note this could be set to any values or length
    int currentNumber;
    boolean hasProperty;
    int i;

    //Check if all elements have a property (e.g., greater than 65)

/*
    //Assume all elements have the property, loop as long as we don't find an element without the property (set hasProperty to false) 
    hasProperty = true; 

    //i is the index we are next looking at in the array and (if hasProperty is false) the index where the 1st element in the array (from left to right) didn't have the property
    i = 0;
    //While not looked over entire array AND hasProperty is still true 
    while (i < numbers.length && hasProperty)
    {
      currentNumber = numbers[i];
      if (!(currentNumber > 65) ) //Alternate (currentNumber <= 65)
      {
        hasProperty= false;
      }
      else //Only update i if we are still looking
      {
      i++;
      }
    }
    System.out.println("All elements have the property is "+ hasProperty);
    if (!hasProperty)
    {
      System.out.println("And the index of the leftmost element that doesn't have the property is "+ i);
    }

*/

   //Check for the absence of any duplicate (one right after another) elements) 

   int previousNumber;

   //Assume array has the Property (no duplicates next to each other), loop as long as we don't find duplicate elements next to each other
    hasProperty = true; 

    //i is the index we are next looking at in the array and (if the array does have duplicates) the index where right-most element of the 1st pair of duplicates is locted (from left to right)
    //Start with index 1 and compare to the element to the left (index 0)
    i = 1;

    //While not looked over entire array AND hasProperty is still true 
    while (i < numbers.length && hasProperty)
    {
      currentNumber = numbers[i];
      previousNumber = numbers[i-1];
      if (currentNumber == previousNumber) 
      {
        hasProperty= false;
      }
      else //Only update i if we are still looking
      {
      i++;
      }
    }
    System.out.println("All elements have the property is "+ hasProperty);
    if (!hasProperty)
    {
      System.out.println("And the index of the leftmost element that doesn't have the property is "+ i);
    }


  }
}