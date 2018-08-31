//https://medium.com/@kristyburge/why-this-is-so-powerful-in-javascript-34116f1ca5f2
//http://ryanmorr.com/understanding-scope-and-context-in-javascript/
//SCOPING IN JAVASCRIPT: https://css-tricks.com/javascript-scope-closures/

//What is this?

//context is always the value of this keyword which is a reference to the object that "owns" the currently executing code. 

//Here’s my unofficial, no jibberish definition:
//“this” is a keyword used in JavaScript that has a special meaning depending on the context it’s being used
//The reason “this” is so confusing when you’re first learning JavaScript is because the context of “this” changes depending on how it’s used.

// Let’s dig into some examples:
// When “this” points to the Window object (Global)
// Methods on objects
// When “this” is used as a method on an object
// When “this” is used as a method on a nested object
// When “this” is used as a method on an object (arrow functions)
// Function contexts
// The ‘new’ keyword — why this is so powerful
// Creating instances of an object from a constructor function with “new” keyword

console.log(this);

// returns the Window object
// Window {	postMessage: ƒ, 
// blur: ƒ, 
// focus: ƒ, 
// close: ƒ, 
// frames: Window, …}

function myFunction() {
	console.log(this);
}

// Call the function
myFunction(); 

// returns the Window object! 
// Window {	postMessage: ƒ, 
// blur: ƒ, 
// focus: ƒ, 
// close: ƒ, 
// frames: Window, …}

var dog = {
    name: 'Chester',
    breed: 'beagle',
    intro: function(){
      console.log(this);
    }
  };
  
  dog.intro();
  
  // returns the dog object and all of it's properties and methods
  // {name: "Chester", breed: "beagle", intro: ƒ}
  //    breed:"beagle"
  //    intro:ƒ ()
  //    name:"Chester"
  //    __proto__:Object

  var obj1 = {
    hello: function() {
      console.log('Hello world');
      return this;
    },
    obj2: {
        breed: 'dog',
        speak: function(){
              console.log('woof!');
              return this;
          }
      }
  };
   
  console.log(obj1);
  console.log(obj1.hello());  // logs 'Hello world' and returns obj1
  console.log(obj1.obj2);
  console.log(obj1.obj2.speak());  // logs 'woof!' and returns obj2


//Note that the 'this' in the arrow function is completely different. 
//in arrow functions, 'this' will point to the window object even if it is within an object.
  var objReg = {
    hello: function() {
      return this;
    }
  };
   
  var objArrow = {
        hello: () => this
  };
   
  objReg.hello(); // returns the objReg object that we expect
  objArrow.hello(); // returns the Window object!

  // “An arrow function expression has a shorter syntax than a function expression and does not have its own this, arguments, super, or new.target. 
  //These function expressions are best suited for non-method functions, and they cannot be used as constructors.”


  //3. When 'this' is used in a normal function context:
  //When a function sits in the global scope, then the value of ‘this’ is the Window object. Think of it as the test function being a method on the context in which it sits (the window object).


function test() {
  console.log('hello world');
  console.log(this);
}

test();

// hello world
// Window {postMessage: ƒ, blur: ƒ, focus: ƒ, close: ƒ, frames: Window, …}
//HOWEVER, if a function is executed in strict mode, 'this' will return undefined because strict mode does not allow default binding. 
function test() {
  'use strict';
  return this;
}

console.log( test() );
// returns undefined, not the Window object … interesting

//4. the 'new' keyword and why 'this' is so powerful as you continue. 
//constructor function allows to define an object(like numbers/strings except it has its own special properties and methods)
function Dog(breed, name, friends){
  this.breed = breed;
  this.name = name;
  this.friends = friends;	
  this.intro = function() {
      console.log(`Hi, my name is ${this.name} and I’m a ${this.breed}`);
      return this;
  }; 
}


var str = new String('Hello world');
/*******
You could do the above, but it's best to avoid it (instead do like the variable str2 below)
(because JavaScript knows that anything inside single or double quotes has the type of String)
Same goes for other primitives. This is for example purposes only. 
NOTE: To clarify -- the only time I ever use the new keyword in practice is when I use a function constructor and create my own object type.
*******/

var str2 = 'Hello world';
// both have the prototype of String and inherit all the String methods and properties

// Using the Dog prototype, create a new instance 
var chester = new Dog('beagle', 'Chester', ['Gracie', 'Josey', 'Barkley']);
chester.intro();        // returns Hi, my name is Chester and I'm a beagle
console.log(chester);   // returns Dog {breed: "beagle", name: "Chester", friends: Array(3), intro: ƒ}

// Here's another example:
var City = function(city, state) {
  this.city = city || "Phoenix";
  this.state = state || "AZ";
  this.sentence = function() {
    console.log(`I live in ${this.city}, ${this.state}.`);
  };
};

var phoenix = new City(); // use the default parameters
console.log(phoenix); // returns the phoenix object (an instance of the City prototype)
phoenix.sentence(); // returns "I live in Phoenix, AZ."

var spokane = new City('Spokane', 'WA');
console.log(spokane); // returns the spokane object (another instance of the City prototype)
spokane.sentence(); // returns "I live in Spokane, WA."

//The ‘new’ keyword is important!
// Constructor Function
var Friend = function(name, password, interests, job){
  this.fullName = name;
  this.password = password;
  this.interests = interests;
  this.job = job;
};

function sayHello(){
   // uncomment the console.log to see the object that 'this' points to
  //  console.log(this); 
  return `Hi, my name is ${this.fullName} and I'm a ${this.job}. Let's be friends!`;
}

// Create one or multiple instances of the Friend prototype with the keyword 'new'
var john = new Friend('John Smith', 'badpassword', ['hiking', 'biking', 'skiing'], 'teacher'); 

console.log(john); 

// Assign the function to the greeting key on the john object
john.greeting = sayHello; 

// Call the the new method
console.log( john.greeting() ); 

// Remember, you can't call sayHello() as a function; it will return "Hi, my name is undefined and I'm a undefined. Let's be friends!"
// Because the function's context is global and the window object does NOT have the keys that belong to the Friend prototype
console.log( sayHello() ) ; 