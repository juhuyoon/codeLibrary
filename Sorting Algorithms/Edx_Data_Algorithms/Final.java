//Questions I should remember:

// Imagine you had to program an ATM at a bank. Assuming the ATM has a finite amount of cash to dispense, which operation would be ideal to handle transactions?
    //Result: Stacks/LIFO

//What should print from the given code?
Queue queue = new LinkedList();
queue.add(10);
queue.add(24);
queue.add(42);
queue.add(5);
queue.poll();
queue.poll();
System.out.println(queue);

    //Result: [42,5]

//What should print from the given code?
Stack stack = new Stack();
stack.push(new Integer(1));
stack.push(new Integer(3));
stack.pop();
stack.push(new Integer(2));
System.out.println(stack);

    //Result: [1,2]

//Which two things must each node in a Linked List have at minimum?
    //Data and a pointer to the next node
    //Data and a pointer to the previous node
    //A pointer to the next node and a pointer to the previous node
    //There are no minimum requirements for a node

    //Result: Data and a pointer to the next node

//Imagine you are writing gradebook software to track grades for for classes in school. The number of students changes from class to class. Which data type would be most appropriate?
    //Result: Linked Lists

//True or False: Linked Lists support instant, random access of any index
    //Result: False

//What is the running time for the following code example?
for(int i = 0; i < 5; i++)
{
    for(int j = 0; j < i; j++)
    {
        System.out.printf("#");
    }

    System.out.printf("\n");
}

    //Result: O(N^2)

//Which sorting algorithm works by swapping the next smallest number with an unsorted larger one in order to place it in its correct location?
    //Selection Sort, Bubble Sort, Merge Sort   
    //Result: Selection Sort


//What is the running time for accessing the n^th node of a linked list?
    //Result: O(n)

//Code that calls itself repeatedly until a base condition is met is referred to as:
    //Result: Recursive

//What should the following array look like after 6 steps/loops of Selection Sort?
    int[] lst = [9,3,4,2,8,7,2,3,4];

    //Result:  lst = [2,2,3,3,4,4,8,9,7];

//Consider the following array. How many steps would it take to find the number 9 using Linear Search?
    int[] lst = [20, 39, 84, 76, 12, 9, 38];

    //Result: 6

//What does the array look like after going through the entire array twice using the bubble sort algorithm (not completely sorted)?
    int[] lst = [9,2,3,8,14,7,0,1,2,42,3,4];

    //Result:  lst = [2,3,8,7,0,1,2,9,3,4,14,42];
