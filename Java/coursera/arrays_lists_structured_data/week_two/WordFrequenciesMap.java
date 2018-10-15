import edu.duke.*;
import java.util.*;

public class WordFrequenciesMap {

    public void countWords(String filename) {
        FileResource fr = new FileResource(filename);
        HaspMap<String, Integer> map = new HashMap<String, Integer>();
        int total = 0;
        for(String w : fr.words()) {
            w = w.toLowerCase();
            if(map.keySet().contains(w)) {
                map.put(w, map.get(w) +1);
            } else {
                map.put(w, 1);
            }
        }
        for(String w: map.keySet()) {
            int occurrences = map.get(w);
            if(occurrences > 500) {
                System.out.println(occurrences + "\t" + w);
            }
        }
    }

    public void countWordsMap(String filename) {
        FileResource fr = new FileResource(filename);
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String w : fr.words()) {
            w = w.toLowerCase();
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        int total = 0;
        for (String w : map.keySet()) {
            int value = map.get(w);
            if (value > 500) {
                System.out.println(value + "\t" + w);
            }
            total += value;
        }
        System.out.println("total count: " + total + " different = " + map.keySet().size());
    }

    public void tester() {
        String filename = "data/kjv10.txt";
        double start = System.currentTimeMillis();
        countWords(filename);
        double end = System.currentTimeMillis();
        double time = (end - start) / 1000;
        System.out.println("time = " + time);
        start = System.currentTimeMillis();
        countWordsMap(filename);
        end = System.currentTimeMillis();
        time = (end - start) / 1000;
        System.out.println("time = " + time);
    }

}
