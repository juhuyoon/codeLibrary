import java.util.*;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1Title = q1.getInfo();
        String q2Title = q2.getInfo();
        String q1LastWord = q1Title.substring(q1Title.lastIndexOf(" ") + 1);
        String q2LastWord = q2Title.substring(q2Title.lastIndexOf(" ") + 1);
        int value = q1LastWord.compareTo(q2LastWord);
        if (value == 0) {
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        return value;
    }
}