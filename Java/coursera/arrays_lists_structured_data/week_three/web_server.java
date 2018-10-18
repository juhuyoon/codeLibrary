import com.sun.org.apache.xerces.internal.util.Status;

//logs each access to files and records who made the request, when the request was made, etc
//What does all of the informaiton in the web server log mean?
//How do you represent it in a java class?
//https://httpd.apache.org/docs/2.4/logs.html

110.76.104.12 - - [30/Sep/2015] "GET  //e.g."
//first the IP address in a web server log indicates the device on the Internet that made the request
// - = information on user who requested the file, but is missing
// 2nd - = whether the user logged in with authentication. 
//date and time is next as an array
// The request itself and what type of request it is. 
//Then the status 200 = success, others = failures with its reason for failure. 


public class LogEntry{
  private  String ipAddress;
  private  Date accessTime;
  private  String request;
  private  int StatusCode;
  private  int bytesReturned; //private so that these variables are immutable. 

  public LogEntry(String ip, Date time, String req, int status, int bytes) {
      ipAddress = ip;
      accessTime = time;
      request = req;
      StatusCode = status; 
      bytesReturned = bytes;
  }

  //then use getter/accessor method to read the values of these fields. 
public String getIpAddress() {
    return ipAddress;
}

public Date getAccessTime() {
    return accessTime;
}

public String getRequest() {
    return request;
}

public int getStatusCode() {
    return statusCode;
}

public int getBytesReturned() {
    return bytesReturned;
}

public String toString() { //very important and must be spelled this way
    return ipAddress + " " + accessTime + " " + request + " " + statusCode + " " + bytesReturned;
    }
}

//every class has a toString method by default
//however, if you do not specify that you want a toString method, then it will only log the location of the memory as seen in the tester case. 