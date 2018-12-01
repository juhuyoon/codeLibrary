//2.1
//write code to remove duplicates from an unsorted linked list. 
//How would you solve this problem if a temporary buffer is not allowed?

//In order to remove duplicates, we need to be able to track duplicates. 
//A simple has table can work well. 

void deleteDups(LinkedListNode n) {
    HashSet<Integer> set = new HashSet<Integer>();
    LinkedListNode previous = null;
    while( n != null) {
        if(set.contains(n.data)) {
            previous.next = n.next;
        } else {
            set.add(n.data);
            previous = n;
        }
    }

//The above solution takes O(N) time, where N is the number of elements in the linked list.

//Follow up:
    //How would you solve this problem if a temporary buffer is not allowed?
    //If we dont' have a buffer, can iterate with two pointers: current which iterates through the linked list and runner which checks all subsequent nodes for duplicates.

    void deleteDups(LinkedListNode head) {
        LinkedListNode current = head;
        while(current != null) {
            LinkedListNode runner = current;
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    //runs in O(1) space, but O(N^2) time. 