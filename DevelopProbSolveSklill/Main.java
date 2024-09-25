import java.util.*;

class Main {
  public static void main(String[] args) {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(100);
      nums.add(90);
      nums.add(80);
      nums.add(70);
      
      /* Shift left
      int shiftedOff = nums.get(0);
      for (int i=0; i<nums.size()-1; i++)
      {
        nums.set(i, nums.get(i+1));
      }
      nums.set(nums.size()-1, shiftedOff);

      System.out.println(nums);
      */
      
      

      /*Insert a -1 after every original element
      
System.out.println(nums);

      for (int i=0; i<nums.size()-1; i=i+2)
      {
        nums.add(i+1,-1);
       
      }

*/
  //Delete all multiples of 10

/*
System.out.println(nums);

      for (int i=0; i<nums.size(); i++)
      {
        System.out.println(i);
        if( (nums.get(i) % 10) == 0)
        {
          
          nums.remove(i);
          i--;
        }
      }

 System.out.println(nums);*/
   reverse(nums);
   System.out.println(nums);
      
      

  }

  public static void reverse(ArrayList<Integer> nums)
  {
      int temp;
      int countDown = nums.size()-1;

      for (int i=0; i<nums.size()/2; i++)
      {

        temp = nums.get(i);
        nums.set(i,nums.get(countDown));
        nums.set(countDown, temp);

        countDown--;
      } //End loop
  } //End method


}