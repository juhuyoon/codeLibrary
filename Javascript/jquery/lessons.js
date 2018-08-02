//https://medium.com/front-end-hacking/how-to-use-a-javascript-library-jquery-75d0b6d50b5a
//http://blondiebits.herokuapp.com/#/4

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/script.js"></script>

//All we need to do is write the JavaScript so that when we click the button, the message is revealed so we’ll go to our script.js and write a function. To create a function, we will write the keyword function and then the name of the function - here, it’s revealMessage. If we needed to add parameters to the function, then we would put those in between the parentheses, but we don't need to worry about that right now so we won't put anything inside. Then, we can add the body of our function - what it will actually do when revealMessage() is called. Inside our function, we'll access the variable document (aka our HTML document) and then get the element with the id hiddenMessage (our paragraph we created before). Next, we will access this element’s style, in other words it’s CSS, and set its display property to the value 'block'.