const cheerio = require('cheerio');
const request = require('request');
const express = require('express');
const mongojs = require('mongojs');

const app = express();

app.use(express.static('public'));

const mydb = 'scraper';
const collections = ['scrapeData'];

var db = mongojs(mydb, collections);

db.on('error', function(error) {
    console.log('Database Error: ', error);
});

app.get('/', function(req, res) {
    res.send(index.html);
})

app.get('/all', function(req, res){
    db.scrapedData.find({}, function(err, found) {
        if(err) {
            console.log(err);
        }
        else{
            res.json(found);
        }
    })
})

app.get("/scrape", function(req, res) {
    request('https://www.news.ycombinator.com', function(response) {
        var $ = cheerio.load(response.data);
    
        var results = [];
    
        $(".title").each(function(i, element) {
            console.log(element);
    
            var link = $(element).children("a").attr('href');
            var title = $(element).children("a").text();
            
            results.push({
                link: link,
                title: title
            })
            if(title && link) {
                db.scrapedData.insert({
                    title: title,
                    link: link
                }, 
                function(err, inserted) {
                    if(err) {
                        console.log(err);
                    } else {
                        console.log(inserted);
                    }
                })
            }
        });
        res.send("Scrape Complete");
    });

    app.listen(3000, function() {
        console.log("App running on port 3000!");
    })
})
