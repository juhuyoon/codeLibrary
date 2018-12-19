var mongoose = require("mongoose");

// Save a reference to the Schema constructor
var Schema = mongoose.Schema;

// Using the Schema constructor, create a new UserSchema object
// This is similar to a Sequelize model
var UserSchema = new Schema({
   username: {
     type: String,
     trim: true,
     required: "Username is required"
   }, 
   password: {
    type: String,
    trim: true,
    required: "Password is Required",
    validate: [
      function(input) {
        return input.length >= 6;
      }, 
      "Password should be longer."
    ]
   },
   email: {
     type: String,
     unique: true,
     match:[/.+\@.+\..+/, "Please enter a valid e-mail address"]
   }, 
   date: {
     type: Date,
     default: Date.now
   }
});

// This creates our model from the above schema, using mongoose's model method
var User = mongoose.model("User", UserSchema);

// Export the User model
module.exports = User;
