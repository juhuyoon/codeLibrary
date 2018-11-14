import java.util.*;
import edu.duke.*;

public class Tester {
    public void testGetFollows() {
        //MarkovOne markov = new MarkovOne();
        MarkovFour markov = new MarkovFour();
        markov.setTraining("this is a test");
        ArrayList<String> follows = markov.getFollows(" is ");
        System.out.println(follows);
    }

    public void testGetFollowsWithFile() {
        MarkovOne markov = new MarkovOne();
        FileResource fr = new FileResource();
        String frStr = fr.asString().replace( '\n', ' ');
        markov.setTraining(frStr);
        ArrayList<String> follows = markov.getFollows("t");
        System.out.println(follows.size());
    }
}