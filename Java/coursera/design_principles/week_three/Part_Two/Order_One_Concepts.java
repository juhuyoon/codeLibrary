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