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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null)return list1;

        ListNode Head = new ListNode(0);
        ListNode currentHead = Head;

        ListNode current1 = list1;
        ListNode current2 = list2;

        while(current1 !=null && current2!=null){
            if (current1.val <= current2.val) {
                currentHead.next = current1;
                current1 = current1.next;
            } else {
                currentHead.next = current2;
                current2 = current2.next;
            }
            currentHead = currentHead.next;
        }


        if (current1 != null) {
            currentHead.next = current1;
        } else {
            currentHead.next = current2;
        }

        return Head.next;

        
    }
}