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

var countVowels = function(str){
    var count = 0;
    var input = str.toLowerCase();
    var vowelArr = ["a", "e", "i", "o", "u"];
    for (var i = 0; i < input.length; i++){
      if(vowelArr.includes(input[i])){
          count++;
    }
    }
    return count;
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


/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    let first = nums[0]; //to hold the first number in the array. 
    let second = -1; //from false to true

    for(var i = 0; i < nums.length; i++) {
        if(nums[i] > first) {
            second = first;
            first = nums[i];
        }

        if(nums[i] > second && nums[i] < first) {
            second = nums[i];
        }
    }
    return second;
}

/* 
Task

Complete the reverseString function; it has one parameter, . You must perform the following actions:

Try to reverse string  using the split, reverse, and join methods.
If an exception is thrown, catch it and print the contents of the exception's  on a new line.
Print  on a new line. If no exception was thrown, then this should be the reversed string; if an exception was thrown, this should be the original string.

*/
/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try {
        s = s.split("").reverse().join("");
    }
    catch(e) {
        console.log(e.message);
    } finally {
        console.log(s);
    }
}

/*
Task

Complete the isPositive function below. It has one integer parameter, . If the value of  is positive, it must return the string YES. Otherwise, it must throw an Error according to the following rules:

If  is , throw an Error with  Zero Error.
If  is negative, throw an Error with  Negative Error.
*/

/*
 * Complete the isPositive function.
 * If 'a' is positive, return "YES".
 * If 'a' is 0, throw an Error with the message "Zero Error"
 * If 'a' is negative, throw an Error with the message "Negative Error"
 */
function isPositive(a) {
    if(a > 0) {
        return "YES";
    } else if(a === 0 ) {
        throw Error("Zero Error");
    } else {
        throw Error("Negative Error");
    }
}


/* Write a function that takes in a single word as a string and returns true if it's a palindrome and false otherwise (a palindrome is spelled the same way forwards and backwards).

Ex:
Input: "noon"
Output: true

Input: "horse"
Output: false

Input: "racecar"
Output: true 
*/

const isPalindrome = function(str){
    //for every iteration, in position i, if it does not equal
    //the length - i+1, then return false. 
    //else return true.
    for(var i = 0; i < str.length; i++) {
        if(str[i] !== str[str.length - (i + 1)]) {
            return false;
        }
    }
    return true;
}

const isPalindrome = function(str)
{
    return str.split("").reverse().join("") == str;
}

//interview: what will the following code output?

const arr = [10, 12, 15, 21];
for(var i = 0; i < arr.length; i++) {
    setTimeout(function() {
        console.log('Index: ' + i + ', element: ' + arr[i]);
    }, 3000);
}
//scoping, so answer is: index: 4, element = undefined. 

//ways to solve this issue:
//1): ES6 Solution
for(let i = 0; i < arr.length; i++) {
    //ES6 let syntax creates a new binding
    //every single time the function is called
    setTimeout(function() {
        console.log("The index of this number is : " + i + arr[i]);
    }, 3000);
}

/* SAMPLE INPUT
Left Rotation: 
A left rotation on an array shifts each element of the array 1 unit to the left.
In this challenge, given an array 'arr' and a number 'd', perform 'd' rotation on the array and return the updated array. 
arr = [1,2,3,4,5];
d = 2;

sample output = 
[3,4,5,1,2];
*/

var arr = [1,2,3,4,5];
var d = 2;
console.log(rotateLeft(arr, 2));

function rotateLeft(arr, d) {
    //pesudocode
    //separate empty array .shift() //instead of empty array, create a COPY of the array and save it in a temp variable. 
    //for loop d, run through and pop out the element of the array, 
    //store them in the empty array and store in temp variable.
    //push them back into the array input at the end. .push()
    if(arr.length < 2) {
        return arr;
    } else {
    var arr2 = arr;

    for(i = 0; i <=d-1; i++) {
        //push the first element to the end of the array
        arr2.push(arr2[0]);
        //remove the first element
        arr2.shift();
    }
    return arr2;
}
}


function rotateArr(arr, d) {
    //create a copy of the array and save it in a temp variable
    let temp = arr.slice(0);
    //loop through the array as many times as we need to do rotations
    for(let i = 0; i < d; i++) {
        //remove the first item of the array, store it in a temp variable
        let first = temp.shift();
        //add that temporary variable back at the end of the array
        temp.push(first);
        //once completed, return the newly rotated array. 
    }
    console.log(temp);
    return temp;
}

function rotateOptimize(arr, d) {
    let res = [...arr.slice(d), ...arr.slice(0, d-arr.length)];
    console.log(res);
    return res;
}


/* 
Write a function that takes in a sentence as a string and outputs the number of words.


Ex:
Input: “let’s go!”
Output: 2

Input: “I can’t wait to start coding”
Output: 6

Input: “huh?”
Output: 1

*/

const countWords = (sentence) => {
    let count = 0; //count = 1 so that at minimum it will still be one word. 
    const stringArray = sentence.split(" ");
    for(let i = 0; i < stringArray.length; i++) {
            count++;
    }
    return count;
}
countWords("The quick brown fox jumps over the lazy dog.");
countWords("Shorter Sentence");



//Fizzbuzz
let isThree = false;
let isFive = false;

for(let i = 1; i <= 100; i++) {
    isThree = (i % 3 == 0);
    isFinite = (i % 5 == 0);
    if(isThree && isFive) {
        console.log("FizzBuzz");
    }
}

//Prime Checker
const primeChecker = (number) => {
    for(let i = 2; i < number; i++) {
        if(number % i == 0) {
            return false;
        }
    }
    return (number > 1);
}

function Rectangle(a, b) {
    this.length = a;
    this.width = b;
    this.perimeter = 2 * (a + b);
    this.area = (a * b);
}

//bubble sort
function bubbleSort(arr) {
    var sorted = false;'
    
    while(!sorted) {
        sorted = true;

        for(var i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                sorted = false;
                var temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    return arr;
} 

//other way to bubble sort
function bubbleSort2(arr) {
    var len = arr.length;
    for(var i = len-1; i >= 0; i--) {
        for(var j = 1; j <= i; j++) {
            if(arr[j-1] > arr[j]) {
                var temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}

//binary search tree to find a secret number
