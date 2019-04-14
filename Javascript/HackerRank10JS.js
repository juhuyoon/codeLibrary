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

//binary search tree 

BinarySearchTree.prototype.push = function(val){
    var root = this.root;
 
    if(!root){
       this.root = new Node(val);
       return;
    }
 
    var currentNode = root;
    var newNode = new Node(val); 
 
    while(currentNode){
       if(val < currentNode.value){
           if(!currentNode.left){
              currentNode.left = newNode;
              break;
           }
           else{
              currentNode = currentNode.left;
         }
      }
      else{
          if(!currentNode.right){
             currentNode.right = newNode;
             break;
          }
          else{
             currentNode = currentNode.right;
          }
      }
   }
 
 }


/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    var ctr = 0;
    for(var i=0; i<objects.length; i++){
      if(objects[i].x == objects[i].y) {
        ctr++;
      }
    }
    return ctr;
}

//prototype property:
    /* 
        Every function in JS has a prototype property,
        which is empty by default. 
        It is an object blueprint where you can add methods and properties to the prototpye,
        accessible to all instances of that function. 
        Useful for inheritance.     
    */

    function Fruit(type) {
        this.type = type;
        this.color = 'unknown';
    }

    Fruit.prototype.getInformation = () => {
        return 'This ' + this.type + ' is ' + this.color + '.';
    }

    let lime = new Fruit('Mexican Lime');
        console.log(lime.getInformation());
    lime.color = 'green';
        console.log(lime.getInformation());


    //with objects:
        let lime = {
            type: 'Mexican lime',
            color: 'green',
            getInformation: function() {
                return 'This ' + this.type + ' is ' + this.color + '.';
            }
        }

        console.log(lime.getInformation());
        lime.color = 'yellow';
        console.log(lime.getInformation());



//Singleton Class Using a Function
/* 
    singleton class is a design pattern that restricts a class
    to a single instance. When we assign the value of new function() {}
    to a variable, the following happens:
    1) Define an anonymous constructor function.
    2) Invoke the anonymous constructor function with the new keyword.
*/

let lime = new function() {
    this.type = 'Mexican lime';
    this.color = 'green';
    this.getInformation = function() {
        return 'This ' + this.type + ' is ' + this.color + '.';
    };   
}

console.log(lime.getInformation());
lime.color = 'yellow';
console.log(lime.getInformation());

/* 
    Classes:
        Use class declaration.     
    
*/
class Polygon {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
}

let p = new Polygon(1,2);
console.log('Polygon p: ', p);

/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

    class Polygon {
        constructor(sides) {
            this.sides = sides;
        }
        perimeter() {
            return this.sides.reduce(function(a,b) {
                return a + b
            });
        }
    }

/* Inheritance
    Create an object prototype/class that is an extension of 
    another object prototype or class. 
*/
class Rectangle {
    constructor(w, h) {
        this.w = w;
        this.h = h;
    }
}

/*
 *  Write code that adds an 'area' method to the Rectangle class' prototype
 */
Rectangle.prototype.area = function () {
    return (this.w * this.h);
}

/*
 * Create a Square class that inherits from Rectangle and implement its class constructor
 */
class Square extends Rectangle{
    constructor(s) {
        super(s);
        this.h = s;
        this.w = s;
    }
}

/* 
    Write a function that takes in an array of numbers and outputs the average of all the numbers. 
    Input: [1,4,7]
    Output: 4

    Input: [10,5]
    Output: 7.5

    Input: [1.5, 3, 2.5, 1]
    Output: 2
*/

 const average = (numArr) => {
     let sum = 0;
     for(let i = 0; i < numArr.length; i++) {
         sum += numArr[i];
     }
     return sum / numArr.length;
 }

/* 
Template Literals
*/ 

/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 * 
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {
    //destructuring of arrays
    const [a, p] = expressions;
    const root = Math.sqrt((p*p) - (16*a));
    const s1 = (p + root)/4;
    const s2 = (p + root)/4;

    return ([s2,s1]);
}

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    return nums.map(n => n = (n % 2 == 0) ? n * 2 : n * 3);
}

/* Bitwise Operators*/
function getMaxLessThanK(n, k) {
    let max_anb = 0;
    for (let b = n; b > 0; b--) {
        for (let a = b - 1; a > 0; a--) {
            if ((a & b) < k && (a & b) > max_anb) {
                max_anb = (a & b);
            }
        }
    }
    return max_anb;
}

// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    // Write your code here
    const day = new Date(dateString);
    const weekDays = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    return weekDays[day.getDay()];
}

function regexVar(str) {
 //  ^ => first item matches:
// () => stores matching value captured within
// [aeiou] => matches any of the characters in the brackets
// . => matches any character:
// + => for 1 or more occurrances (this ensures str length > 3)
// \1 => matches to previously stored match. 
    // \2 looks for matched item stored 2 instances ago 
    // \3 looks for matched item stored 3 ago, etc

//  $ ensures that matched item is at end of the sequence

let re = /^([aeiou]).+\1$/;
    return re;
}

/* Write a function that takes in an input and returns true if it’s an integer and false otherwise.

Ex:
Input: "7"
Output: false

Input: 7
Output: true

Input: 4.3
Output: false
*/

const isInt = input => {
    return parseInt(input) === input;
}

/* Write a funciton that takes an array of integers as an input and outputs the first duplicate. 
x:
Input: [ 2, 5, 6, 3, 5 ]
Output: 5

Input: [ 1, 3, 4, 1, 3, 4 ]
Output: 1

Input: [ 2, 4, 5 ]
Output: undefined 
*/

const findDuplicates = (arr) => {
    for(let i = 0; i < arr.length; i++) {
        for(var j = 0; j < i; j++) {
            if(arr[i] === arr[j]) {
                return arr[i];
            } 
        }
    }
}

//better
// key is dups[val], value = true, 
//once the dups[val] = true shows up, return that value. 
const findDuplicates = (arr) => {
    const dups = {};
    for(let i = 0; i < arr.length; i++) {
        const val = arr[i];
        if(dups[val]) {
            return val;
        } else {
            dups[val] = true;
        }
    }
}

/* 
Write a function that takes in a string and returns true if it’s a pangram or false otherwise.
Pangram: a sentence that contains every letter in the alphabet.

Ex:
Input: “Watch Jeopardy, Alex Trebek’s fun TV quiz game”
Output: true

Input: “Five hexing wizard bots jump quickly”
Output: true

Input: “JavaScript is the best”
Output: false
*/

const isProgram = (str) => {
    str = str.toLowerCase();
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    for(let i = 0; i < alphabet.length; i++) {
        if(str.includes(alphabet[i])) {
            return true;
        } else {
            return false;
        }
    }
}

//remove duplicate

function removeDuplicate(arr){
    var exists ={},
        outArr = [], 
        elm;
  
    for(var i =0; i<arr.length; i++){
      elm = arr[i];
      if(!exists[elm]){
        outArr.push(elm);
        exists[elm] = true;
     }
    }
    return outArr;
  }
var myfunction = function() {

}
    
//merge two sorted array
function mergeSortedArray(a, b){
    var merged = [], 
        aElm = a[0],
        bElm = b[0],
        i = 1,
        j = 1;
    
    if(a.length ==0)
      return b;
    if(b.length ==0)
      return a;
    /* 
    if aElm or bElm exists we will insert to merged array
    (will go inside while loop)
     to insert: aElm exists and bElm doesn't exists
               or both exists and aElm < bElm
      this is the critical part of the example            
    */
    while(aElm || bElm){
     if((aElm && !bElm) || aElm < bElm){
       merged.push(aElm);
       aElm = a[i++];
     }   
     else {
       merged.push(bElm);
       bElm = b[j++];
     }
    }
    return merged;
  }
  
  //button creation:
  var btn = document.createElement("Button");

    btn.innerHTML = "0";
    btn.id = "btn";
    document.body.appendChild(btn);

    btn.onclick = function() {
        btn.innerHTML++;
    }

//buttonGrid
    btn5.onclick = ()=>{
        var originalbtn1 = btn1.innerHTML;
        btn1.innerHTML = btn4.innerHTML;
        btn4.innerHTML = btn7.innerHTML;
        btn7.innerHTML = btn8.innerHTML;
        btn8.innerHTML = btn9.innerHTML;
        btn9.innerHTML = btn6.innerHTML;
        btn6.innerHTML = btn3.innerHTML;
        btn3.innerHTML = btn2.innerHTML;
        btn2.innerHTML = originalbtn1;
    }

//calculator
let elem = document.getElementById("res");
  
  function checkOperator(){
    if(elem.innerHTML.endsWith('+') || elem.innerHTML.endsWith('-') || elem.innerHTML.endsWith('*') || elem.innerHTML.endsWith('/')){
      return true;
    }
  }
  
  function clickZero() {
    elem.innerHTML +='0';
  }
  
  function clickOne() {
    elem.innerHTML +='1';
  }
  
  function clickSum() {
    if(elem.innerHTML.length!=0 && !checkOperator()){
        elem.innerHTML +='+';
       }
  }  
  
  function clickSub() {
    if(elem.innerHTML.length!=0 && !checkOperator()){
        elem.innerHTML +='-';
       }
  }

  function clickMul() {
    if(elem.innerHTML.length!=0 && !checkOperator()){
        elem.innerHTML +="*";
       }
  }

  function clickDiv() {
    if(elem.innerHTML.length!=0 && !checkOperator()){
        elem.innerHTML +="/";
      }
  }

  function clickClr() {
    elem.innerHTML = '';
  }

  function clickEql() {
    if(!checkOperator()) {
      let re = /\d+/g
      let re2 = /[\+\-\*\/]+/g
      let numbers = elem.innerHTML.match(re);
      let operations = elem.innerHTML.match(re2);
      while(operations.length>0) {
        if(operations.includes('*')) {
          let indexOfMul = operations.indexOf('*');
          let mul = ( indexOfMul!=0 ? parseInt(numbers[indexOfMul-1],2) : parseInt(numbers[indexOfMul],2) ) * parseInt(numbers[indexOfMul+1],2);
          numbers.splice(indexOfMul,2);
          numbers.splice(indexOfMul,0,mul.toString(2));
          operations.splice(indexOfMul,1);
        } else if (operations.includes('/')) {
          let indexOfDiv = operations.indexOf('/');
          let division = ( indexOfDiv!=0 ? parseInt(numbers[indexOfDiv-1],2) : parseInt(numbers[indexOfDiv],2) ) / parseInt(numbers[indexOfDiv+1],2);
          numbers.splice(indexOfDiv,2);
          numbers.splice(indexOfDiv,0,division.toString(2));
          operations.splice(indexOfDiv,1);
        } else if (operations.includes('+')) {
          let indexOfSum = operations.indexOf('+');
          let sum = ( indexOfSum!=0 ? parseInt(numbers[indexOfSum-1],2) : parseInt(numbers[indexOfSum],2) ) + parseInt(numbers[indexOfSum+1],2);
          numbers.splice(indexOfSum,2);
          numbers.splice(indexOfSum,0,sum.toString(2));
          operations.splice(indexOfSum,1);
        } else {
          let indexOfSub = operations.indexOf('-');
          let sub = ( indexOfSub!=0 ? parseInt(numbers[indexOfSub-1],2) : parseInt(numbers[indexOfSub],2) )- parseInt(numbers[indexOfSub+1],2);
          numbers.splice(indexOfSub,2);
          numbers.splice(indexOfSub,0,sub.toString(2));
          operations.splice(indexOfSub,1);
        }  
      }
      elem.innerHTML = numbers[0].toString(2);
    } else {
      alert("Line must ends with number.")
    }
  }