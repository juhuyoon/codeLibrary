//Which one of the following is the correct code for the constructor LogAnalyzer?

//result:
records = new ArrayList<LogEntry>();

//Which one of the following is the best answer for the line in the method readFile that will use WebLogParser to parse a line from the file?

//result: 
LogEntry le = WebLogParser.parseEntry(line);

//Suppose a new integer variable named location will be added as a private variable to the LogEntry class. This variable should be initialized as 0 just once when the object is created.
//Where is the best location in the class to initialize this variable?

//result:
//Initialize location in the constructor with the code:
location = 0;


//Consider the following version of readFile called readFileWithUniqueStatus, in which a learner wants to read in web log entries, but only put a LogEntry in records if it hasn’t seen the LogEntry's status code before. Thus, the entries in records would have unique status codes.

public void readFileWithUniqueStatus (String filename) {
    FileResource fr = new FileResource(filename);
    for (String line : fr.lines()) {
        LogEntry le = WebLogParser.parseEntry(line);
        if (! records.contains(le.getStatusCode())) {
            records.add(le);
        }
    }
}

//This method runs, but it puts all the web log entries in records, including the duplicates.
//Which of the following is the best answer for explaining both the reason why this method does not work and how to fix it?

//result: 
//The method does not work because a status code is compared to a LogEntry. Instead, a for loop is needed to iterate over all the status codes of the LogEntrys in records to check to see if the statusCode is already in there. After looping, if it is not in there, then the LogEntry can be added to records.

//Run the method printAllHigherThanNum(400) on file weblog1_log.
//Of all the web logs printed, what are the unique status codes printed?

//result: Only 404


//Run the method uniqueIPVisitsOnDay(“Mar 17”) on the file weblog1_log.
//What size is the ArrayList that is returned?

//result: 16

//Run the method countUniqueIPsInRange(200, 299) on the file weblog1_log.
//What number is returned?

//result: 65