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

