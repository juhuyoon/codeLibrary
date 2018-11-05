import java.util.*;

class IsogramChecker {

    public boolean isIsogram(String phrase) {
        //make an arraylist to hold first
        ArrayList<Integer> check = new ArrayList<>();       
         //if the character has never been used, then push to the arraylist. IndexOf(-1)
        for (char c : phrase.toLowerCase().replace(" ", "").replace("-", "").replace(".", "").toCharArray()){
            //checking to see if it DOES NOT EXIST
            if(check.indexOf((int) c) == -1) {
                check.add((int) c);
            } else return false;
        }
        return true;
    }


}

//community voted solution 
// class IsogramChecker {

//     boolean isIsogram(String phrase) {
//         phrase = phrase.replace("-", "").replace(" ", "").toLowerCase();

//         return (phrase.chars().distinct().count() == phrase.length());
//     }
// }
