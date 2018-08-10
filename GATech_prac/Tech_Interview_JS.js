//https://www.toptal.com/javascript/interview-questions
//https://github.com/ganqqwerty/123-Essential-JavaScript-Interview-Questions
//https://medium.com/javascript-scene/10-interview-questions-every-javascript-developer-should-know-6fa6bdf5ad95

var myObject = {
    foo: "bar",
    func: function() {
        var self = this;
        console.log("outer func:  this.foo = " + this.foo);
        console.log("outer func:  self.foo = " + self.foo);
        (function() {
            console.log("inner func:  this.foo = " + this.foo);
            console.log("inner func:  self.foo = " + self.foo);
        }());
    }
};
myObject.func();

//output : outer func:  this.foo = bar
outer func:  self.foo = bar
inner func:  this.foo = undefined
inner func:  self.foo = bar

//In the outer function, both this and self refer to myObject and therefore both can properly reference and access foo.
//In the inner function, though, this no longer refers to myObject.As a result, this.foo is undefined in the inner function, whereas the reference to the local variable self remains in scope and is accessible there.


//In what order will the numbers 1-4 be logged to the console when the code below is executed?
    (function () {
        console.log(1);
        setTimeout(function () { console.log(2) }, 1000);
        setTimeout(function () { console.log(3) }, 0);
        console.log(4);
    })();

//result : 1, 4, 3, 2

//What will the code below output to the console and why?
var arr1 = "john".split('');
var arr2 = arr1.reverse();
var arr3 = "jones".split('');
arr2.push(arr3);
console.log("array 1: length=" + arr1.length + " last=" + arr1.slice(-1));
console.log("array 2: length=" + arr2.length + " last=" + arr2.slice(-1));

//result: 
"array 1: length=5 last=j,o,n,e,s";
"array 2: length=5 last=j,o,n,e,s";

//What will the code below output to the console and why?
console.log(1 + "2" + "2");
console.log(1 + +"2" + "2");
console.log(1 + -"1" + "2");
console.log(+"1" + "1" + "2");
console.log("A" - "B" + "2");
console.log("A" - "B" + 2);

//result: 
"122"
"32"
"02"
"112"
"NaN2"
NaN


//1. Can you name two programming paradigms important for JavaScript app developers?
//JavaScript is a multi-paradigm language, supporting imperative/procedural programming along with OOP (Object-Oriented Programming) and functional programming. 
//JavaScript supports OOP with prototypal inheritance.

//2. What is Functional Programming?
//Functional programming produces programs by composing mathematical functions and avoids shared state & mutable data. 

//3. What is the difference between classical inheritance and prototypal inheritance?
//Class Inheritance: instances inherit from classes (like a blueprint — a description of the class), and create sub-class relationships: hierarchical class taxonomies. 
//Instances are typically instantiated via constructor functions with the `new` keyword. Class inheritance may or may not use the `class` keyword from ES6.

//Prototypal Inheritance: instances inherit directly from other objects. 
//Instances are typically instantiated via factory functions or `Object.create()`. Instances may be composed from many different objects, allowing for easy selective inheritance.

//4.When is classical inheritance an appropriate choice?
//Never.

//5. What does “favor object composition over class inheritance” mean?
//It means that code reuse should be achieved by assembling smaller units of functionality into new objects instead of inheriting from classes and creating object taxonomies.