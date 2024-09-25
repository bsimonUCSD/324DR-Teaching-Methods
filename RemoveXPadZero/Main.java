class Main {
  public static void main(String[] args) {

    int[] nums = {3,5,4,3};
    int toRemove = 3;
    int[] result = new int[nums.length];
    int j = 0;

    for(int i = 0; i < nums.length; i++) 
    {
      if (nums[i] != toRemove) 
      {
        result[j] = nums[i];
        j++;
      }
    }
   
   for(int i = j; i < nums.length; i++) 
   {
    result[i] = 0;
   }

    printArray(result);
  }


  public static void printArray(int[] nums)
  {
    for (int item: nums)
      System.out.print(item + ", ");
    System.out.println();  
  }
}