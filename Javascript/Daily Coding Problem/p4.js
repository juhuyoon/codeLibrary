/* 
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. 
The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3. 
You can modify the input array in-place.
*/

//Linear time and constant space. O(n) time and O(n) space.

const example1 = [3, 4, -1, 1];
const example2 = [1, 2, 0];

const p4 = (input) => {
    const positives = input.filter(number => number > 0);
    let i =1;
    while(i <= Math.max(...positives) +1) {
        if(!positives.includes(i)) {
            return i;
            i++;
        }
    }
}

console.log(p4(example1));
console.log(p4(example2));