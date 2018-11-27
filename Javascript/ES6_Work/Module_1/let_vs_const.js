const key = 'abc123'; //immutable. 
let points = 50;
let winner = false;
//if this is run, the winner will come out as false

if(points > 40) {
    let winner = true;
} //the two winner variables are separate variables as they are different block scopes. (same name, different variables.)

//const variables CANNOT be updated while let can be updated. 
    //key = 'abc1234' 
    //Error: Uncaught TypeError: assignment to constant variable. 

    const person = {
        name: 'Wes',
        age: 28
    } //still cannot be updated as it is const, but PROPERTIES of the variables can be changed!, i.e., person.age = 29;, then age will change

    const jae = Object.freeze(person); //will not actually change anything on that actual variable. 