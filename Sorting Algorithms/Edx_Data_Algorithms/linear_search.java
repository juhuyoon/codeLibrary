//Linear Search

//Searching
//how do we search for a specific element in an array?

//First: sort out the array. 
//Then go through linear search. 
//Traverse through entire array to search for an element. If found, return it. If not, signal it's not found. Recursive

static void linearsearch(int[] lst, int v) {
    int n = lst.length;
    for(int i = 0; i < n; i++) {
        if(lst[i] == v) {
            System.out.println("Found! It is at " + i);
            return;
        }
    }
    System.out.println("The element is not in the array");
    return;
}