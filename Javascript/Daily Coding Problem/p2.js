/* 
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/

const p2 = (list) => {
    let product = 1;

    for(let i = 0; i < list.length; i ++) {
        product *= list[i];
    }
    for(let i = 0; i < list.length; i++) {
        //divide by the current index then put into list. 
        list[i] = product / list[i];
    }
    
    return list;
}


console.log(p2([1, 2, 3, 4, 5]));


//faster
const p2Faster = (list) => {
    let mult = [];
    let product = 1;

    for(let i = 0; i < list.length; i++) {
        for(let j = 0; j < list.length; j++) {
            if(j !== i) {
                product *= list[j];
            }
            mult[i] = product;
            product = 1;
        }
        return mult;
    }
}

console.log(p2Faster([1,2,3,4,5]));
