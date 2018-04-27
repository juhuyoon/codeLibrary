//Event Capture, Propagation, Bubbling, and Once
const divs = document.querySelectorAll('div');
const button = document.querySelector('button')

function logText(e) {
    console.log(this.classList.value);
    e.stopPropagation(); //this will stop bubbling via propagation. 
}
//bubbling = where the browser figures out what you clicked on, but also notes the higher hierarchy elements as well. 
document.body.addEventListener('click', logText) //click the middle box and you'll see it also clicks the body's class. 

//what browsers do = capture, where the browser goes from top down, and stores what element was clicked. 
//then the clicks trigger the events and bubbles up, rising up through the hierarchy. 

divs.forEach(div => div.addEventListener('click', logText, {
    //capture is naturally false by default to allow normal bubbling.
    //capture : false;
    capture: true, //now the bubbling will occur from top => bottom rather than bottom => top, so only the single element clicked will be logged. 
//if you use capture = true and stop propagation, wherever you click, it'll return one because capture makes it go down, and stop propgation prevents it from going down more. 

    //listens for a click, then unbinds itself so no more future clicks. 
    once: true 
}));
    //once is the same as: 
        //div.removeEventListener('click', logText)

button.addEventListener('click', () => {
    console.log('clicked');
}, {
    once: true
}); //the button will only run once!
