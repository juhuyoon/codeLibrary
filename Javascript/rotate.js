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
