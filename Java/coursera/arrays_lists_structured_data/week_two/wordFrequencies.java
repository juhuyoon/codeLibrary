public class WordFrequencies {
    
    // parallel array for the frequencies of the words
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs; //to store the frequencies

    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }

    public void findUnique() {
        FileResource resource = new FileResource();
        for String(s: resource.words()) {
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if(index == -1) {
                myWords.add(s);
                myFreqs.add(1);
            } else { 
            int value = myFreqs.get(index); //access the value of the location of the word at its frequency with get index
            myFreqs.set(index, value+1); //set the value in the frequency to value + 1
            }
        } 
    }

    public void tester() {
        findUnique();
        System.out.println("#unique words: " + myWords.size(i));
        for(int i = 0; i < myWords.size(); i++) {
            System.out.println(myFreqs.get(k) + "\t" + myWords.get(i))
        }
    }
}