// A common format for storing tabular data (any data organized into columns and rows) is in comma separated values (CSV) files.
//In this module, you will learn how to analyze and manipulate data from multiple CSV data files using a powerful open-source software package: Apache Commons CSV. 
//Using this library will empower you to solve problems that could prove too complex to solve with a spreadsheet

    //Spreadsheets extremely useful in visualizing, finding information, trends, etc
    //Data in CSV format can be portable between different spreadsheet programs 
        //Common formats have standards = IP standard for CSV files, use of Apache CSVParser for this lesson. 

import edu.duke.*;
import org.apache.commons.csv.*; //This is used to use the CSV parser. 

public class FirstCSVExample {
    public void readFood() { //method readFood
        FileResource fr = new FileResource(); //FileResource object with no specific parameters, so you can navigate to the file you want to use. 
        CSVParser parser = fr.getCSVParser(); //FileResource object fr gets the CSVParser. 
        for (CSVRecord record : parser) { //loop over the iterable parser, getting a CSVREcord each time. 
            //CSVRecord class has the method "get" to get one of the records of the CSV file. 
            System.out.print(record.get("Name") + " "); //These Strings are the names 
            System.out.print(record.get("Favorite Color") + " ");
            //String num = record.get("Favorite Number"); Will come out as error not found as Favorite Number is not an element that exists. 
            System.out.println(record.get("Favorite Food"));
        }
    }
}

//print vs println : 
//print = stays on the same line
//println = finishes the line

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Exports in Petroleum:
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
    public void listExporters(CSVParser parser, String exportOfInterest) {
        // for each row in the CSV File
            for(CSVRecord record : parser) {
        // Look at the "Exports" column
                String export = record.get("Exports");
        // Check if it contains exportOfInterest
                if(export.contains(exportOfInterest)) { //contains() searches the sequence of characters in a given string, returns true if char values are found, other is false
        // If so, write down the "Country" from that row
                    String country = record.get("Country");
                    System.out.print(country);

            }
        }
    }
    //This is made to take who exports coffee
    public void whoExportsCoffee() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExporters(parser, "coffee");
    }
}

//What an instance of the problem
//Write down what you did
//Find patterns, generalize
    //1) For each row in the CSV file
        //a) Look at the "Exports" column of that row
        //b) Check if it contains exportsOfInterest
            //i) if so, write down "Country" from that row
