//Constructor initializes GladLIb object
    //ArrayList for nouns, verbs, and colors
    //Random object is used for generating random choices
//Then it reads the story template and processes each word
// Using a public method of makeStory
    //Reads a file/URL and loop over each word and if there's <label>, replace it.
    //Finding the labels straightforward with .indexOf() and .substring() for <noun> or <color>

    //Printing story displays words in the console
        //methods use parameterized line-width
        //Modify it as well to print the file 
        private void printOut(String s, int lineWidth) {
            int charsWritten = 0;
        }

//Instance Variables
        //Use array lists and name variables appropriately, create and initialize constructors, and have them all replace a word later on. 
        //Mainly using if/else statements

        //Modifying and extending classes and designs (be sure to use private when needed!)
        //https://en.wikipedia.org/wiki/Software_brittleness

import edu.duke.*;
import java.util.*;

public class GladLib {
    private ArrayList<String> adjectiveList;
    private ArrayList<String> nounList;
    private ArrayList<String> colorList;
    private ArrayList<String> countryList;
    private ArrayList<String> nameList;
    private ArrayList<String> animalList;
    private ArrayList<String> timeList;
    private ArrayList<String> verbList;

    private Random myRandom;

    private static String dataSourceURL = "http://dukelearntoprogram.com/course3/data";
    private static String dataSourceDirectory = "data";

    public GladLib() {
        initializeFromSource(dataSourceDirectory);
        myRandom = new Random();
    }

    public GladLib(String source) {
        initializeFromSource(source);
        myRandom = new Random();
    }

    private void initializeFromSource(String source) {
        adjectiveList = readIt(source + "/adjective.txt");
        nounList = readIt(source + "/noun.txt");
        colorList = readIt(source + "/color.txt");
        countryList = readIt(source + "/country.txt");
        nameList = readIt(source + "/name.txt");
        animalList = readIt(source + "/animal.txt");
        timeList = readIt(source + "/timeframe.txt");
        verbList = readIt(source + "/verb.txt");
    }

    private String randomFrom(ArrayList<String> source) {
        int index = myRandom.nextInt(source.size());
        return source.get(index);
    }

    private String getSubstitute(String label) {
        if (label.equals("country")) {
            return randomFrom(countryList);
        }
        if (label.equals("color")) {
            return randomFrom(colorList);
        }
        if (label.equals("noun")) {
            return randomFrom(nounList);
        }
        if (label.equals("name")) {
            return randomFrom(nameList);
        }
        if (label.equals("adjective")) {
            return randomFrom(adjectiveList);
        }
        if (label.equals("animal")) {
            return randomFrom(animalList);
        }
        if (label.equals("timeframe")) {
            return randomFrom(timeList);
        }
             if (label.equals("verb")) {
            return randomFrom(verbList);
        }
        if (label.equals("number")) {
            return "" + myRandom.nextInt(50) + 5;
        }
        return "**UNKNOWN**";
    }

    private String processWord(String w) {
        int first = w.indexOf("<");
        int last = w.indexOf(">", first);
        if (first == -1 || last == -1) {
            return w;
        }
        String prefix = w.substring(0, first);
        String suffix = w.substring(last + 1);
        String sub = getSubstitute(w.substring(first + 1, last));
        return prefix + sub + suffix;
    }

    private void printOut(String s, int lineWidth) {
        int charsWritten = 0;
        for (String w : s.split("\\s+")) {
            if (charsWritten + w.length() > lineWidth) {
                System.out.println();
                charsWritten = 0;
            }
            System.out.print(w + " ");
            charsWritten += w.length() + 1;
        }
    }

    private String fromTemplate(String source) {
        String story = "";
        if (source.startsWith("http")) {
            URLResource resource = new URLResource(source);
            for (String word : resource.words()) {
                story = story + processWord(word) + " ";
            }
        } else {
            FileResource resource = new FileResource(source);
            for (String word : resource.words()) {
                story = story + processWord(word) + " ";
            }
        }
        return story;
    }

    private ArrayList<String> readIt(String source) {
        ArrayList<String> list = new ArrayList<String>();
        if (source.startsWith("http")) {
            URLResource resource = new URLResource(source);
            for (String line : resource.lines()) {
                list.add(line);
            }
        } else {
            FileResource resource = new FileResource(source);
            for (String line : resource.lines()) {
                list.add(line);
            }
        }
        return list;
    }

    public void makeStory() {
        System.out.println("\n");
        String story = fromTemplate("data/madtemplate.txt");
        printOut(story, 60);
    }

}

    