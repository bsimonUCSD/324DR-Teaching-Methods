class Main {
  public static void main(String[] args) {
    int [][]a = { { 1,2,3}, {1,2,3}, {1,2,3} };
    int [][]b = { {10,-2}, {-2, 20}};


    //int c[][] = new int [Math.min(a.length, b.length)] [Math.min(a[0].length,b[0].length)];
    int [][]c = new int [3][3];

    for (int row = 0; row < c.length; row++)
    {
      for (int col = 0; col < c[0].length; col++)
      {
         c[row][col] = a[row][col]+b[row][col];
      }
    }
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