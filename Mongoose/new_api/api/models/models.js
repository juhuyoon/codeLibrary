'use strict';

var mongoose = require("mongoose");
var Schema = mongoose.Schema;

var WOTDSchema = new Schema({
    name: {
        type: String,
        required: "Name of the user"
    },
    different_date: {
        type: Date,
        default: Date.now
    },
    words: {
        type: [{
            type: String,
            enum: ['Music', 'Keys', 'Scotland']
        }],
        default: ['Music']
    } 
});

module.exports = mongoose.model('Words', WOTDSchema);

