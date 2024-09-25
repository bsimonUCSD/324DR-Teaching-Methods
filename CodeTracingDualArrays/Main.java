import java.util.*; // import everything in package including ArrayList

class Main {
  public static void main(String[] args) {
    int[] arr1 = {20,40,10,30};
    int[] arr2 = {10,40,20,50};

    for (int i = 0; i < arr1.length; i++)
    {
      arr2[i] = arr1[i]-arr2[i];
    } 
    printArray(arr2);
  }

  pub
}