import java.util.*;

    //prints out the actual object of the Log Entries
public class Tester{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(),
        "example request", 200, 500);
        System.out.println(le);

        LogEntry le2 = new LogEntry("1.2.100.4", new Date(),
        "example request 2", 300, 400);
        System.out.println(le2);
    }


}

//results: when it is public String getLogInfo and it's le.getLogInfo()
// 1.2.3.4 Wed Oct 17 22:05:51 EDT 2018 example request 200 500 [Every class has a toString method by default]
//LogEntry @1ee 7f cc = location of the memory of the object
