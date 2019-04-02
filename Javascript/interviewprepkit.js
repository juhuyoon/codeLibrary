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
