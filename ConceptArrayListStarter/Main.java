import java.util.*;

class Main {
  public static void main(String[] args) {

    /*
    //Example 1 
    
    ArrayList<Double> data = new ArrayList<Double>(); 

    data.add(-10.5);
    data.add(21.5);
    data.add(-32.0);
 
    //Replace all negatives with zero
    for (int i = 0; i < data.size(); i++)
    {
       if (data.get(i) < 0)
       {
         data.add(0.0); 
       }
    }
    //Print list
    for (int i = 0; i < data.size(); i++)
    {
       System.out.println(data.get
       (i));
    }
    //End Example 1
    */
        
    /*
    //Example 2 
    
    ArrayList<Double> data = new ArrayList<Double>(); 

    data.add(-10.5);
    data.add(21.5);
    data.add(-32.0);
    data.add(-50.5);
    int countSmaller = 0;
 
    //Count number of times following item is smaller
    for (int i = 0; i < data.size(); i++)
    {
       if (data.get(i) > data.get(i+1))
       {
         countSmaller++;
       }
    }
    System.out.println(countSmaller);
    
    //End Example 2
    */
    
    /*
    //Example 3
    
    ArrayList<Double> data = new ArrayList<Double>(); 

    data.add(-10.5);
    data.add(21.5);
    data.add(-32.0);
    data.add(-42.2);
    data.add(-52.7);
 
    //Remove all negatives
    for (int i = 0; i < data.size(); i++)
    {
       if (data.get(i) < 0)
       {
         data.remove(i); 
       }
    }

    //Print list
    for (int i = 0; i < data.size(); i++)
    {
       System.out.println(data.get
       (i));
    }
   
    //End Example 3
    */
    
    
    //Example 4
    
    ArrayList<Double> data = new ArrayList<Double>(); 

    data.add(-10.5);
    data.add(21.5);
    data.add(-32.0);
    data.add(-42.2);
    data.add(-52.7);
 
    //Duplicate every item
    for (int i = 0; i < data.size(); i++)
    {
      data.add(i+1,data.get(i)); 
    }
   
    //Print list
    for (int i = 0; i < data.size(); i++)
    {
       System.out.println(data.get
       (i));
    }
    //End Example 4
    
  }
}