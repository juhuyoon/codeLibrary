
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

    public void readFile(String filename) {
        FileResource resource = new FileResource(filename);
        for (String line : resource.lines()) {
            LogEntry l = WebLogParser.parseEntry(line);
            this.records.add(l);
        }
    }

    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }

}