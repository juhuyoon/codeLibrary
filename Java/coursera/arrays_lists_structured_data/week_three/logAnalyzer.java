
/**
 * Write a description of class LogAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer {
    private ArrayList<LogEntry> records;

    public LogAnalyzer() {
        this.records = new ArrayList<>();
    }

    public int countUniqueIPs() {
        //uniqueIPs start as an empty list
        ArrayList<String> uniqueIPs = new ArrayList<String>();
        //for each element le in records
        for (LogEntry le: records) {
            String ipAddress = le.getIpAddress();
            if(uniqueIPs.contains(ipAddress)) {
                //add ipAddress to uniqueIps
                uniqueIPs.add(ipAddress);
            }
        }
        return uniqueIPs.size();
    }

    public void printAllHigherThanNum(int num) {
        for (LogEntry le : records) {
            int statusCode = le.getStatusCode();

            if (le.getStatusCode() > num) {
                System.out.println(le);
            }
        }
    }

    public ArrayList uniqueIPVisitsOnDay(String someday) {
        ArrayList<String> uniqueIP = new ArrayList<>();
        for (LogEntry le : records) {
            String ipAddr = le.getIpAddress();
            String date = le.getAccessTime().toString().substring(4, 10);
            if (!uniqueIP.contains(ipAddr) && date.equals(someday)) {
                uniqueIP.add(ipAddr);
            }
        }
        return uniqueIP;
    }

    public int countUniqueIPsInRange(int low, int high) {
        ArrayList<String> uniqueIPsInRange = new ArrayList<>();
        int count = 0;
        for (LogEntry le : records) {
            String ipAddr = le.getIpAddress();
            int status = le.getStatusCode();

            if (!uniqueIPsInRange.contains(ipAddr) && (status >= low && status <= high)) {
                count++;
                uniqueIPsInRange.add(ipAddr);
            }
        }
        return count;
    }

    public void readFile(String filename) {
        FileResource resource = new FileResource(filename);
        for (String line : resource.lines()) {
            LogEntry l = WebLogParser.parseEntry(line);
            this.records.add(l);
        }
    }

    public HashMap<String, Integer> countVisitsPerIP() {
        //Make an empty HashMap<String, Integer> counts
        HashMap<String, Integer> counts = new HashMap<String, Integer>(); 
        //For each le in record
        for ( LogEntry le: records) {
            //ip = le's ipAddress
            String ip = le.getIpAddress();
            //check if ip is in counts
            if(!counts.containsKey(ip)) {
                //If not: put ip in with a value of 1
                counts.put(ip, 1);
            }  else {
                //If so, update the value to be one more
                counts.put(ip, counts.get(ip) + 1);    
            }
            }
            return counts;
    }

    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }

}