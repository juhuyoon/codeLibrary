//Make a list of words for each category using StorageResource or String[] arrays
//For each word in the story template
    //Check if the word had <>
        //If so, pick a word in that category
        //and add to the story
    //Otherwise
        //the word has already been added. 

    //Storage Resource
        //Don't need to know the size, add as needed
        //Must iterate over all elements, random choice?
        //Makes counting all words in a file or URL easy

    //e.g. to add words that have yet to be added
        FileResource resource = new FileResource(source);
        for(String word: resource.words()) {
            word = word.toLowerCase();
            if(! myWords.contains(word)) {
                myWords.add(word);
            }
        }
    //String[] arrays 
        //Easy to choose at random, pick an index
        //Must know the capacity of the array when first initially creating

//Using ArrayList
        import java.util.*; 
        //expands as needed using .add method
        //provides access via index to any element in list
        //Essential in implementing StorageResource
    
ArrayList<String> words = new ArrayList<String>();
words.add("hello");
words.add("world");
String s = words.get(1);
words.set(0, "goodbye");