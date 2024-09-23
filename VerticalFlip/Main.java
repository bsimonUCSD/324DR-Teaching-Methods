class Main {
  public static void main(String[] args){
    int [] [] greyPic = 
    {
      {140, 170, 190},
      {180, 200, 160},
      {200, 210, 222},
      {200, 100, 110}
    };

    int temp;
    int bottomRowIndex;

    for (int i = 0; i < (greyPic.length/2); i++)
    {
      bottomRowIndex = (greyPic.length)-1-i;
      for (int j = 0; j < greyPic[i].length; j++)
      {
        temp = greyPic[i][j];
        greyPic[i][j] = greyPic[bottomRowIndex][j];
        greyPic[bottomRowIndex][j] = temp;
      }
    }

    //Print out
    for (int i = 0; i < greyPic.length; i++)
    {
      for (int j = 0; j < greyPic[i].length; j++)
      {
        System.out.print(greyPic[i][j]+ " ");
      }
      System.out.println();
    }
 
  }
}