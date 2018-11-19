//Implementation can change while the interface will not, which is the key to using Abstraction in software

public class MarkovWordOne implements IMarkovModel {
    private String[] myText;
    private Random myRandom;

    public MarkovWordOne() {
        myRandom = new Random();
    }

    public void setTraining(String text) {
        myText = text.split("\\s+");
    }
}

//interface specifies method to return text
    //String getRandomText(int numChars)
    //Type of parameter is meaningful, not name!
    //Add words not characters, manage spaces

public String getRandomText(int numWords) {
    StringBuilder sb = new StringBuilder();
    int index = myRandom.nextInt(myText.length - 1);
    String key = myText[index];
    sb.append(key);
    sb.append(" ");
    //for loop here
    return sb.toString().trim();
}

//Codes can be nearly identical to MarkovOne
    //Changed numChars to numWords
    for(int k = 0; k < numWords - 1; k++) {
        ArrayList<String> follows = getFollows(key);
        if(follows.size() == 0) {
            break;
        }
        index = myRandom.nextInt(follows.size());
        String next = follows.get(index);
        sb.append(next);
        sb.append(" ");
        key = next;
    }

//Copy getFollows from MarkovOne
    //Search String myText
    //String methods .length() and .indexOf()
    //Uses .substring() for one character String
//Changes due to String[] myText
    //write .indexOf() for arrays
    //Java doesn't supply indexing search, does supply .contains for ArrayList

//Setting up the Helper Functions in MarkovWordOne
    public class MarkovWordOne implements IMarkovModel {
        private ArrayList<String> getFollows(String key) {
            ArrayList<String> follows = new ArrayList<String>();
            int pos = 0;
            while(pos < myText.length;
 {
     int start = indexOf(myText, key, pos);
     ...
 }    
    }
};