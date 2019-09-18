package Easy;

public class MergetwoSortedList {
//    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
//        if(l1 == null && l2 == null) {
//            return null;
//        }
//        //just to give the starter ListNode some value to work with.
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//        while(l1 != null || l2 != null) { //when it's not zero.
//            //if l1 is empty OR
//            // l2 is not null AND the value of l1 > value of l2 (way node trees work)
//            if((l1 == null) || l2 != null && l1.val >= l2.val) {
//                //into the current Node, add on the value of l2 to the current Node Tree.
//                current = moveToNext(current, l2);
//                l2 = l2.next;
//            } else {
//                //if it's the other way around, where l2 is null...
//                current = moveToNext(current, l1);
//                l1 = l1.next;
//            }
//        }
//        return dummy.next;
//    }
//
//    private ListNode moveToNext(ListNode current, ListNode p) {
//        //this will make a new ListNode that contains the second ListNode's value.
//        ListNode n = new ListNode(p.val);
//        //You put that into the first ListNode 'current''s next part of the tree
//        current.next = n;
//        //return that ListNode
//        return n;
//    }

    /*
        @ Doing with a shorter recursion base.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        if(l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
     }
}
