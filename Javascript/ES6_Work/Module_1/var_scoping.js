//var variables are only available in a function scope

function setWidth() {
    var width = 100;
    console.log(width);
}   
setWidth();

//if not created in the function, then it can be a global scope, with the windows. 
var width = 200;
console.log(width);

//the bad thing about global scopes
var age = 100;
if(age > 12) {
    var dogYears = age * 7; //this is a temp holding variable
    //this will leak outside the if statement if console.logged in windows because the age is a global scope, it will leak. 
    console.log(`You are ${dogyears} dog years old!`);
}

//let and const will not be scoped to the function, but to the block [Block Scoped]

//Block: Any time there is a {}, that is a block statement
var age = 100;
if(age > 12) {
    let dogYears = age * 7;
    console.log(`You are ${dogyears} dog years old!`);
    //then the dogYears will not leak out of this block scope. 
}



let height = 200;
const key = 'abc123';