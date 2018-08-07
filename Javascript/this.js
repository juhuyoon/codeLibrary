//https://medium.com/@kristyburge/why-this-is-so-powerful-in-javascript-34116f1ca5f2
//http://ryanmorr.com/understanding-scope-and-context-in-javascript/


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