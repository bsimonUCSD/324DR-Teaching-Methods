class Main {
  public static void main(String[] args) {
    
    int[] nums = {-10,5,-13,-21};
    for (int i = 0; i < nums.length-1; i++)
    {
      if (nums[i] < 0 && nums[i+1] > 0)
      {
        nums[i] = 0;
      }
    }
  }

  public static void printArray(int[] nums)
  {
    for (int item: nums)
      System.out.print(item + ", ");
    System.out.println();  
  }
}