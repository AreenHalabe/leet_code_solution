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
        if(head == null) return null;

        ListNode NewHead=null;
        ListNode current =head;

        while(current != null){
            ListNode currentNode = current.next;
            current.next=NewHead;
            NewHead=current;
            current=currentNode;
        }

        return NewHead;




    }
}