//Which one of the following is a correct version of the code for comparing the name of a country 
//that is in a CSV file that the CSVParser variable parser is processing to see if it is the same name as the String variable country?

for (CSVRecord record : parser) {
    if (record.get("Country").equals(country)) {
        // do something
    }
}

//Suppose there is a CSV file with a column named Exports. A CSVRecord is used to get a String named export, representing the data in this column.
//Which one of the following is the correct code for the if condition to determine if both the Strings exportItem1 and exportItem2 are in this CSVRecord in the export column?

if (export.contains(exportItem1) && export.contains(exportItem2)) { }

//Run your program on the file exportdata.csv. What is the name of the country that is listed as the third country that exports both fish and nuts?
//Results: Panama

// Run your program on the file exportdata.csv. How many countries export sugar?
//Results: 21

//Run your program on the file exportdata.csv. Call the method countryInfo with the country Nauru. Which one of the following items is listed as an export from this country?
//Results: Phosphates

//Run your program on the file exportdata.csv. What is the name of the second economy (that is, what is listed on the second line of the output) listed that exports one trillion dollars or more?
//Result: European Union