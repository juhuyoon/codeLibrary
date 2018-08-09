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