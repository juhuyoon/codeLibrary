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