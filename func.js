//Accepts a string and a function as arguments, then logs the string and runs the function.
function logBefore(func, message) {
    console.log(message);

    func();
};



//Accepts a boolean value and a function as arguments, runs the function if the boolean argument is true. 
function runIf(func, bool) {
    if(bool) {
        func();
    }
}


//Accepts a function and a value then returns the function that returns the result of running Func. on Value. 
function wrap(func, value) {
    return function() {
        return func(value);
    }
}

