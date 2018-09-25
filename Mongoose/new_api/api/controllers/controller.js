var mongoose = require('mongoose');
    Wotd = mongoose.model('Words');

exports.wordList.pull_words = function(req, res) {
    Wotd.find({}, function(err, task) {
        if(err) 
        res.send(err);
        res.json(Wotd);
    });
};