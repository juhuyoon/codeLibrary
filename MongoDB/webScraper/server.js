const cheerio = require('cheerio');
const request = require('request');
const express = require('express');
const mongojs = require('mongojs');
const axios = require('axios');

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
    db.scrapedData.find({}, function(err, data) {
        if(err) {
            console.log(err);
        }
        else{
            res.json(data);
        }
    })
})

app.get("/scrape", function(req, res) {
    axios.get('https://www.news.ycombinator.com').then(function(html) {
        var $ = cheerio.load(html);
    
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


// // Dependencies
// var express = require("express");
// var mongojs = require("mongojs");
// // Require axios and cheerio. This makes the scraping possible
// var axios = require("axios");
// var cheerio = require("cheerio");

// // Initialize Express
// var app = express();

// // Database configuration
// var databaseUrl = "scraper";
// var collections = ["scrapedData"];

// // Hook mongojs configuration to the db variable
// var db = mongojs(databaseUrl, collections);
// db.on("error", function(error) {
//   console.log("Database Error:", error);
// });

// // Main route (simple Hello World Message)
// app.get("/", function(req, res) {
//   res.send("Hello world");
// });

// // TODO: make two more routes

// // Route 1
// // =======
// // This route will retrieve all of the data
// // from the scrapedData collection as a json (this will be populated
// // by the data you scrape using the next route)
// app.get("/all", function(req, res) {
//   db.scrapedData.find({}, function(err, data) {
//     // Log any errors if the server encounters one
//     if (err) {
//       console.log(err);
//     } else {
//       // Otherwise, send the result of this query to the browser
//       res.json(data);
//     }
//   });
// });
// // Route 2
// // =======
// // When you visit this route, the server will
// // scrape data from the site of your choice, and save it to
// // MongoDB.
// // TIP: Think back to how you pushed website data
// // into an empty array in the last class. How do you
// // push it into a MongoDB collection instead?

// // Make a request via axios to grab the HTML body from the site of your choice
// app.get("/scrape", function(req, res) {
//   axios.get("https://www.ruby-lang.org/en/").then(function(html) {
//     //     // Load the HTML into cheerio and save it to a variable
//     //     // '$' becomes a shorthand for cheerio's selector commands, much like jQuery's '$'
//     var $ = cheerio.load(html);
// //HTML
//     //     // An empty array to save the data that we'll scrape
//     var results = [];

//     //     // Select each element in the HTML body from which you want information.
//     //     // NOTE: Cheerio selectors function similarly to jQuery's selectors,
//     //     // but be sure to visit the package's npm page to see how it works
//     $("div").each(function(i, element) {
//       console.log(element);
//       //       //var title = $(element).children().text();
//       var link = $(element)
//         .find("a")
//         .attr("href");

//       //       // Save these results in an object that we'll push into the results array we defined earlier
//       results.push({
//         //         //title: title,
//         link: link
//       });
//       if(link) {
//         db.scrapedData.insert({
//           link: link
//         })
//       }
//     });
 
//     // Log the results once you've looped through each of the elements found with cheerio
//     console.log(results);
//     /* -/-/-/-/-/-/-/-/-/-/-/-/- */
//   });
//   res.send("Scraping...")
// });
// // Listen on port 3000
// app.listen(3000, function() {
//   console.log("App running on port 3000!");
// });