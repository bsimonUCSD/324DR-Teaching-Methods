class Main {
  public static void main(String[] args) {
    int[] nums1 = {3,5,7,9};
    int[] nums2 = {2,4,6,8};
    int[] result = new int[nums1.length+nums2.length];
    int j = 0;

    for (int i = 0; i < result.length/2; i++)
    {
       result[j++] = nums2[i];
       result[j++] = nums1[i]; 
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
