//https://scotch.io/tutorials/javascript-promises-for-dummies
var isMomHappy = true;

// Promise
var willIGetNewPhone = new Promise(function(resolve, reject) {
  if (isMomHappy) {
    var phone = {
      brand: "Samsung",
      color: "black"
    };
    resolve(phone);
  } else {
    var reason = new Error("mom is not happy");
    reject(reason);
  }
});

// call our promise
var askMom = function() {
  willIGetNewPhone
    .then(function(fulfilled) {
      // yay, you got a new phone
      console.log(fulfilled);
    })
    .catch(function(error) {
      // ops, mom don't buy it
      console.log(error.message);
    });
};

askMom();
