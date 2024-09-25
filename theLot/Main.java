import java.util.*;

class Main {
  public static void main(String[] args) {
  
    
    ArrayList<Integer> stuff= new ArrayList<Integer>();
    
    /*
    for (int i=0; i < 4; i++)
    {
      stuff.set(i, i+1);
    }
    
    for (int i=0; i < 4; i++)
    {
      stuff.add(i);
    }
    System.out.println(stuff);
  
  */
  /*
    ArrayList<String> names= new ArrayList<String>();
    names.add("Juli");
    names.add("Lucas");
    names.add("Sofia");
    wacky(names);
    System.out.println(names);
    */

    stuff.add(10);
    stuff.add(-20);
    stuff.add(-30);
    stuff.add(40);
    stuff.add(-50);

    int i = 0;
    while (i < stuff.size())
    {
      if (stuff.get(i)<0)
      {
        stuff.remove(i);
        //Line A
      }
      else
      {
        stuff.add(i+1, stuff.get(i));
        //Line B
      }
      //Line C
    }

    
    System.out.println(stuff);
  }

  

  public static void wacky(ArrayList<String> n)
  {
    n.set(1,"Ariana");
  }

}