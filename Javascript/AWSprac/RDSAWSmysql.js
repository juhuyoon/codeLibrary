//mysql -h YOUR_AWS_RDS_ENDPOINT -u YOUR_AWS_RDS_USERNAME -p

var mysql = require("mysql");
var inquirer = require('inquirer');

var connection = mysql.createConnection({
  host: "gtcbctests.ci6q46uohc9p.us-east-1.rds.amazonaws.com",

  // Your port; if not 3306
  port: 3306,

  // Your username
  user: "jung",

  // Your password
  password: "", //mypassword
  database: "greatBay_db"
});

connection.connect(function(err) {
  if (err) throw err;
  //console.log("connected as id " + connection.threadId);
  start();
});

function start() {
  inquirer
    .prompt({
      name: 'postOrBid',
      type: 'list',
      message: 'Would you like to [POST] or [BID] on the auction?',
      choices: ['POST', 'BID', 'EXIT']
    })
    .then(function(answer) {
      if(answer.postOrBid === 'POST') {
        postAuction();
      } else if(answer.postOrBid === 'BID') {
        bidAuction();
      } else {
        connection.end();
      }
    })
}

function postAuction() {
  inquirer
    .prompt([
      {
       name: 'item',
       type: 'input',
       message: 'What item do you want to submit?' 
      }, 
      {
        name: 'category', 
        type: 'input',
        message: 'what category do you want to place your item in?'
      },
      {
        name: 'startingBid', 
        type: 'input',
        message: 'What do you want your starting bid to be?',
        validate: function(value) {
          if(isNaN(value) === false) {
            return true;
          }
          return false;
        }
      }
    ])
    .then(function(answer) {
      connection.query(
        'INSERT INTO auctions SET ?',
        {
          item_name: answer.item,
          category: answer.category,
          starting_bid: answer.startingBid || 0,
          highest_bid: answer.startingBid || 0
        },
        function(err) {
          if(err) throw err;
          console.log('Your post was successful!');
          start(); //recursion
        }
      )
    })
}

function bidAuction() {
  connection.query('SELECT * FROM auctions', function(err, results) {
        if(err) throw err;

    inquirer
    .prompt ([
      {
        name: 'choice',
        type: 'rawlist', 
        choices: function() {
          let choiceArray = [];
          for(let i = 0; i < results.length; i++) {
            choiceArray.push(results[i].item_name);
          }
          return choiceArray;
        },
        message: 'What auction would you like to place a bid in?'
      },
      {
        name: 'bid',
        type: 'input',
        message: 'How much would you like to bid?'
      }
    ])
    .then(function(answer){
      let chosenItem;
      for(let i = 0; i < results.length; i++) {
        if(results[i].item_name === answers.choice) {
          chosenItem = results[i];
        }
      }

      if(chosenItem.highest_bid < parseInt(answer.bid)) {
        connection.query(
          'UPDATE auctions SET ? WHERE ?',
          [
            {
              highest_bid: answer.bid
            },
            {
              id: chosenItem.id
            }
          ],
          function(error) {
            if(error) throw error;
            console.log('Bid placed successfully!');
            start();
          }
        )
      }
      else {
        console.log('Bid was too low! Try again.');
        start();
      }
    })
  } )
}