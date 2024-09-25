 import java.util.*; 

    public class WordPairsList
    {
        private ArrayList<WordPair> allPairs;
   
        public WordPairsList(String[] words) 
        {   
           allPairs = new ArrayList<WordPair>();   
           // nested loops through the words array to add each pair to allPairs
           for(int i=0; i < words.length; i++)
             for(int j=i+1; j < words.length; j++)
                allPairs.add(new WordPair(words[i],words[j]));
        
        }

        ****
        ***
        **
        *
   
        public int numMatches() 
        {
          int count = 0;
          //Write the code for the second part described below
          for(WordPair w : allPairs) {
             if (w.getFirst().equals(w.getSecond()))
                 count++;
          }
          return count;
        }
        
        public String toString() {
            return allPairs.toString();
        }
    }