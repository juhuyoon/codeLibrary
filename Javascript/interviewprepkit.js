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

 const countingValeys = (n, s) => {
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