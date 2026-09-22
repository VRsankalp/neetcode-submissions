/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode temp2 = null;
        while(cur!=null){
        ListNode temp  = cur.next;
        cur.next = temp2;
        temp2 = cur ;
        cur = temp ; 

        }
        return temp2;
    }
}
