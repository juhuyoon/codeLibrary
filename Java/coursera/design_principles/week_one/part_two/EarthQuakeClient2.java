import java.util.*;
import edu.duke.*;

public class EarthQuakeClient2 {
    public EarthQuakeClient2() {
        // TODO Auto-generated constructor stub
    }

    public ArrayList<QuakeEntry> filter(ArrayList<QuakeEntry> quakeData, Filter f) { 
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for(QuakeEntry qe : quakeData) { 
            if (f.satisfies(qe)) { 
                answer.add(qe); 
            } 
        } 
        
        return answer;
    } 

    public void quakesWithFilter() { 
        EarthQuakeParser parser = new EarthQuakeParser(); 
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "data/nov20quakedatasmall.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);         
        System.out.println("read data for "+list.size()+" quakes");

        Filter f = new MinMagFilter(3.5, 4.5); 
        ArrayList<QuakeEntry> answer = filter(list, f);
        f = new DepthFilter(-55000.0 , -20000.0);
        answer = filter(answer, f);
        for(QuakeEntry qe : answer) {
            System.out.println(qe);
        }
        System.out.println("Found " + answer.size() + " earthquakes");
    }

    public void createCSV() {
        EarthQuakeParser parser = new EarthQuakeParser();
        //String source = "../data/nov20quakedata.atom";
        String source = "data/nov20quakedatasmall.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read: "+list.size());
    }

    public void dumpCSV(ArrayList<QuakeEntry> list) {
        System.out.println("Latitude,Longitude,Magnitude,Info");
        for(QuakeEntry qe : list){
            System.out.printf("%4.2f,%4.2f,%4.2f,%s\n",
                qe.getLocation().getLatitude(),
                qe.getLocation().getLongitude(),
                qe.getMagnitude(),
                qe.getInfo());
        }
    }
    public void testMatchAllFilter() {
        String source = "data/nov20quakedata.atom";
        EarthQuakeParser parser = new EarthQuakeParser();
        ArrayList<QuakeEntry> list = parser.read(source);
        
        /*
        for (QuakeEntry qe : list) {
            System.out.println(qe);
        }
        */
       
        System.out.println("read data for "+list.size()+" quakes");
       
        MatchAllFilter maf = new MatchAllFilter();
        Filter f = new MagnitudeFilter(1.0, 4.0);
        maf.addFilter(f);
        f = new DepthFilter(-180000.0, -30000.0);
        maf.addFilter(f);
        f = new PhraseFilter("any", "o");
        maf.addFilter(f);
        
        ArrayList<QuakeEntry> answer = filter(list, maf);
        for (QuakeEntry qe : answer) {
            System.out.println(qe);
        }
        
        System.out.println("Found " + answer.size() + " earthquakes ");
        System.out.println("Filters used are: " + maf.getName());
    }
    
    public void testMatchAllFilter2() {
        String source = "data/nov20quakedata.atom";
        EarthQuakeParser parser = new EarthQuakeParser();
        ArrayList<QuakeEntry> list = parser.read(source);
        System.out.println("read data for "+list.size()+" quakes");
        
        MatchAllFilter maf = new MatchAllFilter();
        // Filter for magnitude between 0.0 and 5.0
        Filter f = new MagnitudeFilter(0.0, 5.0);
        maf.addFilter(f);
        // Filter for distance from Billund, Denmark less than  3,000,000 meters (3000 km)
        Location city = new Location(55.7308, 9.1153);
        f = new DistanceFilter(city,  3000000);
        maf.addFilter(f);
        // Filter for the substring “e” in the title
        f = new PhraseFilter("any", "e");
        maf.addFilter(f);
        
        ArrayList<QuakeEntry> answer = filter(list, maf);
        for (QuakeEntry qe : answer) {
            System.out.println(qe);
        }
        
        System.out.println("Found " + answer.size() + " earthquakes ");
        System.out.println("Filters used are: " + maf.getName());
    }
}
