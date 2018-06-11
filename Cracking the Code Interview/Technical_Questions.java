//Optimize and Solve Technique: Look for BUD

//1) BottleNecks
//2) Unnecessary Work
//3) Duplicated Work

//Walk through via brute force looking for things, then find one of the problems, and focus on getting rid of it. 
//If not optimal, repeat the approach and keep searching for the best algorithm. 

//BottleNecks
    //part of your algorithm that slows down the overall runtime. 
    //Two common ways this occurs:
        //1) One-time work that slows down the algorithm
            //two steps where step 1 = 
                O(N log N)
            //step 2 = 
                O(N)
                //reduce this to O(logN) or O(1). 
        //2) A chunk of work that is running through repeatedly (searching). Reduce to O(log N) or O(1). 

e.g.:
    //Given an array of distinct integer values, count the number of pairs of integers that have difference k. 
    //e.g. {1,7,5,9,2,12,3} and the difference k=2, for pairs of difference 2: (1,3) (3,5) etc...
    //brute force = go through array, start from first element, search through remaining elements. Each pair computes difference.  
    //Bottleneck = "repeated search for the other side of the pair"
    //Since other side of the pair is (x, ?) where ? = x+k/x-k, in a sorted array, find the N element in O(log N) time via binary search. 
    
    //two step algorithm to take O(N log N) time, making the sorting the new bottleneck. Optimizing the second step won't help because the first step is slowing down. 
    //remove the first step and find things in an unsorted array via hash table. 
        //throw hash table, then look up if x + k/x-k exist. This is done in O(N) time. 


//Unnecessary WOrk
    e.g.:
        //print all positive integer solutions to the equation a^3 + b ^3 = c ^3 + d^3, all variables integer between 1 and 1000
        //brute force solution = 
        n = 1000
        for a from 1 to n
            for b from 1 to n
                for c from 1 to n
                    for d from 1 to n
                        if(a^3 + b^3) == (c^3 + d^3)
                            print a,b,c,d
                                break;
//won't make meaningful changes to the runtime, still O(N^4), still good quick fix to make. 
//Remove unncessary work such as one valid d value for each (a,b,c) so d = sqrt^3(a^3 + b^3 - c^3)
        n = 1000
            for a from 1 to n
                for b from 1 to n 
                    for c from 1 to n 
                        d = pow(a^3 + b^3 -c^3, 1/3)
                            if a^3 + b^3 == c^3 + d^3
                                print a,b,c,d
                //the if statement at the end is important. d's value will be found but then check that it's right integer value with the if statement.
                    //Runtime goes from O(N^4) to O(N^3)


//Duplicated Work:
    