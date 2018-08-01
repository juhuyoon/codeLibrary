# Great resources for CSS grids!

https://medium.com/@js_tut/the-complete-css-flex-box-tutorial-d17971950bdc
https://medium.com/@js_tut/css-grid-tutorial-filling-in-the-gaps-c596c9534611

#Flex   
Flex is a set of rules for automatically stretching multiple columns and rows of content across parent container.

## display:flex   
Unlike many other CSS properties, in Flex you have a main container and items nested within it. Some CSS flex properties are used only on the parent. Others only on the items.   
Think of flex element as a parent container with display:flex.   
Elements placed inside this container are items and each container has a flex-start & flex-end.

## Main-axis and Cross-axis   
While the list of items is provided in a linear way, Flex requires you to be
mindful of rows and columns. For this reason, it has two coordinate axis. The
horizontal axis is referred to as Main-Axis and the vertical is the Cross-Axis.

To control the behavior of content’s width and gaps between that stretch
horizontally across the Main-Axis you will use justify properties. To control
vertical behavior of items you will use align properties.

If you have 3 columns and 6 items, a second row will be automatically created
by Flex to accommodate for the remaining items.

If you have more than 6 items listed, even more rows will be created.

## Direction   
flex-direction: row-reverse (changes direction of item list flow from right to left.)   
flex-wrap: wrap (determines how items are wrapped when parent containers run out of space.)   
flex-flow: flex-direction<value> flex-wrap<value> (short hand for flex-direction and flex-wrap in both allowing for specification of both items.)
flex-flow: row wrap (flex-direction to be row and flex-wrap to be wrap)   
flex-direction: column & column-reverse
flex-direction: row; {justify-content: flex-start | flex-end| center | space-between| space-around| stretch| space-evenly}

##Flex-specification   
Used to pack flex lines. Spacing is evenly distributed. 
align-items: controls alignment of items horizontally relative to the parent container. 

##Flex-basis   
works similar to min-width of CSS property, expands item's size based on inner content. 

##Flex-grow   
when applied, will scale the item relative to the sum of the size of all other items on the same row.  
It is then adjusted according to the value that was specified. 