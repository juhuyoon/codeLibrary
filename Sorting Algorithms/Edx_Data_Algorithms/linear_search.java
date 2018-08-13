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

//Suppose we perform Linear Search for an existing value on the following array:
//1,3,5,4,2,6
//In the worst case scenario, what number could you be searching for?

//Answer: 



//Suppose we perform Linear Search on an array of size N, and we are faced with the worst case scenario. How many steps does it take to find what we are looking for in terms of N?
//Answer: N
