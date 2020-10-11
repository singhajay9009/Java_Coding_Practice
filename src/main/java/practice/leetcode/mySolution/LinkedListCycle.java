/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle{
    public boolean hasCycle(ListNode head) {
        if(head == null ) return false;
        
        ListNode firstMover = head;
        ListNode secondMover = head.next;
        
        
        while(firstMover != secondMover){
            
            if(secondMover == null || secondMover.next == null) return false;
            firstMover = firstMover.next;
            secondMover = secondMover.next.next;
            
        }
        return true;
    }
}