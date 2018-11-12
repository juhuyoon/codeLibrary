//Putting data in order:
    //selection sort
    //Step 1: Work an Instance 
        //e.g.: 56, 17, 4, 33
        //putting the elements in order with selection sort!
    //Step 2: Write down what you did
        //starts as empty ArrayList(as long as in is not empty) [WHILE loops]
        //Find smallest element in (minElement) 
        //Remove minElement from in
        //Add minElement to out
        //Find smalelst element in (minElement)
        //Remove minElement from in
        //Add minElement to out
        //Find smallest element in (minElement)
        //Remove minElement from in
        //Add minElement to Out
        //out = answer

    //Note that selection sort is simple and slow on large data as its running time is quadratic in data size 
    //Two Categories in sorting algorithms:
        //Simple + slow: runtime quadratic in data size 
            //bubble and selection sorts are n^2 sorts, algorithms are easy to understand 
        //Clever + fast = runtime closer to linear in data size
            //quick sort, merge sort, etc. java.collections.sort (close to linear)
                //Tim sort function is much more efficient
                    //Interfaces = a type that promises certain methods. 

    //Comparable
    public interface Comparable<T> {
        public int compareTo(T o);
    }

    //comparable: promises one method: compareTo
    //Defines natural ordering for type
    //built in part of Java
    //lexicographical: natural ordering of the alphabet
    //return values:
        //negative number for less than
        //zero for equal
        //positive number for greater than
        //cannot just rely on specific negative or positive values like -1 or +1

//Comparator: Other orderings
    //Defines orderings for another type
        //two parameters: things to be compared

//Comparable vs Comparator
    quake1.compareTo(quake2)
    //compareTo promised by Comparable, then you're asking quake1 to compare itself to quake2
        //the compareTo method lives inside of one of the objects being compared.
            //The method inside will then look at the information it needs from itself and from quake2, then make the comparison. 

    comparatorA.compare(quake1, quake2)
        //asking the object to compare these two quakes. 
        //The code for the .compare method live inside of this third object, not either of the ones being compared. 
        //The benefits of their comparators are that you can create some other Comparator to ask it to .compare the quakes. 
        
        public class MagnitudeComparator
            implements Comparator<QuakeEntry> {
                public int compare(QuakeEntry qe1, QuakeEntry qe2) {
                    return Double.compare(qe1.getMagnitude(),
                                          qe2.getMagnitude());
                }
            }

        Collections.sort(list, new MagnitudeComparator());

            //Collections.sort can take a Comparator
                //Will use ordering defined by Comparator
                //Remember: can use object as interface type
    