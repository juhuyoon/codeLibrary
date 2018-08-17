//Linked List

//Arrays VS. Linked List

//Arrays are considered data structures. 
//Defining an array with a certain size allows for the computer to allocate and reserve memory spaces with the size requested. Thus, it makes storage easy & fast.

//If N = 1,000,000, the computer will reserve 1,000,000 spaces next ot each others in memory.
//If first space is at address 300, then it will be until 1,000,300
//So if you want location 500,00 in array, then the computer adds 500,000 + 300, then the address is 500,300. 
//This is only two steps, Big O(2) = constant time & almost immediate.

//Advantages of arrays: Simple to implement and immediate random access
//Disadvantages of arrays: Must define the size of an array ahead of time and can't directly add/delete/resize the array without creating a new array & copy elements to it. 
//Copying an array with N elements = Big O(N). 

//Linked Lists are used to avoid these disadvantages. 
//Consists of multiple nodes.
//Node has two parts:
//One is data and the other is pointer/reference.
//The address is used via the pointer and then and the data within the node is accessed by referencing the pointer. 
//Only way to access the nodes are via addresses by traversing through the linked list. 
//Must access the First Node always (called First). DOES NOT HAVE A RANDOM ACCESS

//Adding a new node?
    //Just add it at the end of the linked list and then reference via pointer and then to the whole of the node. 
    //Adding a new node at the beginning will have the pointer point to the second node and the First Node will no longer reference the previous node but to the new first node. 
    //Must be careful to not lose the other addresses before you overwrite the first node.
    //If it's between middle of the nodes, (putting a 16 between a 15 and a 19 for example)
        //Copy the pointer of 15 towards 19 to the pointer of the 16
        //Then copy the pointer of the 15 and point of to the 16 node. 

//Deleting a node at the end?
    //if you want to delete a node,
    //store it in a temporary reference (after traversing throuh ght list) 
    //Save the address 
    //Save the addresses of the previous node as well

//Deleting a node in the middle
    //Same step as above, but store more temporary references of before and after


//Example: 
// uppose we want to store the age of of all customers at Microsoft on a certain day. What data structure should we use?

//Instead of using an array, where if there's more than a specific number of customers, there would be a problem.
//Unlike an array, the linked list can have a series of elements linked together by pointers and dynamically allocate more space to the linked list. 

	// create a new linked list
	LinkedList<Integer> lst = new LinkedList<Integer>();
	
	// add elements
	lst.add(15); // [15]
	lst.add(19); // [15,19]
	lst.add(21);	// [15,19,21]
	lst.addFirst(13); // [13,15,19,21]
	lst.addLast(24); // [13,15,19,21,24]
	System.out.println(lst);
	
	// remove elements
	lst.removeFirst(); // [15,19,21,24]
	lst.removeLast(); // [15,19,21]
	lst.remove(19); // [15,21]
    System.out.println(lst);
    
    //As shown in the code, we can add and remove elements freely in a linked list. That we can change its size as we go is also why we call it a dynamic data structure. A linked list keeps a pointer to its head and its tail. That is, we can access its head and tail elements in constant time. Because of this, addFirst, addLast, removeFirst, removeLast are all constant time operations. However, removing an element from the middle of the linkedlist takes O(n) time. This is because we don't have access to the elements in the middle. To gain access to it, we must start at the head or the tail element, and follow the pointers until we find the element desired.

    //Recall that in an array, if we wished to access the 3rd element, we just do lst[3]. But in a linked list, we only have access to the head and the tail pointer, so to access any element in between, we must manually traverse through the list.

    //Now it's a good time to discuss the tradeoffs among varioud data structures. As we see, linked list is great when you do not know how many elements you want to store beforehand, and you don't try to access a particular element too many times. But it's not the best data structure if we wish to have fast access to every element in it. Array is almost the opposite. It is perfect if we mostly want to have fast access to elements and know the size of data we need to store beforehand. In real life coding situation, we often consider the various tradeoffs among data structures to make the best choice that suits our goal.

    //Consider the folowing linked list: 
    LinkedList lst = new LinkedList();
		lst.add(3);
		lst.removeFirst();
		lst.add(5);
		lst.add(7);
		lst.addFirst(2);
		lst.removeLast();
        System.out.println(lst);
        
    //What would the last statement print out?
    //Result: [2,5]

    // Suppose we want to keep track of the numbers of customers in a store and know for certain that the number will not exceed 100. In addition, we want fast access to every customer. Which data structure is more ideal?

    //Result: Array