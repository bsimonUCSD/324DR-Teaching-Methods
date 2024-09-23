class Main {
  public static void main(String[] args) {
    
    int[] data = {10,20,30,40,50};
    int temp;
    int j;

    for (int i = 0; i<data.length/2; i++)
    {
      j = data.length-1-i;
      temp = data[i];
      data[i] = data[j];
      data[j] = temp; 
    }

    for (int k = 0; k < data.length; k++) 
    {
      System.out.print(data[k] + ", ");
    }
  }
}