var mysql = require("mysql");

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
  console.log("connected as id " + connection.threadId);
  connection.end();
});
