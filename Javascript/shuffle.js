/*
Libs included:
    underscore lodash chai sinon sinon-chai mocha async request q bluebird jsdom
    
    Pandora allows listeners to play a playlist in shuffle order. Write a function that shuffles a list of trackIds.

    Ex. [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] -> [6, 8, 2, 3, 5, 0, 7, 9, 1, 4]

    Assumptions: 
    Don’t have to implement their own random number generator
    random(a, b) returns a number between a and b (inclusive)


*/

const lodash = require('lodash');


const shuffle = (trackIds) => {
    //generate random number, that number would be stored, remvoe that number base don the index of the array. 

    const shuffledTrackIds = [];


    while (trackIds.length > 0) {
        const randomIndex = lodash.random(0, trackIds.length - 1);

        const trackId = trackIds.splice(randomIndex, 1)[0];
        shuffledTrackIds.push(trackId);
    }

    return shuffledTrackIds;
}

console.log(shuffle([0, 1, 2, 3, 4, 5, 6, 7, 8, 9]));
