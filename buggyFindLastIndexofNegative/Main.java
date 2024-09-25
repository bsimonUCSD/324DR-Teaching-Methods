class Main {
  public static void main(String[] args) {

    int[] a = {-13,2,3,-4,5};
    int result = -1;
    for (int i = 0; i < a.length; i++) //Line 6
    {
      if (a[i] == 0)
      {
         result = i;
      }
    }

  }
}