public class TitleAndDepthComparator implements Comparator <QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        //Retrieving string value, comparing, then returning an int value 
        int value = q1.getInfo().compareTo(q2.getInfo()); 
        if(value == 0) {
            return Double.compare(q1.getDepth(), q2.getDepth());
        }
        return value;
    }
}