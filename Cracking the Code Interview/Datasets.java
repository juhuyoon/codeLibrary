//https://en.wikipedia.org/wiki/Hash_table
// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/

//Hash table = data structure that maps keys to values for highly efficient lookup. 
//Simple implementation:
    //use an array of linked lists & a hash code function. 
    //1) Compute key's hash code, either int or long.
    //2) Map the hash code to an index in the array. Done with hash(key) % array_length
    //3) At this index, linked list of keys and values. Store the key and value in this index. Can have two different keys with same has code/two different hash codes that map to same index. 
    