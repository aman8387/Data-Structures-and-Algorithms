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
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        int n =0;
        while(p1 != null){
            n++;
            p1 = p1.next;
        }
        int mid = n/2;
        p1 = head;

        for(int i = 0; i<mid; i++){
            p1 = p1.next;
        }return p1;
    }
}