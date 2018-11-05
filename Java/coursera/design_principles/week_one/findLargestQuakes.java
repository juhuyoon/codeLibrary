import java.util.*;

/**
 * Determine the N biggest earthquakes and those with largest magnitude.
 * 
 * @author Brienna Herold
 * @version Dec. 6, 2016
 */
public class LargestQuakes {
    /**
     * Reads in earthquake data from a source, stores them into an ArrayList of type
     * QuakeEntry, and prints all the earthquakes and how many.
     */
    public void findLargestQuakes() {
        // Read and store earthquake data
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list = parser.read(source);
        System.out.println("Read " + list.size() + " quakes");
        /*
         * // Print all the earthquakes and the number for (QuakeEntry qe : list) {
         * System.out.println(qe); } // Print the index location of the largest
         * magnitude earthquake int index = indexOfLargest(list);
         * System.out.println("index: " + index + ", mag: " +
         * list.get(index).getMagnitude());
         */

        // Print the five earthquakes of largest magnitude
        ArrayList<QuakeEntry> largest = getLargest(list, 50);
        for (QuakeEntry quake : largest) {
            System.out.println(quake);
        }
    }

    /**
     * Returns the index location in data of the earthquake with the largest
     * magnitude.
     */
    public int indexOfLargest(ArrayList<QuakeEntry> data) {
        double magMax = 0;
        int index = -1;
        // For each quake in data
        for (QuakeEntry qe : data) {
            // Get quake's magnitude
            double mag = qe.getMagnitude();
            // If mag is larger than magMax, update
            if (mag > magMax) {
                magMax = mag;
                index = data.indexOf(qe);
            }
        }
        return index;
    }

    /**
     * Finds the top howMany largest magnitude earthquakes from quakeData.
     * @returns the earthquakes as an ArrayList in order by their magnitude, 
     * with the largest magnitude earthquake in index position 0
     */
    public ArrayList<QuakeEntry> getLargest(ArrayList<QuakeEntry> data, int howMany) {
        ArrayList<QuakeEntry> dataRemovable = data; 
        ArrayList<QuakeEntry> largest = new ArrayList<QuakeEntry>();
        // Until either largest contains howMany elements or data runs out
        while (largest.size() < howMany || dataRemovable.size() == 0) {
            // Find
            int index = indexOfLargest(dataRemovable);
            largest.add(dataRemovable.get(index));
            dataRemovable.remove(index);
        }
        return largest;
    }
}