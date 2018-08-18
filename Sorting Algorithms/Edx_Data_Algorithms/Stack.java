//Stacks

//Simple data structure that can be used to store data in a certain way. It is a special kind of LinkedList.
//Imagine it's like a container:
    //with only one input and using push command, put the data inside.
    //E.G.: push text_string_one, push text_string_two, etc
    //Stack has a certain size that can also be resized. 
    //pop command is to take the last data that was inputted. 
    //(LIFO) Last In, First Out

// A good way to picture a stack is to imagine a stack of trays in a restaurant.
// We have "access" to the top of the stack and can pick up a tray(an element)
// from the top easily, but we can't do so at the bottom.


//So what kind of application suits this kind of reverse order of data?
//E.G. : Typing a Microsoft Word document.
//Going back with Undo (control Z) would go backwards with the very last command typed the first to disappear. 

// You may observe that it seems stack just supports a subset of operations that a linkedlist supports, so why couldn't we just use a linkedlist and only call for operations that a stack also supports?
// Generally, there are two answers.
    // First, it is correct to observe that we could use a LinkedList class in Java as stack;
    // however, this class is not designed to be used as stack, so it is not optimized for the sake of fast access of the top element. 
        
    //Second, suppose you use a linkedlist to implement a stack, and some anonymous hacker figured that out.
    // Then, he could try to corrupt your data by calling linkedlist operation such as remove that stack does not support to mess with your data.
    // However, if we use a class that only supports stack operations, then a hacker could not do something like that.

//Three important stack operations: push, pop, peek 
    //push = pushes a new element to the top of the stack
    //pop = removes and returns the top element from the stack
    //peek = returns the top element without removing it from stack. 
	// create a new stack
	Stack stack = new Stack();
	stack.push(new Integer(3)); // [3]
	stack.push(new Integer(5)); // [3,5]
	System.out.println(stack.peek()); // prints 5
	stack.push(new Integer(6)); // [3,5,6]
	int x = stack.pop();
	System.out.println(x); // prints 6
    System.out.println(stack); // prints [3,5]
    
//A stack is fairly easy to use and understand in Java. Note that push() takes an object, so we must convert an integer primitive to an integer object before we pass it in.

//Which of the following data structures does not support dynamic memory allocation?
    //Stack, LinkedList, Array
    //Answer: Array

//Consider the Following Code:
   Stack stack = new Stack();
 stack.push(new Integer(11));
 stack.push(new Integer(13));
 stack.push(new Integer(2));
 stack.peek();
 System.out.println(stack);
 stack.pop();
   System.out.println(stack);

   //What should the first System.out.println output:
    //Result: [11,13,2]

    //What should the second System.out.println output:
    //Result: [11,13]