//1) Write a method named tester that will create your CSVParser and call each of the methods below in parts 2, 3, 4, and 5. 
//You would start your code with:
FileResource fr = new FileResource();
CSVParser parser = fr.getCSVParser();
//Each time you want to use the parser with another method, you will need to reset the parser by calling fr.getCSVParser() again to get a new parser.
parser = fr.getCSVParser();


//2) Write a method named countryInfo that has two parameters, parser is a CSVParser and country is a String. 
//This method returns a string of information about the country or returns “NOT FOUND” if there is no information about the country. 
//The format of the string returned is the country, followed by “: “, followed by a list of the countries’ exports, followed by “: “, followed by the countries export value. 
//For example, using the file exports_small.csv and the country Germany, the program returns the string:
Germany: motor vehicles, machinery, chemicals: $1,547,000,000,000

//3)Write a void method named listExportersTwoProducts that has three parameters, parser is a CSVParser, exportItem1 is a String and exportItem2 is a String. 
//This method prints the names of all the countries that have both exportItem1 and exportItem2 as export items. 
//For example, using the file exports_small.csv, this method called with the items “gold” and “diamonds” would print the countries
Namibia
South Africa

//4) Write a method named numberOfExporters, which has two parameters, parser is a CSVParser, and exportItem is a String. 
//This method returns the number of countries that export exportItem. 
//For example, using the file exports_small.csv, this method called with the item “gold” would return 3.

//5) Write a void method named bigExporters that has two parameters, parser is a CSVParser, and amount is a String in the format of a dollar sign, followed by an integer number with a comma separator every three digits from the right. 
//An example of such a string might be “$400,000,000”. This method prints the names of countries and their Value amount for all countries whose Value (dollars) string is longer than the amount string. 
//You do not need to parse either string value as an integer, just compare the lengths of the strings. 
//For example, if bigExporters is called with the file exports_small.csv and amount with the string $999,999,999, then this method would print eight countries and their export values shown here:
Germany $1,547,000,000,000
Macedonia $3,421,000,000
Malawi $1,332,000,000
Malaysia $231,300,000,000
Namibia $4,597,000,000
Peru $36,430,000,000
South Africa $97,900,000,000
United States $1,610,000,000,000

////////////////////////////////////////////////// CODE ///////////////////
import edu.duke.*;
import org.apache.commons.csv.*; 

public class Export {
    public String countryInfo(CSVParser parser, String country) { 
        //This method returns a string of information about the country or returns “NOT FOUND” if there is no information about the country. 
        for(CSVRecord record : parser) {
            String myCountry = record.get("Country");
            if(myCountry.contains(country)) {
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                String info = myCountry + ": " + exports + ": " + value;
                return info;
            }
        }
        return "NOT FOUND";

    }

	public String listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
		for(CSVRecord record : parser) {
			String exports = record.get("Exports");
			String country = record.get("Country");
			if(exports.contains(exportItem1) && exports.contains(exportItem2)) {
				System.out.println(country);
            }
        }
        return "Not Found";
	}

    public int numberOfExporters(CSVParser parser, String exportItem) { ////This method returns the number of countries that export exportItem. 
        int numOfCountries = 0;
        for(CSVRecord record : parser) {
            String exports = record.get("Exports");
            if(exports.contains(exportItem)) {
                numOfCountries++;
            }
        }
        return numOfCountries;
    }

    public void bigExporters(CSVParser parser, String amount) {
        for(CSVRecord record : parser)  {
            String value = record.get("Value (dollars)");
            String country = record.get("Country");

            if(value.length() > amount.length()) {
                String.out.println(country + ": " + value);
            }
        }
    }

    public void tester() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(); //used to reset the parser by calling it again to get a new parser. 

        		
		// String info = countryInfo(parser, "Nauru");
		// System.out.println(info);
		
		//listExportersTwoProducts(parser, "cotton", "flowers");

		// int numOfCountries = numberOfExporters(parser, "cocoa");
		// System.out.println(numOfCountries);

		bigExporters(parser, "$999,999,999,999");

		//System.out.println("Country".equals("Country"));
    }
}