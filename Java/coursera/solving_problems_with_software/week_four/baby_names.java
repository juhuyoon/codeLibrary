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

    public void totalBirths(FileResource fr) {
        for (CSVRecord rec: fr.getCSVParser(false)) {
            int totalBirths = 0; //must declare a variable on top first then use. 
            int totalBoys = 0;
            int toalGirls = 0;
                //looping over all CSVRecords in the file, false because it has no header row
                int numBorn = Integer.parseInt(rec.get(2));
                totalBirths += numBorn;
                if(rec.get(1).equals("M")) {
                    totalBoys += numBorn;
                } else {
                    totalGirls += numBorn;
                }
        }
        System.out.println("total births = " + totalBirths);
        System.out.println("total girls = " + totalGirls);
        System.out.println("total boys = " + totalBOys);

    }

    public void testTotalBirths() {
        FileResource fr = new FileResource();
        totalBirths(fr);
    }
