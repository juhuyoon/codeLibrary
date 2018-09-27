import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;

public class BabyNames {
    // To return total # of males and females in a file
    public void totalBirths(FileResource fr) {
        int totalBirths = 0;
        int totalGirls = 0;
        int totalBoys = 0;
        CSVParser parser = fr.getCSVParser(false);

        // Create empty lists to hold unique girl and boy names
        StorageResource uniqueGirlNames = new StorageResource();
        StorageResource uniqueBoyNames = new StorageResource();

        for (CSVRecord rec : fr.getCSVParser(false)) {
            // Retrieve number of births for that name
            int numBorn = Integer.parseInt(rec.get(2));
            // Add number of births to total number of births
            totalBirths += numBorn;
            // Increment total count of names
            totalNames++;
            // Retrieve name
            String name = rec.get(0);
            // If gender is male
            if (rec.get(1).equals("M")) {
                // Add number of births to total number of births for males
                totalBoys += numBorn;
                // Add name to list of boy names if not already on list
                if (!uniqueBoyNames.contains(name)) {
                    uniqueBoyNames.add(name);
                }
            }
            // Otherwise (if gender is female)
            else {
                // Add number of births to total number of births for females
                totalGirls += numBorn;
                // Add name to list of girl names if not already on list
                if (!uniqueGirlNames.contains(name)) {
                    uniqueGirlNames.add(name);
                }
            }
        }
        System.out.println("Unique boy names: " + uniqueBoyNames.size());
        System.out.println("Unique girl names: " + uniqueGirlNames.size());
        System.out.println("Total names: " + totalNames);
        System.out.println("total births = " + totalBirths);
        System.out.println("female girls = " + totalGirls);
        System.out.println("male boys = " + totalBoys);
    }

    // Method to return the rank of the name in the file for given gender, where 1 =
    // largest numer of births.
    public long getRank(int year, String name, String gender) {
        long rank = -1;
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);

        for (CSVRecord record : parser) {
            String currName = record.get(0);
            String currGender = record.get(1);

            if (currGender.equals(gender) && currName.equals(name)) {
                rank = record.getRecordNumber();
            }
        }
        return rank;
    }

    // Method to return the name of the person in the file at the rank for the given
    // gender. If name does not exist, return 'no name'
    public String getName(int year, int rank, String gender) {
        String name = "";
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);

        for (CSVRecord record : parser) {
            long currRank = record.getRecordNumber();
            String currGender = record.get(1);
            String currName = record.get(0);

            if (currRank == rank && currGender.equals(gender)) {
                name = currName;
            }
        }
        if (name != "") {
            return name;
        } else {
            return "NO NAME";
        }
    }

    // Method determines what name would have been named based on what year they are
    // born in.
    public void whatIsNameInYear(String name, int year, int newYear, String gender) {
        FileResource fr = new FileResource();
        FileResource nextFr = new FileResource();
        CSVParser oldParser = fr.getCSVParser(false);
        CSVParser newParser = fr.getCSVParser(false);
        String newName = "";
        long popularity = 0;

        for (CSVRecord record : oldParser) {
            String currName = record.get(0);
            String currGender = record.get(1);

            if (currName.equals(name) && currGender.equals(gender)) {
                popularity = record.getRecordNumber();
            }
        }

        for (CSVRecord record : newParser) {
            String currGender = record.get(1);
            long currPopularity = record.getRecordNumber();

            if (currGender.equals(gender) && popularity == currPopularity) {
                newName = record.get(0);
            }
        }

        System.out.println(name + " born in " + year + " would be " + newName + " if he/she was born in " + newYear);
    }

    public int yearOfHighestRank(String name, String gender) {
        long highestRank = 0;
        int yearOfHighestRank = -1;
        String fileName = "";
        DirectoryResource dr = new DirectoryResource();

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);

            for (CSVRecord record : parser) {
                String currName = record.get(0);
                String currGender = record.get(1);

                if (currName.equals(name) && currGender.equals(gender)) {
                    long currRank = record.getRecordNumber();

                    if (highestRank == 0) {
                        highestRank = currRank;
                        fileName = f.getName();
                    } else {
                        if (highestRank > currRank) {
                            highestRank = currRank;
                            fileName = f.getName();
                        }
                    }
                }
            }
        }

        yearOfHighestRank = Integer.parseInt(fileName);
        return yearOfHighestRank;
    }

    public double getAverageRank(String name, String gender) {
        // Initialize a DirectoryResource
        DirectoryResource dr = new DirectoryResource();
        // Define rankTotal, howMany
        double rankTotal = 0.0;
        int howMany = 0;
        // For every file the directory add name rank to agvRank
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);
            for (CSVRecord record : parser) {
                String currName = record.get(0);
                String currGender = record.get(1);
                if (currName.equals(name) && currGender.equals(gender)) {
                    long currRank = record.getRecordNumber();
                    rankTotal += (double) currRank;
                    howMany += 1;
                }
            }
        }
        // Define avgRank = rankTotal / howMany
        double avgRank = rankTotal / (double) howMany;
        return avgRank;
    }

    public int getTotalBirthsRankedHigher(int year, String name, String gender) {
        int numBorn = 0;
        long rank = getRank(year, name, gender);
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        for (CSVRecord record : parser) {
            int currBorn = Integer.parseInt(record.get(2));
            String currGender = record.get(1);
            long currRank = record.getRecordNumber();
            if (gender.equals(currGender) && rank > currRank) {
                numBorn += currBorn;
            }
        }
        return numBorn;
    }

    public void testTotalBirth() {
        FileResource fr = new FileResource();
        totalBirths(fr);

        // long rank = getRank(2012, "Mason", "M");
        // System.out.println("Rank is: " + rank);

        // String name = getName(2012, 10, "M");
        // System.out.println("Name: " + name);

        // whatIsNameInYear("Isabella", 2012, 2014, "F");

        // System.out.println(yearOfHighestRank("Mason", "M"));

        // System.out.println(getAverageRank("Mason", "M"));

        // System.out.println(getTotalBirthsRankedHigher(2012, "Ethan", "M"));
    }

    public static void main() {
        BabyNames names = new BabyNames();
        names.testTotalBirth();
    }
}