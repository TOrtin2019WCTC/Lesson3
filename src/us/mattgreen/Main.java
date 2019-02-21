package us.mattgreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private final static FileInput indata = new FileInput("the_book.csv");
    private final static Map<String, Integer> map = new HashMap<String, Integer>();

    
    
    public static void main(String[] args) {
        new Main();
    }
    
    public Main() {
        String line;
        String[] words;

        while ((line = indata.fileReadLine()) != null) {
            // Remove anything that's not a letter or space
            line = line.replaceAll("[^a-zA-Z ]","")
                    .toLowerCase().trim();
           
            // Don't process lines with no characters
            if (line.isEmpty()) {
                continue;
            }
            
            // Split string over one or more spaces
            words = line.split(" +");
            
            // Look for each word in the map
            for (String word : words) {
                // This word isn't yet a key, init count to 1
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                }
                else {
                    // Increment count using word as key
                    map.put(word, map.get(word) + 1);
                }

            }
        }
        List<Word> wordList = new ArrayList();
        for(int i=0; i<10;i++)
        {
            wordList.add(new Word("",0));
        }

        // Loop over entries in the map, getting each key/value pair
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            for(int i = 0; i<wordList.size(); i++)
            {
                if(entry.getValue()>wordList.get(i).getCount())
                {
                    wordList.remove(i);
                    wordList.add(new Word(entry.getKey(),entry.getValue()));
                    i = 10;
                }
            }
        }
        for(Word w: wordList)
        {
            System.out.println(w.toString());
        }

        List<Word> wordListOne = new ArrayList();

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                wordListOne.add(new Word(entry.getKey(),entry.getValue()));
            }
        }
        System.out.println(wordListOne.size()+"Words only used once.");
    }
    
}