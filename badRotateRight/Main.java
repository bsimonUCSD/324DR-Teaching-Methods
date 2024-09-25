class Main {
  public static void main(String[] args) {
    /*int[] nums = {90,80,70,60,50};
    int temp = nums[nums.length-1];

    for(int i = 0; i < nums.length-1; i++)
    {
       nums[i+1]= nums[i];
    }
    nums[0] = temp; 
    */

    int[] nums = {90,80,70,60,50};
    
    for(int i = 0; i < nums.length-1; i++)
    {
       nums[i+1]= nums[i];
    }


    printArray(nums);
  }

  public static void printArray(int[] nums)
  {
    for (int item: nums)
      System.out.print(item + ", ");
    System.out.println();  
  }
}