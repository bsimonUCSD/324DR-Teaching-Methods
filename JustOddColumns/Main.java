class Main {
  public static void main(String[] args) {
    int [][] a = { { 1,2,3,40}, {1,2,3,30}, {1,2,3,10} };
    
    int [][] b = new int [a.length][a[0].length/2];
    int i = 0;
    for (int row = 0; row < a.length; row++)
    {
      //Option A
      for (int col = 0; col < a[0].length; col+=2)
      {
         b[row][i++] = a[row][col];
         //Option B
      }
      //Option C
    }
    
    printArray(b);
  }

  public static void printArray(int[][] arr)
  {for (int row = 0; row < arr.length; row++)
    {
      for (int col = 0; col < arr[0].length; col++)
      {
        System.out.print(arr[row][col]+ " ");
      }
      System.out.println();
    }
  }
}