/* sockMerchant function
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

If n = 7 socks with colors, 
ar = [1,2,1,2,1,3,2]. 
There is one pair of color 1, one pair of color 2.
Three odd pairs left, so number of pairs = 2.
*/

function sockMerchant(n, ar) {
    var count = 0;
    var h = {};
    
    for (var i = 0; i < n; i++) {
        if (ar[i] in h) { //for in loop 
            h[ar[i]] = h[ar[i]] + 1;
        } else {
            h[ar[i]] = 1;
        }
    }
    for (var key in h) {
        if (h.hasOwnProperty(key)) {
            count = count + ~~(h[key] / 2);
        }
    }

    return count;
}

/* 
Emma is playing a new mobile game that starts with consecutively numbered clouds. 
Some of the clouds are thunderheads and others are cumulus. 
She can jump on any cumulus cloud having a number that is equal to the number of current clouds plus 1 or 2. 
She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting position to the last cloud.
 It is always possible to win the game.

For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided. 
For example, c = [0, 1, 0, 0, 0, 1, 0] indexed from 0...6. 
The number on each cloud is its index in the list so she must avoid the clouds are indexes 1 and 5. 
She could follow the following two paths: 0 -> 2 -> 4 -> 6 or 0 -> 2 -> 3 -> 4 -> 6.
 The first path takes 3 jumps while the second takes 4.*/

 function jumpingOnClouds(c) {
    let count = 0;
    let i = 0;
    while(true) {
        if((i + 2 < c.length) && (c[i+2] === 0)) {
            i += 2;
        }  else if((i+1 < c.length)) {
            i++;
        } else {
            break;
        }
        count++;
    }
    return count;
 }

 /* 
 Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step. Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through. For example, if Gary's path is s = [DDUUUUDD], he first enters a valley 2 units deep. Then he climbs out an up onto a mountain 2 units high. Finally, he returns to sea level and ends his hike.
 */

 const countingValues = (n, s) => {
     let h = 0;
     let count = 0;

     for(let i = 0; i < n; i++) {
         if(s.charAt(i) === 'D' && h === 0) {
             count++;
             h--;
         } else if(s.charAt(i) === 'D' && h !== 0) {
             h--;
         } else if(s.charAt(i) === 'U') {
             h++;
         }
     }
     return count;
 }

 /* Repeated String 
 Lilah has a string, s, of lowercase English letters that she repeated infinitely many times. 
 Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
  s = string to repeat
  n = number of characters to consider. 
 */

 const repeatedStrings = (s, n) => {
    let x = Math.floor(n / s.length);
    let count = (s.split("a").length-1) * x; //-1 since it's in an array. 
    let rem = n % s.length;

    for(let i = 0; i < rem; i++) {
        if(s.charAt(i) === 'a') {
            count++;
        }
    }
    return count;
}

/* 2dArray
Given a 6x6 2D array arr,
Define an hourglass in A to be a subset of values with indices falling in this pattern arr's graphical representation:
There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass's values.
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
*/

const hourGlassSum = (arr) => {
    let f = Math.pow((arr.length - 2),2);
    let max;
    let sum;

    for(let i =0; i < f; i++) {
        if (i < 4) {
            sum = arr[0][i] + arr[0][i + 1] + arr[0][i + 2];
            sum += arr[1][i + 1];
            sum += arr[2][i] + arr[2][i + 1] + arr[2][i + 2];
          } else if (i < 8 && i >= 4) {
            sum = arr[1][i - 4] + arr[1][i - 3] + arr[1][i - 2];
            sum += arr[2][i - 3];
            sum += arr[3][i - 4] + arr[3][i - 3] + arr[3][i - 2];
          } else if (i < 12 && i >= 8) {
            sum = arr[2][i - 8] + arr[2][i - 7] + arr[2][i - 6];
            sum += arr[3][i - 7];
            sum += arr[4][i - 8] + arr[4][i - 7] + arr[4][i - 6];
          } else if (i >= 12) {
            sum = arr[3][i - 12] + arr[3][i - 11] + arr[3][i - 10];
            sum += arr[4][i - 11];
            sum += arr[5][i - 12] + arr[5][i - 11] + arr[5][i - 10];
          }
          if (sum > max) {
            max = sum;
          } else if (!max) {
            max = sum;
          }
    }
    return max;
}

//Left Rotation
/* 
A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
*/

const rotLeft = (a, d) => {
    a = a.concat(a.splice(0,d));
    return a;
}

//rotating to the right:
const rotRight = (a, d) => {
    a = a.concat(a.splice(0, a.length -d));
    return a;
}

/* 
Copying arrays and objects in JS
JS variables, when you save them in another variable, are simply storing the reference.
This means that when you modify the second variable it also modifies the original copy of the array.
*/

let arr1 = ['a', 'b', 'c', 'd'];
let arr2 = arr1; //arr2 now is holding the arr1 objects.
arr2.push('e');
console.log(arr1); //['a', 'b', 'c', 'd', 'e'];

//can use .slice() to make a shallow copy of a portion of an array into a new array object. 
//original array will NOT be modified. 

let arr3 = ['a', 'b', 'c', 'd'];
let arr4 = arr3.slice();
arr4.push('e');
console.log(arr3); //['a', 'b', 'c', 'd'];
console.log(arr4); //['a', 'b', 'c', 'd', 'e'];

/* If the array has objects, .slice() does not work. 
If you slice, it is only a shallow copy of the array as the objects inside of the array are only references to the existing object.
Copy each object in the array individually over into the new array.
Use JSON.parse(JSON.strinigfy(arr)) in order to create a copy and NOT a reference.
*/

let arr5 = [{a: 1}, {b:2}, {c:3}];
let arr6 = JSON.parse(JSON.stringify(arr5));
arr6[0].a = 5;
console.log(arr5[0].a) //1
console.log(arr5); //[{a: 1}, {b:2}, {c:3}];
console.log(arr6); //[{a: 5}, {b:2}, {c:3}];

//This method CANNOT be used to copy object methods which are saved in the array/object.
/*Wont' be able to copy [
    {a: function a() {
    return true;
}}, {b:2}, {c:3}
]
//would skip over the first object a and return [{b:2}, {c:3}]
*/

//New Year Chaos
/* 
It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by 1 from 1 at the front of the line to n at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if n = 8 and Person 5 bribes Person 4, the queue will look like this: 1, 2, 3, 5, 4, 6, 7, 8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
*/

//Keep track of each bribe and go through the sequencing
const minimumBribes = (q) => {
    let bribes = 0;
    let swapped = true;
    let tooChaotic = false;
    let firstRun = true;

    while(swapped === true) {
        swapped = false;
        for(let i = 0; i < q.length; i++) {
            if(q[i] - i > 3 && firstRun) {
                tooChaotic = true;
            }

            if(q[i] && q[i] > q[i+1]) {
                let temp = q[i];
                q[i] = q[i+1];
                q[i+1] = temp;
                swapped = true;
                bribes++;
            }
        }
        firstRun = false;
    }

    if(tooChaotic) {
        console.log("Too chaotic");
    } else {
        console.log(bribes);
    }
}

/* Minimum Swaps 2:
    You are given an unordered array consiting of consecutive integers [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

    for each position in the array
    if a number is in the wrong location
        find the position the number should go
        perform a swap
*/
const minimumSwaps = (n, arr) => {
    let swaps = 0;
    for(let i = 0, l = Math.max(...arr); i < l; i++) {
        while(arr[i] !== i+1) {
            var temp;
            temp = arr[i];
            arr[i] = arr[arr[i]-1];
            arr[temp-1] = temp;
            if(!arr[i]) 
            break;
            swaps++;
        }
    }
    return swaps;
}

/* 
Array Manipulation 
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

*/

/* Verify if a number is a prime number */
const isPrime = (n) => {
    let divisor = 2;
    if(n === 2) {
        return true;
    }

    while(n > 2) {
        if(n % divisor !== 0) {
            return true;
            divisor++;
        } else {
            return false;
        }
    }
}

const fibonacci = n => {
    let arr = [0,1];
    for(let i = 2; i < n + 1; i++) {
        arr.push(arr[i-2] + arr[i-1]);
    }
    return arr[n];
}

function fibRecursive(n) {
    if(n < 2) {
        return n
    }
    return fibRecursive(n - 1) + fibRecursive(n - 2);
}

/* 
Hash Table Ransom Notes:
harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting.
he found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his rnasom note.
The words in his note are case-sensitive and he must use only whole words available in the magazine.
He cannot use substrings or concatentation to create the words he needs.
Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine;
other print no.
*/

const checkMagazine = (magazine, note) => {
    for(let i = 0; i < note.length; i++) {
        let finder = magazine.indexOf(note[i])
        if(finder != -1) {
            magazine[finder] = '';
            if(i === note.length - 1) {
                console.log("Yes");
            }
        } else {
            console.log("No");
            break;
        }
    }
}

/* 
Given two strings, determine if they share a common substring. A substring may be as small as one character.
For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.
*/
//https://codeburst.io/learn-understand-javascripts-filter-function-bde87bce206

function twoStrings(s1, s2) {
    const s1len = s1.length;
    const s2len = s2.length;
    let result = "NO";

    if(s1len >= 1 
        && s1len <= 100000
        && s2len >= 1
        && s2len <= 100000) {
            //traverses each letter to see if one letter === in other string.
            result = (s1.split('')
            //use filter to remove any character not present in the other string.
                        .filter((el, key) => s2.indexOf(el) > -1)
                        .length > 0) ? "YES" : "NO";
        }   
        return result;
}

//Mark and Toys
/* Mark and Jane are very happy after having their first child. 
Their son loves toys, so Mark wants to buy
There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.*/

//organize in ascending order,
//subtract prices from total money  before no more money
//won't buy others if we can't buy highest priced one.

function processData(input) {
    let setup = input.split("\n"),
        params = setup[0].split(' ').map(Number),
        toys = setup[1].split(' ').map(Number).sort((a,b) => a - b),
        toyNum = params[0],
        money = params[1],
        total = 0;
    while (money > 0 && total < toyNum) {
        money -= toys[total];
        total++;
    }
    console.log((total === toyNum) ? toyNum : total - 1);
} 

/* 
Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. 
Any characters can be deleted from either of the strings.
*/

function getDeleteCountUsingIndexOf() {
    var aChars = a.split("");
    var bChars = b.split("");
  
    if (aChars.length > bChars.length) {
      var outer = aChars;
      var inner = bChars;
    } else {
      var outer = bChars;
      var inner = aChars;
    }
  
    var outerIndex = outer.length-1;
    while (inner.length > 0 && outer.length > 0 && outerIndex >= 0) {
      let innerIndex = inner.indexOf(outer[outerIndex]);
      if (innerIndex !== -1) {
        outer.splice(outerIndex, 1);
        inner.splice(innerIndex, 1);
      }
      --outerIndex;
    }
  
    return outer.length + inner.length;
  }

  /* Write a function that takes in a string and if the string is a string representation of a number,
   return the negative version of that number otherwise throw an Error.

Ex:
Input: '1'
Output: -1

Input: '4'
Output: -4

Input: 'cow'
Error*/

const stringNum = (strNum) => {
    let negNum = (strNum * -1);

    if(isNaN(negNum)) {
        throw 'Error';
    } else {
        return negNum;
    }
}

/* 
Write a function that takes 2 parameters - the first is an array, the second is an element that may or may not be in the array. 
Without using any built in array methods, return true if the element is in the array or false otherwise. 
. 

Ex:
Input: [1,2,3]  1
Output: true

Input: [1,2,3]  4
Output: false

Input: ['code', 'dev', 'nerd']  'nerd'
Output: true

Input: ['code', 'dev', 'nerd']  'genius'
Output: false
*/

const isInArray = (arr, elem) => {
    for(let i = 0; i < arr.length; i++) {
        if(elem = arr[i]) {
            return true;
        } else {
            return false;
        }
    }
}