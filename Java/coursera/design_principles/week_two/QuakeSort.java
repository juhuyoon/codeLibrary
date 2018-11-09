import java.util.*;
    //sorting by selection sort in order to list the earthquakes from the biggest to the smallest
    //destroys the input and produces the output in a new array list
public class QuakeSort {
    //helper function
    public QuakeEntry getSmallestMagnitude(ArrayList<QuakeEntry> quakes) {
        //get the data
        QuakeEntry min = quakes.get(0); 
        //loop over starting from minimum
        for(QuakeEntry q: quakes) {
            if (q.getMagnitude() < min.getMagnitude()) {
                min = q; //min = q so that the smallest if always at the front
            }
        }
        return min;
    }
    
    public ArrayList<QuakeEntry> sortByMagnitude(ArrayList<QuakeEntry> in) {
        //out starts as empty ArrayList
        ArrayList<QuakeEntry> out = new ArrayList<QuakeEntry>();
        //count from 0 to < in.size()
        for (int i = 0; i < in.size(); i++) {
            //find index of smallest quake
            int minIdx = getSmallestMagnitude(in, i);
            //swap the ith quake with the minIndexth quake
            QuakeEntry qi = in.get(i);
            QuakeEntry qmin = in.get(minIdx);

        }
    }
    /* tester method to use in BlueJ */
    public void testSort(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        list = sortByMagnitude(list);
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
    }

}
