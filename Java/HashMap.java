//Faster than just counting word frequencies
//A class that associates keys with values, generally called a map
    //Key is an element in the domain and value is what key maps to in range
    //Look up the key, get the associated value

//can have the same value for different keys associated

public void countWordsMap() {
    FileResource resource = new FileResource();
    HashMap<String, Integer> map = new HashMap<String, Integer>(); //key in the hashmap is a string, and the value will be an integer here. 
    //must specify both the key and the value. 
    for(String w: resource.words()) { 
        w = w.toLowerCase();
        if(!map.containsKey(w)) {
            map.put(w, 1); //is the key new or unseen? Put a value 1, else update. 
        } else {
            map.put(w, map.get(w) + 1);
        }
    }
}

//printing all values in map requires looping over the keys and getting the values associated with those keys
public void printWords() {
    for(String s : myMap.keySet()) { //iterable, similar to .words() or .lines() or.data()
        System.out.println(myMaps.get(s) + "\t" + s);
    }
}