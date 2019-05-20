/* 
This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4. Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

Implement car and cdr.
*/

const cons = (a, b) => {
    const pair = (f) => {
        return f(a, b);
    }
    return pair;
}

const car = (pair) => {
    const f = (a,b) => {
        return a;
    }
    return pair(f);
}

const cdr = (pair => {
    const f = (a , b) => {
        return b;
    }
    return pair(f);
})


console.log( car(cons(3, 4)) );
console.log( cdr(cons(3, 4)) );