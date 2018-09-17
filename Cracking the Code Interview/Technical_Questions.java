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


//Unnecessary Work
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


//Learning speed gains from branch predictions: 
//http://web.cs.ucdavis.edu/~su/Berkeley/cs252/project.html
//https://en.wikipedia.org/wiki/Branch_predictor
//https://stackoverflow.com/questions/289405/effects-of-branch-prediction-on-performance
//
// Branch prediction is pretty darned good these days. But that doesn't mean the penalty of branches can be eliminated.

// In typical code, you probably get well over 99% correct predictions, and yet the performance hit can still be significant. There are several factors at play in this.

// One is the simple branch latency. On a common PC CPU, that might be in the order of 12 cycles for a mispredict, or 1 cycle for a correctly predicted branch. For the sake of argument, let's assume that all your branches are correctly predicted, then you're home free, right? Not quite.

// The simple existence of a branch inhibits a lot of optimizations. The compiler is unable to reorder code efficiently across branches. Within a basic block (that is, a block of code that is executed sequentially, with no branches, one entry point and one exit), it can reorder instructions as it likes, as long as the meaning of the code is preserved, because they'll all be executed sooner or later. Across branches, it gets trickier. We could move these instructions down to execute after this branch, but then how do we guarantee they get executed? Put them in both branches? That's extra code size, that's messy too, and it doesn't scale if we want to reorder across more than one branch.

// Branches can still be expensive, even with the best branch prediction. Not just because of mispredicts, but because instruction scheduling becomes so much harder.

// This also implies that rather than the number of branches, the important factor is how much code goes in the block between them. A branch on every other line is bad, but if you can get a dozen lines into a block between branches, it's probably possible to get those instructions scheduled reasonably well, so the branch won't restrict the CPU or compiler too much.

// But in typical code, branches are essentially free. In typical code, there aren't that many branches clustered closely together in performance-critical code.