// Require mongoose
var mongoose = require("mongoose");

// Get a reference to the mongoose Schema constructor
var Schema = mongoose.Schema;

// Using the Schema constructor, create a new ExampleSchema object
// This is similar to a Sequelize model
var ExampleSchema = new Schema({
  // `string` must be of type String. We "trim" it to remove any trailing white space
  // `string` is a required field, and a custom error message is thrown if it is not supplied
  string: {
    type: String,
    trim: true,
    required: "String is Required"
  },
  // `number` is of type Number
  // `number` must be unique
  // `number` is required. The default mongoose error message is thrown if it is not supplied
  number: {
    type: Number,
    unique: true,
    required: true
  },
  // `email` is of type String
  // `email` must match the regex pattern below and throws a custom error message if it does not
  // You can read more about RegEx Patterns here https://www.regexbuddy.com/regex.html
  email: {
    type: String,
    match: [/.+@.+\..+/, "Please enter a valid e-mail address"]
  },
  // `boolean` must be of type Boolean
  boolean: Boolean,
  // `array` must be an Array
  array: Array,
  // `date` must be of type Date. The default value is the current date
  date: {
    type: Date,
    default: Date.now
  },
  // `longstring` must be of type String
  // `longstring` uses a custom validation function to only accept values 6 characters or more
  // A custom error message is thrown if the validation fails
  longstring: {
    type: String,
    validate: [
      // Function takes in the new `longstring` value to be saved as an argument
      function(input) {
        // If this returns true, proceed. If not, return the error message below
        return input.length >= 6;
      },
      // Error Message
      "Longstring should be longer."
    ]
  }
});

// This creates our model from the above schema, using mongoose's model method
var Example = mongoose.model("Example", ExampleSchema);

// Export the Example model
module.exports = Example;
