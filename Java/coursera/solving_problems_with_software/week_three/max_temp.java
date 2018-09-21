//String to Integer method: 
Integer.parseInt; 

//e.g.: 
String yearStr = row.get("year");
int value = Integer.parseInt(yearStr);

//Parsing doubles:
Double.parseDouble; //Works for numbers with fractional parts

//Pseudocoding:
//1) Look at first row, 'temperatureF' column, starting with largestSoFar as nothing = null
//2) For each row(currentRow) in the CSV File,
    //2a) If largestSoFar is nothing
        //2ai) Update largestSoFar to be currentRow
    //2b) Otherwise
        //2bi) Check if currentRow's temperature > largestSoFar's
        //2bii) If so, update largestSoFar to currentRow
    //3) largestSoFar = answer

//Java null = "nothing/ no object"

    //can initialize with null (nonexistent)
    //When an algorithm has an answer of non-existent, then null can return
    //can also use if(largestSoFar == null) //when there's nothing

//No object, null, cannot call methods on it:
CSVRecord largestSoFar = null;
largestSoFar.get("TemperatureF");
//Error: Exception in thread "main" java.lang.NullPointerException = tried to do something with null that needed an actual object.

//All expressions have types:
    //What type is null?
        CSVRecord largestSoFar = null; //There is a special null type, 
                                       //which can be converted to any object type. Can be assigned to any variables. 

//Primitive types: CANNOT be null. 
    //Cannot be null in int, double, char, boolean, byte, short, long, float

//Object Types: CAN be null
    //FileResource, String, CSVRecord, Pixel, ...
        //Anything with methods and any class youw rite are object types. 

import edu.duke.*;
import org.apache.commons.csv.*;
import org.omg.CORBA.CurrentOperations;

import java.io.*;
public class CSVMax {
    public CSVRecord hottestHourInFile(CSVParser parser) {
        //start with largestSoFar as nothing
        CSVRecord largestSoFar = null;
        //For each row(currentRow) in the CSV file
        for(CSVRecord currentRow : parser)  {
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        return largestSoFar;
    }

    public void testHottestInDay() {
        FileResource fr = new FileResource();
        CSVRecord largest = hottestHourInFile(fr.getCSVParser());
        System.out.println("hottest temperature was " + largest.get("TemperatureF") + "at " + largest.get("TimeEST"));
    }

    //to select the maximum temperatures over multiple datasets:
    public CSVREcord hottestInManyDays() {
        CSVRecord largestSoFar = null; //to keep track of the hottest temperatures
        DirectoryResource dr =  new DirectoryResource();
        //iteration over the files
        for(File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            //use method to get largest in file:
            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        return largestSoFar; //this is the answer
    }

    public CSVRecord getLargestOfTwo(CSVRecord currentRow, CSVRecord largestSoFar) {
        if(largestSoFar == null) {
            largestSoFar = currentRow;
            } else {
                double currentTemp = Double.parseDouble(CurrentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
                //Check if currentRow's temperature > largestSoFar
                if(currentTemp > largestTemp) {
                //if so, update to currentRows
                    largestSoFar = currentRow;
            }
        }
        return largestSoFar;
    }

    public void testHottestInManyDays() {
        CSVRecord largest = hottestInManyDays();
        System.out.println("hottest temperature was " + largest.get("TemperatureF") + "at " + largest.get("DateUTC"));
    }
}

//How to Refactor.... (above is the refactoring with largestSoFar)