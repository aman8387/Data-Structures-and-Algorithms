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
        ListNode Prev = null;
        ListNode Current = head;

        while(Current!=null){
            ListNode next = Current.next;
            Current.next = Prev;
            Prev = Current;
            Current = next;           
        }
    
    return Prev;
    }
}