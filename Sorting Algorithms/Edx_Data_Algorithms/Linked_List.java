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