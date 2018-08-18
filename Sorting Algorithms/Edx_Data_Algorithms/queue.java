//Queues

//Organize the data where you can control how it goes in and out. 
// Special Type of LinkedList.
//(FIFO)First In, First Out

//Like a stack, queue does not support removal of element in the middle, and only supports deletion from the head and insertion at the end of the queue. 

//Queue supports three main operators:
//enqueue, dequeue, and peek
//Enqueue : adds an element to the end of the queue
//Dequeue: removes the first element in the queue
//Peek: returns the first element without removing it. 
//Poll: removes the first element in the queue

//In Java, it is customary to use a LinkedList to represent a queue. 
// However, we make the interface Queue, so only queue operations could be called on it.

Queue queue = new LinkedList();
	queue.add(2); // [2]
	queue.add(4); // [2,4]
	System.out.println(queue.peek()); // prints 2
	queue.add(5); // [2,4,5]
	queue.poll();
    System.out.println(queue); // prints [4,5]
    


//Which one of the following could not be used to implement a FIFO(First-in, First-out) data structure?
    //LinkedList, Stack, Queue

    //Result: Queue

//If you were to build you own online video player, but you want your costumer to be able to start playing the video before its %100 downloaded. You will probably need to download the video as frames, what data structure would be the best choice to store these frames before you start displaying them to your consumer?
    //Stack , Queue

    //Result: Queue