class Main {
  public static void main(String[] args) 
  {

    /* Recall that a DNA sequence is a string over the alphabet {A,C,G,T}. The "GC-Content" of a DNA sequence is the proportion of characters of the sequence that are either G or C. For example, the GC-Content of the sequence ACGTA is 2/5 = 0.4.*/

    double count = 0;
    double gcContent; 
    String[] sequence = {"G", "C", "A", "A", "T", "C", "T", "G", "T"};

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