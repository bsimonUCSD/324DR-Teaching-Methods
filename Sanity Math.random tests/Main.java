class Main {
  public static void main(String[] args) {
   int ranNum;
   for (int i=0;i<100000000;i++)
   {
     //replace the below with your expression with a call to random.  This one does [1,20)
     ranNum =   (int)(Math.random()*2)+1;
     
     //Set up conditionals the catch any and ALL values you don't want
     //For the sake of modification, I break them into individual ifs
     if (ranNum < 1) System.out.println("Oops - less than one");
     if  (ranNum >= 10)  System.out.println("Oops - too big");
   }
    System.out.println("Done");
  }
}