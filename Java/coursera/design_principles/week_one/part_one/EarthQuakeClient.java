
import java.util.*;
import edu.duke.*;


//Class will create CSV data
//can copy/paste this into the spreadsheet

//Remember, debugging live-data can be tough! So capture stream for replay/analysis/etc


public class EarthQuakeClient {
    public EarthQuakeClient() {
        //constructor
    }
    
    //returns arraylist of earthquake from data of magnitude larger than magMin.
    public ArrayList<QuakeEntry> filterByMagnitude(ArrayList<QuakeEntry> quakeData, double magMin) {
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for (QuakeEntry qe : quakeData) {
            if (qe.getMagnitude() > magMin) {
                answer.add(qe);
            }
        }
        return answer;              
    }

    //returns the earthquake that are less than distMax from the location. 
    public ArrayList<QuakeEntry> filterByDistanceFrom(ArrayList<QuakeEntry> quakeData, double distMax, Location from) {      
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for (QuakeEntry qe : quakeData) {
            Location qeLoc = qe.getLocation();
            float dist = from.distanceTo(qeLoc);
            if (dist < distMax) {
                answer.add(qe);
            }
        }
        return answer;
    }
            
    //printing out the information
    public void dumpCSV(ArrayList<QuakeEntry> list){
		System.out.println("Latitude,Longitude,Magnitude,Info");
		for(QuakeEntry qe : list){
			System.out.printf("%4.2f,%4.2f,%4.2f,%s\n",
			                  qe.getLocation().getLatitude(),
			                  qe.getLocation().getLongitude(),
			                  qe.getMagnitude(),
			                  qe.getInfo());
	    }
		
	}
    
    //print earthquakes above a certain magnitude, number of such earthquakes. 
	public void bigQuakes() {
	    EarthQuakeParser parser = new EarthQuakeParser();
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "data/nov20quakedata.txt";
        ArrayList<QuakeEntry> list = parser.read(source);
        double mag = 5.0;        
        ArrayList<QuakeEntry> bigOnes = filterByMagnitude(list, mag);
        System.out.println("Reading data for " + list.size() + " quakes to find those that were above" + " magnitude " + mag);
        for (QuakeEntry qe : listBig) {
           System.out.println(qe); 
        }
        System.out.println("Found " + bigOnes.size() + " quakes that fit the criteria");
    }

    //prints the distance from each earthquake to specified city with city info included

    public void closeToMe() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedatasmall.txt";
        ArrayList<QuakeEntry> list = parser.read(source);
        System.out.println("read data for " + list.size() + " quakes");
        float distMax = 100000;

        Location city = new Location(38.17, -118.82);
        ArrayList<QuakeEntry> quakes = filterByDistanceFrom(list, distMax, city);
        for (QuakeEntry qe : quakes) {
            float dist = city.distanceTo(qe.getLocation());
            // Convert dist to kilometers
            dist = dist / 1000;
            System.out.println(dist + " " + qe.getInfo());
        }
        System.out.println("Found " + quakes.size() + " that match that criteria");
    }
    
	
    public void createCSV(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.txt";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list = parser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read: " + list.size());
        for (QuakeEntry qe : list) {
            System.out.println(qe);
        }
    }
    
    public ArrayList<QuakeEntry> filterByDepth(ArrayList<QuakeEntry> quakeData, double minDepth, double maxDepth) {
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for (QuakeEntry qe : quakeData) {
            double qeDepth = qe.getDepth();
            if (qeDepth > minDepth && qeDepth < maxDepth) {
                answer.add(qe);
            }
        }
        return answer;
    }


    public void quakesOfDepth() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.txt";
        ArrayList<QuakeEntry> list = parser.read(source);
        double minDepth = -4000.0;
        double maxDepth = -2000.0;
        ArrayList<QuakeEntry> quakes = filterByDepth(list, minDepth, maxDepth);
        System.out.println("read data for " + list.size() + " quakes");
        for (QuakeEntry quake : quakes) {
            System.out.println(quake);
        }
        System.out.println("Found " + quakes.size() + " that match that criteria");
    }
    
    public ArrayList<QuakeEntry> filterByPhrase(ArrayList<QuakeEntry> quakeData, String where, String phrase) {
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        // For each quake entry
        for (QuakeEntry qe : quakeData) {
            String title = qe.getInfo();
            if (where.equals("start") && title.startsWith(phrase)) {
                answer.add(qe);
            } else if (where.equals("end") && title.endsWith(phrase)) {
                answer.add(qe);
            } else if (where.equals("any") && title.contains(phrase)) {
                answer.add(qe);
            }
        }
        return answer;
    }

    public void quakesByPhrase() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.txt";
        ArrayList<QuakeEntry> list = parser.read(source);
        // String where = "end";
        // String phrase = "California";
        // String where = "any";
        // String phrase = "Can";
        String where = "any";
        String phrase = "Can";
        ArrayList<QuakeEntry> quakes = filterByPhrase(list, where, phrase);
        System.out.println("read data for " + list.size() + " quakes");
        for (QuakeEntry quake : quakes) {
            System.out.println(quake);
        }
        System.out.println("Found " + quakes.size() + " that match \"" + phrase + "\" at " + where);
    }

}
