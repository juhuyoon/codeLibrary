//https://en.wikipedia.org/wiki/Hash_table
// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/

//Hash table = data structure that maps keys to values for highly efficient lookup. 
//Simple implementation:
    //use an array of linked lists & a hash code function. 
    //1) Compute key's hash code, either int or long.
    //2) Map the hash code to an index in the array. Done with hash(key) % array_length
    //3) At this index, linked list of keys and values. Store the key and value in this index. Can have two different keys with same has code/two different hash codes that map to same index. 
    
//ArrayList & Resizable Arrays
    //note that in Java, arrays are of fixed length while other languages may have them automatically resizeable.

        public class ArrayList<E>
        extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable
        // resizes itself as needed while provided O(1) space. 
                    // When the array is full, the array doubles in size and each doubling takes O(n) time. 
                    // Amortized insertion time is O(1) as when the array increases by K elements, the array has to copy K/2 elements per. 
                    //Thus n/2 + n/4 + n/8 + n/16 ... 1. Goes to O(1) which is less than N.


      Hashtable<String, Integer> numbers
            = new Hashtable<String, Integer>();
                    numbers.put("one", 1);
                    numbers.put("two", 2);
                    numbers.put("three", 3);
                //public class Hashtable<K,V>
                //extends Dictionary<K,V>
                //implements Map<K,V>, Cloneable, Serializable

   public final class StringBuilder //Object, serializable, appendable, charsequence
        extends Object
        implements Serializable, CharSequence


