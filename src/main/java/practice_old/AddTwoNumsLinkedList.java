package leetcode.mySolution;


  // Definition for singly-linked list.

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class AddTwoNumsLinkedList {

      public ListNode addTwoNumbers(ListNode l1, ListNode l2){

          ListNode sumHead = new ListNode(0);

          ListNode node = sumHead;
          int digitList1=0, digitList2=0, digitFinalList=0, carry=0, sum = 0;

          while(l1 != null || l2 != null){

              digitList1 = (l1 != null) ? l1.val : 0;
              digitList2 = (l2 != null) ? l2.val : 0;

              sum = digitList1 + digitList2 + carry;

              digitFinalList = sum%10;


              carry = sum /10;

              ListNode l3 = new ListNode(digitFinalList);

              node.next = l3;
              node = node.next;

              if(l1 != null) l1 = l1.next;
              if(l2 != null) l2 = l2.next;

          }

          if ( carry != 0){
              ListNode lTemp = new ListNode(carry);
              node.next = lTemp;
              node = node.next;
          }
          return sumHead.next;
      }

    public static void main(String[] args) {
        AddTwoNumsLinkedList addTwoNumsLinkedList = new AddTwoNumsLinkedList();

        ListNode l1;

        l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);


        ListNode l2;

        l2 = new ListNode(3);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode l3 = addTwoNumsLinkedList.addTwoNumbers(l1, l2);

        while(l3 != null){
            System.out.println("print l3: " + l3.val);
            l3 = l3.next;
        }

    }
}
