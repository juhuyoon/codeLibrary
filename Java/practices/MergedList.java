import  java.io.*;
class MergedList {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null) return null;
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            while (l1 != null || l2 != null) {
                if ((l1 == null) || (l2 != null && l1.val >= l2.val)) {
                    cur = moveToNext(cur, l2);
                    l2 = l2.next;
                } else {
                    cur = moveToNext(cur, l1);
                    l1 = l1.next;
                }
            }
            return dummy.next;
        }
        
        private ListNode moveToNext(ListNode cur, ListNode p) {
            ListNode n = new ListNode(p.val);
            cur.next = n;
            return n;
        }
}