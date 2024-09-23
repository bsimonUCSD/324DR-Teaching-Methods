class Main {
  public static void main(String[] args) {
    
    int[] data = {10,20,30,40,50,60};
    int swapTemp;
    int countDownIndex;

    for (int countUpIndex = 0; countUpIndex<data.length/2; countUpIndex++)
    {
      countDownIndex = data.length-1-countUpIndex;
      swapTemp = data[countUpIndex];
      data[countUpIndex] = data[countDownIndex];
      data[countDownIndex] = swapTtemp; 
    }

    for (int i = 0; i < data.length; i++) 
    {
      System.out.print(data[i] + ", ");
    }
  }
}