package practice.leetcode.mySolution;


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
    public ListNode deleteDuplicates(ListNode head) {

      if(head == null || head.next == null){
            return head;
        }

        if(head.val != head.next.val){
            head.next = deleteDuplicates(head.next);
            return head;
        }

        ListNode tracker = head;
        while(tracker != null && tracker.val == head.val){
            tracker = tracker.next;
        }
        return deleteDuplicates(tracker);
    }
}

class BetterSolution{

    public ListNode deleteDups(ListNode head){

        ListNode node = head;

        while(node != null && node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}