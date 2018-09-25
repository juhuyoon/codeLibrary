'use strict';

module.exports = function(app) {
    var wordList = require("../controllers/controller.js");

    //Routes for the words
    app.route('/words')
       .get(wordList);
       .post(wordList.pull_words);

    app.route("/words/:wordId")
       .get(wordList)
}