package io.github.actar233;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);

        ListNode l = list;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l.next = new ListNode(l2.val);
                l = l.next;
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                l.next = new ListNode(l1.val);
                l = l.next;
                l1 = l1.next;
                continue;
            }
            if (l1.val < l2.val) {
                l.next = new ListNode(l1.val);
                l = l.next;
                l1 = l1.next;
            } else {
                l.next = new ListNode(l2.val);
                l = l.next;
                l2 = l2.next;
            }
        }

        return list.next;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}