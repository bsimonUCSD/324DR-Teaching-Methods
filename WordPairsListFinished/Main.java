class Main {
   
        public static void main(String[] args)
        {
            String[] words = {"Hi", "there",  "Tyler", "Sam", "there"};
            WordPairsList list = new WordPairsList(words);
            System.out.println(list);
            // For second part below
            System.out.println("The number of matched pairs is: " + list.numMatches());
        }
    }      
    
    
