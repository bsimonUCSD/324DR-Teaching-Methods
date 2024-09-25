class Main {
  public static void main(String[] args) {
    String [][] tree = { {"-", "-", "-", "*", "-", "-", "-"},
                    {"-", "-", "*", "*", "*", "-","-"},
                    {"-", "*", "*", "*", "*", "*","-"},
                    {"*", "*", "*", "*", "*", "*","*"}
                    };

    
printArray(tree);

    for (int foo = 0; foo < tree[0].length; foo++)
    {
      for (int bar = 0; bar < tree.length/2; bar++)
      {
         tree[bar][foo] = tree[tree.length-bar-1][foo];
      }
    }


    printArray(tree);
    
  }
  public static void printArray(String[][] arr)
  {
    for (int row = 0; row < arr.length; row++)
    {
      for (int col = 0; col < arr[0].length; col++)
      {
        System.out.print(arr[row][col]+ " ");
      }
      System.out.println();
    }
  }
}