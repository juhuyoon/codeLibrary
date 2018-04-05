/////////ES6 LOGICS YOU SHOULD KNOW!!! https://webapplog.com/es6///////


1) Default Parameters //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Default_parameters)

  *ES5*
  var link = function (height, color, url) {
    var height = height || 50
    var color = color || 'red'
    var url = url || 'http://azat.co'
  }


   *ES*6
   const link = function(height = 50, color = 'red', url = 'http://azat.co') {
  } ////can put the parameter's information INTO THE FUNCTION


2) Template Literals //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals)

  *ES5*
  var name = 'Your name is ' + first + ' ' + last + '.'
  var url = 'http://localhost:3000/api/messages/' + id

  *ES6*

  const name = `Your name is ${first} ${last}.`
  const url = `http://localhost:3000/api/messages/${id}`
  //using backticks and $ signs to store the variables inside a message so that you don't have to break them up!!


3)Multi-line Strings in ES6

  *ES5*
  var roadPoem = 'Then took the other, as just as fair,\n\t'
    + 'And having perhaps the better claim\n\t'
    + 'Because it was grassy and wanted wear,\n\t'
    + 'Though as for that the passing there\n\t'
    + 'Had worn them really about the same,\n\t'

  *ES6*
  const roadPoem = `Then took the other, as just as fair,
    And having perhaps the better claim
    Because it was grassy and wanted wear,
    Though as for that the passing there
    Had worn them really about the same,`
    //Using backticks removes the need for \n and concatenation(+)


4) Destructuring Assignments in ES6 //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment)

  *ES5*

  var data = $('body').data(), // data has properties house and mouse
  house = data.house,
  mouse = data.mouse

  or 

  var jsonMiddleware = require('body-parser').json
  var body = req.body, // body has username and password
  username = body.username,
  password = body.password  

 *ES6*
 const {house, mouse} = $('body').data() // we'll get house and mouse variables

 const {json: jsonMiddleware} = require('body-parser')

 const {username, password} = req.body
 //Now, you can put the variables in {} in the variables rather than having them on separate lines and calling back the variable.

 const [col1, col2]  = $('.column'),
 [line1, line2, line3, , line5] = file.split('\n')
 //Also works with arrays!


5) Enhanced Object Literals in ES6 //[http://www.dyn-web.com/tutorials/object-literal/] if you need to know what object literal is
  *ES5* //Object Literal Example:
    var serviceBase = {port: 3000, url: 'azat.co'},
        getAccounts = function(){return [1,2,3]}

    var accountServiceES5 = {
        port: serviceBase.port,
        url: serviceBase.url,
        getAccounts: getAccounts, //getAccounts called again here
            toString: function() {
                return JSON.stringify(this.valueOf())
            }, 
        getUrl: function() {return "http://" + this.url + ':' + this.port},
        valueOf_1_2_3: getAccounts()
    } //getting accounts in ES5...
  
  *ES6* //This is all details you'll find on your google developer tools when you run an array through 
   var serviceBase = {port: 3000, url: 'azat.co'},
       getAccounts = function(){return [1,2,3]}

   var accountService = {
      __proto__: serviceBase, //can set the serviceBase here in proto shorthanding it!
      getAccounts,
      toString() {
        return JSON.stringify((super.valueOf()))
       },
       getUrl() {return "http://" + this.url + ':' + this.port},
       [ 'valueOf_' + getAccounts().join('_') ]: getAccounts()
    }; //Instead of calling getAccounts twice, you can just use getAccounts to continue on with your build. 

6) Arrow Functions in ES6 //(personal favorite)
    //Cleaning up this and that
    *ES5*
    var that = this
        $('.btn').click(function(event){
        that.sendData()
        })

    *ES6*
        $('.btn').click((event) =>{
            this.sendData()
        }) //your this no longer has to be re-referenced/mutated. Just use => !


    //Using => as functions
    *ES5*
        var logUpperCase = function() {
            var that = this
      
            this.string = this.string.toUpperCase()
            return function () {
                return console.log(that.string)
                }
        }
      
        logUpperCase.call({ string: 'es6 rocks' })()

    *ES6*
        var logUpperCase = function() {
            this.string = this.string.toUpperCase()
            return () => console.log(this.string) //rather than remaking the function to call that again, just use arrow and call this!
        }
      
      logUpperCase.call({ string: 'es6 rocks' })()


7) Promises in ES6 //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise)
