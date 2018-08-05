//https://medium.com/front-end-hacking/how-to-use-a-javascript-library-jquery-75d0b6d50b5a
//http://blondiebits.herokuapp.com/#/4
//https://medium.com/@jaeger.rob/jquery-selectors-the-absolute-basics-d781500c722c
//http://learn.jquery.com/using-jquery-core/selecting-elements/


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/script.js"></script>

//Transitioning to jQuery
//Now for the jQuery. Here is that same HTML snippet again.

<h1>Hello jQuery!</h1>
<p class="intro-content">Let's use some selectors.</p>
//Let’s get the heading element using jQuery. Here we can look at vanilla JavaScript and jQuery together.

// Vanilla JavaScript
document.querySelector("h1");
// jQuery
$("h1");


//These two pieces of code have the same purpose! They look in the document for an h1 element and grab that element. Virtually the only difference is the dollar sign ($).
//Here is the matching class selector for jQuery:

// Vanilla JavaScript
document.querySelector(".intro-content");
// jQuery
$(".intro-content");
//Again, really the only difference is the $. The CSS selector (in the quotes) is the same between vanilla JavaScript and jQuery!
//The JavaScript Element object does not know what .text() means. It only knows what innerText means.
//The moral of the story: when using jQuery, use only jQuery methods to manipulate jQuery objects.

