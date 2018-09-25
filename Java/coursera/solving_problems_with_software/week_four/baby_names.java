//baby names miniproject prep and psuedocoding

//Find information in One File:

public void readOneFile(int year) {
    String fname = "data/yob" + year + ".txt";
    FileResource fr = new FileResource(fname);
    CSVParser parser = fr.getCSVParser(false); //asking for parser with no header row
    for(CSVRecord rec : parser) { //must access the record by indexing as there's no header row
        String name = rec.get(0);
        String gender = rec.get(1);
    }
}

public class BabyBirths {
    public void printNames() {
        FileResource fr = new FileResource();
        for(CSVRecord rec: fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2)); //second piece of information from the file
            if(numBorn <= 100) {
            System.out.println("Name " + rec.get(0) + " Gender " + rec.get(1) + "Num Born " + rec.get(2));
        }
    }
    }
}