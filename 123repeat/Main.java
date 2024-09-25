class Main {
  public static void main(String[] args) {
    int [][] array = new int[5][7];
    int foo = 0;
    for (int row = 0; row < array.length; row++)
    {
      for (int col = 0; col < array[0].length; col++)
      {
        array[row][col] = foo % 3 + 1;
        foo++;
      }
    }

    printArray(array);
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