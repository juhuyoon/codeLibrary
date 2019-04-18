RANDOM FUNCTIONS THAT YOU MIGHT LIKE!

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

//To avoid using globals and keep all variables organized. [Revealing Module Pattern]
variable = function () {
    var current = null;
     function init() { }
     function change() { }
     function verify() { }
    return { 
    init: init,
    change: change
    }
};
//then call. 
variable().set = //invokes change() method. 




//set separate variables for variable arrays to speed up arrays by creating a second variable in a pre-loop statements. 
var names = ['George', 'Ringo', 'Paul', 'John'];
for (var i = 0, j = names.length; i < j; i++) {
    doSomeThingWith(names[i]);
}




//check all variables and ensure that they are the right type of parameters. 
function buildMemberList(list) {
    if (typeof list === 'object' &&
        typeof list.slice === 'function') {
        var all = list.length;
        var ul = document.createElement('ul');
        for (var i = 0; i < all; i++) {
            var li = document.createElement('li');
            li.appendChild(document.createTextNode(list[i].name));
            ul.appendChild(li);
        }
        return ul;
    }
}



//easy password storages
function passWord(string) {
    string = string.toLowerCase()
    return storage(string)
}

//to remove duplicates from a given testarray
function sortedArray(arr) {
    var newArray = arr.filter(function (elem, index, self) {
        return index == self.indexOf(elem);
    });
    return newArray;
}

sortedArray(testArray);

//Write a function which accepts an array as an argument and displays(via the console.log() method) the 2nd lowest & 2nd greatest numbers in the list.


function Second_Greatest_Lowest(arr_num) {
    arr_num.sort(function (x, y) {
        return x - y;
    });
    var uniqa = [arr_num[0]];
    var result = [];

    for (var j = 1; j < arr_num.length; j++) {
        if (arr_num[j - 1] !== arr_num[j]) {
            uniqa.push(arr_num[j]);
        }
    }
    result.push(uniqa[1], uniqa[uniqa.length - 2]);
    return result.join(' , ');
}

// Multiples of 3 and 5 under 1000
for (
    var sum = 0, i = 1;
    i < 1000;
    !(i % 3 && i % 5) && (sum += i), i++
);
console.log(sum);

//Try catch is SYNCHRONOUS, so put them inside asynchronous functions!
setTimeout(function(){
    try{
       if (1 == 1){
          throw new Error("something is still wrong")
       }else{
          throw new TypeError("something else is wrong")
       }
    }catch(err){
      console.log(err.message)
  }
},3000)

 

//The difference between i++ and ++i is the value of the expression.
//The value i++ is the value of i before the increment. The value of ++i is the value of i after the increment.
var i = 42;
    alert(i++); // shows 42
    alert(i); // shows 43
    i = 42;
    alert(++i); // shows 43
    alert(i); // shows 43

//Promise example

var promise = new Promise(function(resolve,reject){
    var output = 5;
    setTimeout(function(){
       try{
            console.log(++output);
            resolve(output); //1
         }catch(e){
             reject("something is still wrong");
         }
    }, 3000);
 });
 
 promise.then(function(result){
   console.log("the value is "+ result);
   return result;
 }).then(function(result){
   console.log(result * result);
   return result;
 }).then(function(result){
   console.log(result*3)
   return result;
 })
 
 promise.catch(function(err){
     console.log(err);
 })
   

//Different Error Class examples
 class MyError extends Error {}
// callback with a custom error object
let getError = cb => cb(new MyError('there was a problem'))
// get the error and log the stack trace
getError((err) => console.log(err))

//adding information to a database using `` from ES6
function displayResults(data) {
    // Add to the table here...
    //empty first!
    $("tbody").empty();
    data.forEach(function(animals){
      $("tbody").append(`<tr><td>$(animals.name)</td></tr><tr><td>$(animals.numLegs)</td></tr>``<tr><td>$(animals.class)</td></tr><tr><td>$(animals.weight)</td></tr><tr><td>$(animals.whatICallIt)</td></tr>`)
    });
  }

//ordering a sort listing using 1 and -1
  const ordered = inventors.sort(function(a, b){
    if (a.year > b.year){
        return 1;
    } else {
        return -1;
    }
});
console.table(ordered);

        //ternary function of same sorting list
        const ordered = inventors.sort((sorta,b) => a.year > b.year ? 1 : -1)

const filters = () => {
    let arr = [1,2,3,4,5,6];
    let even = [];
    //return only even numbers, 
    //so return true if a number is even, false is not.
    let even = arr.filter(el => {
        return el % 2 === 0;
    });
    even = [2,4,6];
}

let data = [
    {
      country: 'China',
      population: 1409517397,
    },
    {
      country: 'India',
      population: 1339180127,
    },
    {
      country: 'USA',
      population: 324459463,
    },
    {
      country: 'Indonesia',
      population: 263991379,
    }
  ]
  let cities = data.filter(ele => {
      ele.population > 500000000;
  })

  //ES6 simplification
  let cities = data.filter(ele => ele.population > 50000000);

  //reduce
  var arr = [1,2,3,4];
  let sum = arr.reduce((acc, val) => {
    return acc + val;
  }, 100); //adds up the array, but also starts at 100.
  //so instead of sum = 10, it'll be sum = 110.

  let data = [
    {
      country: 'China',
      pop: 1409517397,
    },
    {
      country: 'India',
      pop: 1339180127,
    },
    {
      country: 'USA',
      pop: 324459463,
    },
    {
      country: 'Indonesia',
      pop: 263991379,
    }
  ]

  let sum = data.reduce((acc, val) => {
      return val.country == 'China' ? acc : acc + val.pop;
  })

  //chaining map, filter, reduce

