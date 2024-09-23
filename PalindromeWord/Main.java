//Not completed -- string is not 1d array

class Main {
  public static void main(String[] args) 
  {

    String[] word = {"G", "C", "A", "A", "T", "C", "T", "G", "T"};    

    for(int i =0; i < sequence.length; i++) 
    {
        if(sequence[i].equals("G") || sequence[i].equals("C")) {
            count++;
        }
    }
    gcContent = count/sequence.length;
    System.out.println("GC-Content is "+ gcContent);

    //Uncomment these lines to use the static method solution of the problem
    //double result = gcContent(sequence);
    //System.out.println("Result is " +result);
  }

  
  static double gcContent(String[] sequence2 ) {
    double cnt = 0;
    double gcC; 

    for(int i =0; i < sequence2.length; i++) 
    {
        if(sequence2[i].equals("G") || sequence2[i].equals("C")) {
            cnt++;
        }
    }
    gcC = cnt/sequence2.length;
    return gcC;
  }

}