/* 
This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not allowed.
*/

/* 
Decoder... 
Does the decoded message have to be 3 letters, or it can be any. Count number of ways it can be decoded...
convert the values to string, then split them based on their index and push to empty array and return it. 
parameter (1 ~ 26)
loop through, go through each iteration possible, 
*/

const e1 = 111;
const e2 = 12345;
const e3 = 4;

const decodeCount = (message) => {
    message = message.toString();

    const array1 = [];
    const array2 = [];
    for(let i = 0; i < message.length; i++) {
        if(message.charAt(i+1)) {
            array1.push(message.charAt(i) + message.charAt(i+1));
        }
    }


    //Split1, start at index 1
    array2.push(message.charAt(0));
    for (var i = 1; i < message.length; i+=2) {
      // If we have enough letters left to make a par
      if(message.charAt(i+1)){
        array2.push(message.charAt(i) + message.charAt(i+1))
      } else {
        array2.push(message.charAt(i))
      }
      
    }
    console.log(array1, array2)
    // base : one way to solve
    // Every time we encounter an index that is <= 26, that's another way 
    const nbWays = 1 + array1.concat(array2).filter( x => x <= 26 && x >= 10).length ;
    return nbWays
}