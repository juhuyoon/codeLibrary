//write a function that takes in a string and outputs the number of vowels(not counting y)
//ex: input "hello" output: 2

const practice = (n) => {
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    var vcount = 0;

    for(i = 0; i < n.length; i++) {
        if(n.indexOf(n[i] !== -1)) {
            vcount += 1;
        } 
        return vcount;
    }
    console.log("Did not run");
}


/* Write a function that takes in two numbers and outputs the max (the greater of the two numbers).

Ex: 
Input: 1, 2
Output: 2

Input: 6, -4
Output: 6

Input: 3.4, 2
Output: 3.4
 */

 const maxNumber = (n1, n2) => {
     if(n1 > n2) {
         return n1;
     } else {
         return n2;
     }
 }

 /* Write a function that takes in an integer and outputs the sum of all the numbers from 1 to that integer.

Ex: 
Input: 2
Output: 3 (because 1 + 2 = 3)

Input: 4
Output: 10  (because 1 + 2 + 3 + 4 = 10)

Input: 10
Output: 55 
*/

const outputSum = n => {
    const sum = 0;
    for(i = 0; i < n.length; i ++) {
        sum += i;
    }
    return sum;
}

/* Write a function that takes in an array of numbers and outputs the maximum number.

Ex: 
Input: [ 1, 2, 3 ]
Output: 3

Input: [ 3, 6, 4, 5, 2, 1 ]
Output: 6

Input: [ 3, 3, 3 ]
Output: 3
*/

const maxArrayNum = nArr => {
    const maxArr = nArr[0];
    for(var i = 1; i < nArr.length; i++) {
        if(nArr.indexOf(i) > maxArr){
            maxArr = nArr[i];
        }
    }
    return maxArr;
}