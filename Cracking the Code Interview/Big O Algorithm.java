// Big O time = language and metric used to describe the efficiency of algorithms. 

// Time complexity: Asymptotic runtime / big O time. 
//     Data transfer Algorithm runtime is:
//         1) Electronic Transfer: O(s), s = size of the file. Time to transfer the file increases linearly with the size of the file. 
//         2) Airplane Transfer: O(1) with respect to size of the file. As the size increases, will not take any longer to get the file to your friend. Time is constant.
        
// O: big(O): describes an upper bound on the time. 
// big omega: equivalent concept of the lower bound of the time.
// big theta: means both big O and big omega. Tight bound on runtime. 

//Description of runtimes for an algorithm is in three different ways: 
    //Best Case, Worst Case, Expected Case
//=============================================================================================================================

//Space Complexity
    //Must worry about both time and amount of memory/space is required for an algorithm.
    //Space complexity is in parallel with time cplexity. If an array of size n is needed, then it will require O(n) space.

//recursive call example:
int sum(int n) { /* Ex 1 */
    if(n <= 0) {
        return 0;
    }
        return n + sum(n-1);
    };

//Result: sum(4) -> sum(3) -> sum(2) -> sum(1) -> sum(0) 
// Each of these calls are added to the call stack and takes up actual memory. 

//However, you can have a different function which adds adjacent elements between 0 and n:
int pairSumSequence(int n) { /* Ex 2 */
    int sum = 0;
    for( int i = 0; i < n; i++) {
        sum += pairSum(i, i + 1);
    }
    return sum;
}

int pairSum(int a, int b) {
    return a + b;
}

//There will be O(n) calls to pairSum. HOWEVER, those calls do not exist simultaneously on the call stack, so only O(1) space is needed. [ASYNC CALL?]

//=============================================================================================================================
//Drop the Constants: 

    //It is possible for O(N) code to run faster than the O(1) code for specific inputs. Big O describes this rate of increase. 
    //So don't use constants in runtimes. O(2N) is just O(N).

    //Example:
    
        //MIN AND MAX 1
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
                for (int x: array) {
                    if (x < min) min = x;
                    if ( x > max) max = x;
                }

        //MIN AND MAX 2
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE; 
                for(int x : array) {
                    if (x < min) min = x;
                } for (int x: array) {
                    if ( x > max) max = x;
                }

    //Which one is faster? Frankly, it's hard to answer. So rather than going down a complicated route, just remove the constants and note that O(N) does not always mean it's better than O(N^2);

//=============================================================================================================================
//Drop the Non-Dominant Terms
    //Get rid of non-important terms:
    //Example 1: O(N^2 + N) becomes O(N^2)
    //Example 2: O(N + logN) becomes O(N)
    //Example 3: O(5*2^N + 1000N^100) becomes O(2^N)

    //If it's a sum of a runtime, such as O(B^2 + N) where the B and N are different variables, then additional information is needed. 

//=============================================================================================================================
//Multi-Part Algorithms: Add vs. Multiply
            //When do you multiply the runtimes and when do you add them when you have an algorithm with two steps? 

        //Example 1:
                for (int a: arrA) {
                    print(a)
                }

                for (int b: arrB) {
                    print(b)
                }
        
        //Example 2: 
                for(int a: arrA) {
                    for(int b: arrB) {
                        print(a + "," + b);
                    }
                }

//Example 1: do chunk A work then chunk B work. Thus, the amount of time  is: O(A + B) [so addition of runtimes]
//Example 2: Do chunk B work for each element in A. So, the total amount of worktime is: O(A * B) [so multiplication of runtimes]

//Do this, then when you're done do that = add
//Do this for each time you do that = multiply

//=============================================================================================================================
//Amortized TIme
        //ArrayList = dynamically resizing array that gives you flexibility as it never runs out of space. 
                //Implemented with an array. 
                //How do you describe runtime of insertions? 

        //Example: You have an ArrayList. When it hits capacity, the ArrayList class will create a new array with double the capacity and copy all the elements over to the new array. 
                    //What is the runtime of insertion?

            //Breakdown:
                //Array is full, contains N elements, then inserting a new element will take O(N) time. 
                //Then a new array would be created to a new array of size 2N and then copy N elements over. Insertion will take O(N) time. 
                //However, vast majority of time insertion will be O(1) time. 
                    //Amortized time: Worst case can happen every once in a while, but once it happens, it won't happen again for so long that cost is "amortized"

                //So as we insert the ellements, the size of the array is doubled: so 1, 2, 4, 8, 16 ... X. 
                    //What is the sum of 1 + 2 +4 + 8 + 16 ... + X = 2X. 
                    //Therefore, X insertions take O(2X) time. Amortized time for each insertion is O(1). 
                    
//=============================================================================================================================
//Log N Runtimes
            
                //2^4 = 16 -> log(2)16 = 4
                //log(2)N = k -> 2^k = N
    // When you see a problem where the number of elements in the problem space gets halved each time, that will likely be a O(log N) runtime
    //Finding an element in a balanced binary search tree is O(log N). Go either left or right, half the nodes on each side, and then cut the problem space in half. 

//=============================================================================================================================
//Recursive Runtimes
                //What is the runtime of this code?
        int f(int n) {
            if(n <= 1) {
                return 1;
            }
            returnf(n - 1) + f(n - 1);
        }
            //The runtime is O(2^n).
            //Draw a binary search tree, and for every depth, there will be double the nodes down the tree. 
            //Learn this pattern. When you have a recursive function that makes multiple calls, the runtime will often look like O(branches ^ depth). 
        
            //Space Complexity of this algorithm is O(N). Only O(N) memory/space exists at any given time. 

//Examples and Exercises:

//Example 1:
        //Runtime? 
        void foo(int[] array){
            int sum = 0;
            int product = 1;
            for(int i=0; i < array.length; i++) {
                sum += array[i];
            }
            for(int i = 0; i < array.length; i++){
                product *= array[i];
            }
            System.out.println(sum + ", " + product);
        }

        //Answer: O(N) time. Iterating through the array twice does NOT matter. 

//Example 2:
        //Runtime? 
        void printPairs(int[] array) {
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array.length; j++) {
                    System.out.println(array[i] + "," + array[j]);
                }
            }
        }


        //Answer: O(N^2) because the inner for loop has O(N) iterations and it is called on N times. 
        //Another way: It is printing all pairs (two element sequences). There are O(N^2) pairs; therefore runtime is O(N^2)

//Example 3:
        //Runtime?
        void printUnorderedPairs(int[] array){
            for(int i = 0; i < array.length; i++){
                for(int j = i + 1; j < array.length; j++) {
                    System.out.println(array[i] + ',' + array[j]);
                }
            }
        }

    //Answer: O(N^2);
    //The code iterates through each pair of values for (i, j) where j > i. 
    //There are N^2 total pairs, and roughly half of those will have i < j and the remaining i > j. 
    //Means code goes through roughly N^2 / 2 pairs, so O(N^2) works. 

//Example 4: 
        //Runtime?
        void printUnorderedPairs(int[] arrayA, int[] arrayB) {
            for (int i = 0; i < arrayA.length; i++) {
                for( int j = 0; j < arrayB.length; j++){
                    if(arrayA[i] < arrayB[j]) {
                        System.out.pringln(arrayA[i] + "," } arrayB[j]);
                    }
                }
            }
        }

        //if-statement within j's for loop is O(1) time as it's a sequence of constant-time statements. 
        //For each element of arrayA, inner for loop goes through b iterations, b = arrayB.length. a = arrayA.length,
        //Answer: O(ab)

//Example 5:
        void printUnorderedPairs(int[] arrayA, int[] arrayB) {
            for (int i = 0; i < arrayA.length; i++) {
                for(int j = 0; j < arrayB.length; j++) {
                    for(int k = 0; k < 10000; k++){
                        System.out.println(arrayA[i] + "," + arrayB[j])
                    }
                }
            }
        }

        //Answer: O(ab);

//Example 6:
        //Runtime? The code reverses an array. 
            void reverse(int[] array) {
                for(int i = 0; i< array.length / 2; i++){
                    int other = array.length -i -1;
                    int temp = array[i];
                    array[i] = array[other];
                    array[other] = temp;
                }
            }
        //Runs in O(N) time. The fact that it only goes through half the array does not impact the big O time.

//Example 7: 
        //Which of the following are equivalent to O(N)? Why?
            O(N + P), where P < N/2
            O(2N)
            O(N + log N )
            O(N + M)

        //answer 1: YES as N is the dominant term so drop P
        //answer 2: YES as 2 is a constant so drop it. 
        //answer 3: YES as logN is dominated by N. 
        //answer 4: NO as we don't know what M is 

//Example 8:
        //What would the runtime of an algorithm that took in an array of strings, sorted each string, and then sorted the full array be?

        //Use variables to represent the Ns in different ways:
            //s = length of longest string
            //a = length of array. 
            //Sorting each string is O(s log s)
            //for every array, so it's O(a * s log s)
            //now sort all the strings and there are a amount of strings, so it would be O(a * s log a) time. 
            //Add the two parts together, it's O(a * s(log a + log s)).

//Example 9: 
        //What is the runtime of a code that sums the values of all the nodes in a balanced binary search tree?
            int sum(Node node) {
                if(node == null) {
                    return 0;
                }
                return sum(node.left) + node.value + sum(node.right);
            }
        //just because it's a binary search tree does NOT mean there is a log in it!
        //Code touches each node in the tree once and does a constant time amount of work with each "touch" (excluding the recursive calls)
        //Therefore, the runtime will be linear, if there are N nodes, then the runtime is O(N).

<<<<<<< HEAD
`
=======
//Example 10:
            //What is the time complexity?
            boolean isPrime(int n){
                for (int x = 2; x * x <= n; x++) {
                    if (n % x == 0) {
                        return false;
                    }
                }
                return true;
            }

        //Work inside loop is constant, for loop starts at x = 2, ends at x * x = n. 
        //Stops when x = sqrt(n). 
        boolean isPrime(int n) {
            for (int x =2; x <= sqrt(n); x++) {
                if (n % x == 0) {
                    return false
                }
            }
            return true
        }
        //runs in O(sqrt(n)) time.

//Example 11:
            //What is the time complexity?
            int factorial(int n) {
                if (n < 0) {
                    return -1;
                } else if (n == 0){
                    return 1;
                } else {
                    return n * factorial(n - 1);
                }
            }
            
            //recursion from n to n-1 to n-2 down to 1. Will take O(n) time. [Because it's recursion]

//Example 12:
            //What is the time complexity?
            void permutations(String str) {
                permutation(str, "");
            }

            void permutation(String str, String prefix){
                if (str.length() == 0){
                    System.out.println(prefix);
                } else {
                    for (int i = 0; i < str.length(); i++){
                        String rem = str.substring(0, i) + str.substring(i + 1);
                        permutation(rem, prefix + str.charAt(i));
                    }
                }
            }

            //Difficult as you have to look at how many times permutations get called and thus aim at getting as tight of an upper bound as possible. 
            //Permutations down a node, there would be a slot for each character picked. If it's 7 character string, there'd be 7 choices. 
            //There would thus be n! permutations. 
            //The number of times the permutation gets called before its base case is dependent on the amount of n! nodes. 
            //The println takes O(n) time to print, string concatenation takes O(n) time, thus calling each node in call tree corresponds to O(n) work. 
            //Total runtime therefore is O(n * n!) times and each one takes O(n) time. 

//Example 13:
            //What is the time complexity?
            //This computes Nth Fibonacci number
            int fib(int n) {
                if(n <= 0) return 0;
                else if (n == 1) return 1;
                return fib(n - 1) + fib(n - 2);
            }

            //O(branches^depth), and since there's 2 branches per call fib(n-1) and fib(n -2), the runtime is O(2 ^ N). 
            //When you see an algorithm with muultiple recursive calls, you're looking at EXPONENTIAL RUNTIME!!!

//Example 14:   
            //What is the time complexity of a code that prints all Fibonacci numbers from 0 to n?
            void allFib(int n) {
                for (int i = 0; i< n; i++) {
                    System.out.println(i + ": " + fib(i));
                }
            }

            int fib(int n) {
                if( n <= 0) return 0;
                else if ( n == 1) return 1;
                return fib(n - 1) + fib(n - 2);
            }

            //first iteration by itself would just be a runtime of n, but the n is changing throughout the fibonacci sequence for a time of O(2^N)
            //Which would just be O(2^N+1), which results in a runtime of O(2^N)

//Example 15:
            //Following prints all Fibonacci numbers from 0 to N, but it stores previous computed values in an integer array. If computed, it just returns the cache. 
            //What is the runtime?

            void allFib(int n) {
                int[] memo = new int[ n+ 1];
                for (int i = 0; i < n; i++) {
                    System.out.println(i + ": " + fib(i, memo));
                }
            }

            int fib(int n, int[] memo) {
                if (n <= 0) return 0;
                else if ( n == 1) return 1;
                else if ( memo[n] > 0) return memo[n];

                memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
                return memo[n];
            }

            //First prints out the iteration. At each call to fib(i), the values are stored during fib(n-1) and fib(n-2). So we just have to look them up and return them after solving.
            //So the constant amount of work is N times, so it is O(n). 

//Example 16:
        //What is the runtime of a function that prints the powers of 2 from 1 through n (inclusive)

        int powersOf2(int n) {
            if (n < 1) {
                return 0;
            } else if ( n == 1) {
                System.out.println(1);
                return 1;
            } else {
                int prev = powersOf2(n / 2);
                int curr = prev * 2;
                System.out.println(curr);
                return curr;
            }
        }

        //example to think of: powersOf2(5) would be powersof2(25), (12), (6), (3), (1), prints & returns all the results
        //The number of times we can halve n until we get 1 is O(log n), thus the runtime is O(log n)

//Example 17:
        //The following code computes the products of a and b. What is its runtime?
        int product(int a, int b) {
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum += a;
            }
            return sum;
        }
        //O(b) as the loop only iterates through b.
        
//Example 18:
        //Following code computes a^b. What is its runtime?
        int power(int a, int b) {
            if(b < 0) {
                return 0;
            } else if (b == 0) {
                return 1;
            } else {
                return a * power(a, b - 1);
            }
        }
        //O(b) as its a recursive code that iterates through b. 

//Example 19:
        //Following code computes a % b. WHat is its runtime?
            int mod(int a, int b) {
                if ( b <= 0 ) {
                    return -1
                }
                int div = a / b;
                return a - div * b;
            }

        //O(1) as it does the same constant amount of work, return a single value if less than 0, if not, just do arithmetic.

//Example 20:
        //The following code performs integer division. What is its runtime( assume a and b are both positive)
            int div(int a, int b) {
                int count = 0;
                int sum = b;
                while ( sum <= a) {
                    sum += b;
                    count++;
                }
                return count;
            }
        //The runtime is O(a/b). The variable 'count' will eventually equal a/b. The while loop iterates count times. Therefore, it iterates a/b times. 

//Example 21:
        //The following code computes the integer square root of a number. If the number is not a perfect square, then it returns -1. It does this by successive guessing. 
        //If n i 100, it first guesses 50. Too high? Try something lower - halfway between 1 and 50. What is the runtime? 

            int sqrt(int n) {
                return sqrt_helper(n, 1, n);
            }

            int sqrt_helper(int n, int min, int max) {
                if(max < min) return -1 //no sqrt
                int guess = (min + max)/2;
                if(guess * guess == n ) {
                    return guess;
                } else if (guess * guess < n) //too low {
                    return sqrt_helper(n, guess + 1, max); //try higher
                } else {
                    return sqrt_helper(n, min, guess -1); //try lower
                }
            }

            //The runtime is O(log n). The algorithm is just a binary search to find the sqare root. 

//Example 22:
            //The following code computes the integer square root of a number. If the number is not a perfect square then it returns -1. 
            //It does this by trying increasingly large numbers until it finds the right value ( or is too hihg). What is the runtime?

            int sqrt(int n) {
                for (int guess = 1; guess * guess <= n; guess++) {
                    if(guess * guess == n) {
                        return guess;
                    } 
                }
                return -1;
            }

            //O(sqrt(n)) as it's a straightforward loop that stops when guess*guess > n. 

//Example 23:
            //If a binary search tree is not balanced, how long might it take to find an element in it? (Worst Case)
            
            //It's just a binary tree at the end, so O(n) where n is the number of nodes in the tree. 

//Example 24:
            //You are looking for a specific value in a binary tree, but the tree is not a binary search tree. What is the time complexity?
            
            //O(n) as with no ordering property, we have to go through ALL the nodes. 

//Example 25:
            //The appendToNew method appends a value to an array by creating a new, longer array and returning this longer array. 
            //You use the appendToNew method to create a copyArray funtion that repeatedly calls appendToNew. How long does copying an array take?

            int[] copyArray(int[] array) {
                int[] copy = new int[0];
                for(int value: array) {
                    copy = appendToNew(copy, value);
                }
                return copy;
            }

            int[] appendToNew(int[] array, int value) {
                //copy all elements to new array
                int[] bigger = new int[array.length +1];
                for(int i = 0; i < array.length; i++){
                    bigger[i] = array[i];
                }

                //add new element
                bigger[bigger.length -1] = value;
                return bigger;
            }
            //Total runtime is O(n^2) as where n is # of elements in array. The first call takes 1 copy, the second call takes 2 copies, third takes 3 copies so on.
            //Total runtime thus is sum of 1 through n

//Example 26:

            //The following code sums the digits in a number. What is its big O time?
            int sumDigits(int n ) {
                int sum = 0;
                while(n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                return sum;
            }

            //Runtime is O(log n). Will be the number of digits in the number. A number with d digits can have a value up to 10^d, then d =- log n. 

//Example 27:
            //The following code prints all strings of length k where the characters are in sorted order./**
            //It does this by generating all strings of length k and then checking if each is sorted. What is its runtime? 

            int numChars = 26;
            void printSortedStrings(int remaining) {
                printSortedStrings(remaining, "");
            }

            void printSortedStrings(int remaining, String prefix) {
                if( remaining == 0) {
                    if(isInOrder(prefix)) {
                        System.out.println(prefix);
                    }
                } else {
                    for (int i = 0; i < numChars; i++) {
                        char c = ithLetter(i);
                        printSortedStrings(remaining - 1, prefix + c);
                    }
                }
            }

            boolean isInOrder(String s) {
                for(int i = 1; i < s.length(); i++) {
                    int prev = ithLetter(s.charAt(i - 1));
                    int curr = ithLetter(s.charAt((i));
                    if(prev > curr) {
                        return false;
                    }
                }
                return true;
            }
            char ithLetter(int i) {
                return(Char (((int) 'a') + 1);
            }

            //The runtime is O(kc^k), where k = length of the string and c = number of characters. 
            //It takes O(c^k) time to generate each string. Then check each of these is sorted, which takes O(k) time. 

//Example 28:
            //Computes the intersection of two arrays. It assumes that neither array has duplicates. It computes the intersection by sorting one array and then iterating through array a checking if each value is in b./**
            int intersection(int[] a, int[] b) {
                mergesort(b);
                int intersect = 0;

                for (int x : a) {
                    if (binarySearch(b, x) >= 0) {
                        intersect++;
                    }
                }

                return intersect;
            }

            //The runtime is O(b log b + a log b) as you sort through array b, which takes O(b log b) time.
            //For each element in a, do binary search in O(log b) time. Second part takes O(a log b) time. 
>>>>>>> b78270acb4fa818c815fd3ab0bd4ed2639168199
