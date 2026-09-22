class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head;

        if (l1.val <= l2.val) {
            head = l1;
        } else {
            head = l2;
        }

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode prev = null;

        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {

                ListNode tn1 = temp1.next;

                if (prev != null)
                    prev.next = temp1;

                prev = temp1;
                temp1 = tn1;

            } else {

                ListNode tn2 = temp2.next;

                if (prev != null)
                    prev.next = temp2;

                prev = temp2;
                temp2 = tn2;
            }
        }

        if (temp1 != null)
            prev.next = temp1;
        else
            prev.next = temp2;

        return head;
    }
}