public interface IMarkovModel {
    public void setRandom(int seed);

    public void setTraining(String text);

    public String getRandomText(int numChars);
}