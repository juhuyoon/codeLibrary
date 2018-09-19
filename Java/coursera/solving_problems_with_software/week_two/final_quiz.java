
import edu.duke.*;

public class geneQuiz {
    public int findStopCodon(String dna, int startIndex, String stopCodon) { //to find the original Codons from previous exercises
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }

        return -1;
    }

    public String findGene(String dna, int where) { //finding gene based on the indices of the startCodon and stopCodons (multiples)
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1 || where == -1) {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int minIndex = 0;

        if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }

        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }

        if (minIndex == -1) {
            return "";
        }

        return dna.substring(startIndex, minIndex + 3);
    } //returning dna up to +3 codons. 

    public void howManyGenes() {
        int startIndex = 0; //to know which ones are longer than 60 codons.
        int count = 0;

        FileResource fr = new FileResource(); //empty so that I can choose in a directory.
        String dna = fr.asString().toUpperCase();

        while (true) {
            String gene = findGene(dna, startIndex);

            if (gene == "") {
                break;
            }

            startIndex = dna.indexOf(gene, startIndex) + gene.length();

            if (gene.length() > 60) {
                count++;
            }
        }

        System.out.println("How many genes are: longer than 60 " + count);
    }

    public StorageResource getAllGenes(String dna) { //grabbing all genes...
        StorageResource sr = new StorageResource();
        int startIndex = 0;
        while (true) {
            String gene = findGene(dna, startIndex);

            if (gene == "") {
                break;
            }

            sr.add(gene);

            startIndex = dna.indexOf(gene, startIndex) + gene.length();

        }
        return sr;
    }

    public int countCTG(String dna) { //counting every time the CTG shows up
        int startIndex = 0;
        int count = 0;
        int index = dna.indexOf("CTG", startIndex);

        while (true) {
            if (index == -1 || count > dna.length()) {
                break;
            }

            count++;
            index = dna.indexOf("CTG", index + 3);
        }
        return count;
    }

    public void processGenes() {
        String Longest = "";
        FileResource fr = new FileResource();
        String dna = fr.asString().toUpperCase();
        StorageResource sr = getAllGenes(dna);

        for (String s : sr.data()) {
            if (s.length() > Longest.length()) {
                Longest = s;
            }
        }
        System.out.println(Longest.length());
        System.out.println(countCTG(dna));
    }
}


//////////////////////FOR STORAGE////////////////////////////
import edu.duke.*;

public class Part2 {
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
            }
        }
        return -1;

    }

    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = 0;
        if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }

    public StorageResource getAllGenes(String dna) {
        // create an empty StorageResource, call it geneList
        StorageResource geneList = new StorageResource();
        // Set startIndex to 0
        int startIndex = 0;
        // Repeat the following steps
        while (true) {
            // Find the next gene after startIndex
            String currentGene = findGene(dna, startIndex);
            // If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }

            // Add that gene to geneList
            geneList.add(currentGene);
            // Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
        }
        // Your answer is geneList
        return geneList;
    }

    public int countString(String target, String dna) {
        // Set startIndex to 0
        int pos = 0;
        int count = 0;
        // Repeat the following steps
        while (true) {

            pos = dna.indexOf(target, pos);
            if (pos == -1) {
                break;
            }

            count = count + 1;
            pos = pos + 1;
        }

        return count;
    }

    public void testOn(String dna) {
        int geneCount = 0;
        System.out.println("-----------------------------");
        System.out.println("Testing getAllGenes on " + dna);

        StorageResource genes = getAllGenes(dna);
        for (String g : genes.data()) {

            if (cgRatio(g) > 0.35) {
                System.out.println(g);
                geneCount = geneCount + 1;
            }

            System.out.println("This gene's length: " + g.length());
            // geneCount = geneCount+1;
        }
        System.out.println(geneCount + " :times");
    }

    public void test() {
        URLResource fr = new URLResource();

        String kingDNA = fr.asString();
        String upcase_kingDNA = kingDNA.toUpperCase();
        testOn(upcase_kingDNA);
        System.out.println(cgRatio(upcase_kingDNA));
        System.out.println("-------------");
        System.out.println("CTG in DNA: " + countString("CTG", upcase_kingDNA));

    }

}


//final Quiz Answers:
//1) Turkey
//2) Take 3 Ts from the front out
//3) 69
//4) 23
//5) ??
//6) 224
//7) 489