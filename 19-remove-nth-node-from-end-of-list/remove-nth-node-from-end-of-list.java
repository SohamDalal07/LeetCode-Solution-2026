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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        if(head == null)
        {
            return null;
        }
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        if(n == size)
        {
            return head.next;
        }
        int dfspv = size - n; //distance form start of previous node
        ListNode prev = head;
        for(int i = 1; i < dfspv; i++)
        {
            prev= prev.next;
        }
        prev.next = prev.next.next;
        return head;    
    }
}