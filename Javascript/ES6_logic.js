/////////ES6 LOGICS YOU SHOULD KNOW!!! https://webapplog.com/es6///////
//https://www.plusfeeds.com/javascript-for-beginners-cheat-sheet/

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
        //implemented with Promise as a Reserved Word
        *ES5*
            setTimeout(function(){
                console.log("Yay!");  
            },1000);

        *ES6*
            const wait1000 =  new Promise(function(resolve, reject) {
                setTimeout(resolve, 1000)
            }).then(function() {
                console.log('Yay!')
            });

            //or with the arrow function
            

            var wait1000 =  new Promise((resolve, reject)=> {
                setTimeout(resolve, 1000)
            }).then(()=> {
                console.log('Yay!')
            });
//if you need to know WHY promises are good: (http://jamesknelson.com/grokking-es6-promises-the-four-functions-you-need-to-avoid-callback-hell)


8a) Block-Scoped Constructs (Let) //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/block)
        
        *ES5*
                function calculateTotalAmount (vip) {
                    var amount = 0
                    if (vip) {
                     var amount = 1
                    }
                    { // more crazy blocks!
                    var amount = 100
                    {
                        var amount = 1000
                        }
                    }  
                    return amount
                }
              
                console.log(calculateTotalAmount(true))

        *ES6 with Let*
            function calculateTotalAmount (vip) {
                var amount = 0 // probably should also be let, but you can mix var and let
                if (vip) {
                let amount = 1 // first amount is still 0
                } 
                { // more crazy blocks!
                    let amount = 100 // first amount is still 0
                    {
                    let amount = 1000 // first amount is still 0
                    }
                }  
                return amount
            }
          
            console.log(calculateTotalAmount(true))
            //'let' allows you to make changes to variable words throughout your code, making scoping easier
        
        *ES6 with Const*
            function calculateTotalAmount (vip) {
                const amount = 0  
                if (vip) {
                  const amount = 1 
                } 
                { // more crazy blocks!
                  const amount = 100 
                  {
                    const amount = 1000
                    }
                }  
                return amount
              }
              
              console.log(calculateTotalAmount(true))
              //'const' does not allow you to change the variable ever! It will stay immutable unless you have different block scopes. 
        

9) Classes //(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes)
            //Objects inherited from objects

        *ES6*
        class baseModel {
            constructor(options = {}, data = []) { // class constructor
              this.name = 'Base'
              this.url = 'http://azat.co/api'
              this.data = data
              this.options = options
            }
          
              getName() { // class method
                console.log(`Class name: ${this.name}`)
              }
          }
          //sets up a class in the beginning where the objects are now stored in one object. 

          class AccountModel extends baseModel {
            constructor(options, data) {
         //Accountmodel now inherits the basemodel 
            super({private: true}, ['32113123123', '524214691']) //call the parent method with super
                this.name = 'Account Model'
                this.url +='/accounts/'
            } //use super() to evoke the parameters of the parent constructor (baseModel)

        //Now to call..
            let accounts = new AccountModel(5)
                accounts.getName()
                console.log('Data is %s', accounts.accountsData)

        //Output : Class name: Account Model
                // Data is %s 32113123123,524214691


10) Modules in ES6 //(https://developer.mozilla.org/en-US/docs/Mozilla/JavaScript_code_modules/Using)
                    
        //if we had to this export as a setup...
                    module.exports = {
                        port: 3000,
                        getAccounts: function() {
                        }
                      }
                      

        *ES5*
            var service = require('module.js')
            console.log(service.port) // 3000
            //how we would have to import to module.js.

        *ES6*
            export var port = 3000
            export function getAccounts(url) {
            }
            //we would set up our module.js file as above...

            import {port, getAccounts} from 'module'
            console.log(port) // 3000
            //then we would import using {} to access the export 'port' and 'getAccounts'

            import * as service from 'module'
            console.log(service.port) // 3000
            //the star would be the default to import everything within that module.js