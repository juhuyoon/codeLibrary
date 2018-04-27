HTML5
One good tip for writing good HTML is to write it first with only it in mind, instead of thinking where you'll put the css and styles.

Just because it's semantically sound, doesn't mean it cant be improved upon: Even though you may have all the tags and class names you need for the page to run, adding some extra tags to help fellow coders understand your work goes a long way.

When adding a picture in your page, you can add a figure tag in order to display a message underneath the pic.
IE: Usually the picture would look like this 
<!-- <img src="path/to/image" alt="About image" />
<p>Image of Mars. </p> -->
but now, with HTML5 it looks like this
<!-- <figure>
    <img src="path/to/image" alt="About image" />
    <figcaption>
        <p>This is an image of something interesting. </p>
    </figcaption>
</figure> -->

The small tag can be used to print small text like copyright or trademark messages.
IE: <small>copyright Marsalis Sanders</small> would result in my name appearing in small text like that at the bottom of a professional page.

Unlike XHTML, HTML5 does not require qoutes for attributes in oreder to function properly. And while this is true, you may still use quotes without negative reprecussions if that makes you feel better.
IE: colorRed="true" could be written as coloRed= true

Piggybacking off the last point, newer browsers accept an HTML attribute called contenteditable. Contenteditable allows the user to edit any of the text contained within the element, including its children.
IE: 
<!-- <!DOCTYPE html>
 
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>untitled</title>
</head>
<body>
    <h2> To-Do List </h2>
     <ul contenteditable="true">
        <li> Break mechanical cab driver. </li>
        <li> Drive to abandoned factory
        <li> Watch video of self </li>
     </ul>
</body>
</html> -->
the lines in the To-Do list can be/should be able to be edited in the page, making it more user friendly.

Just as the contenteditable attribute integrates editiable text into the page, the "email" type allows the imput of email while checking to make sure the email provided is valid.
IE:
<!-- <!DOCTYPE html>
 
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>untitled</title>
</head>
<body>
    <form action="" method="get">
        <label for="email">Email:</label>
        <input id="email" name="email" type="email" />
 
        <button type="submit"> Submit Form </button>
    </form>
</body>
</html> -->
if you were to put aasdfgh.com, the page would reject your imput, as that is not a correct email address.

You can now use placeholders to put in temporary info in code.
IE:
<!-- <input name="email" type="email" placeholder="doug@givethesepeopleair.com" /> -->

Classes in HTML can be reused multiple times so if you think you can reuse some generic code, use a class instead of an ID

Css:
Secondary backround colors: Sometimes, it may benifit you to add a secondary backround color to your webpage in order to ensure it is always readable, even if something like a missing script messes up your page. 
IE:
When dealing with multiple or large images you can use some css magic to keep clients occupied until the pages load.
1.Open the image in Photoshop
2.Filter » Blur » Average
3.Use the Eyedropper to sample the block of colour that is left
4.Apply that colour as a background-color:
These steps will allow you to create a blurred out picture that is a replica of the origianl but loads faster in order to make the page look more complete even if it takes time to load. 
5.And as alternatives to photsoshop, Louis Bourque has a Color Extractor tool which will give you back the relevant gradient 
Ben Briggs built postcss-resemble-image which Provides a gradient fallback for an image that loosely resembles the original.




Sources:

https://code.tutsplus.com/tutorials/28-html5-features-tips-and-techniques-you-must-know--net-13520 
https://webdesignfromscratch.com/html-css/write-better-semantic-html/
https://css-tricks.com/css-basics-using-fallback-colors/
https://csswizardry.com/2016/10/improving-perceived-performance-with-multiple-background-images/