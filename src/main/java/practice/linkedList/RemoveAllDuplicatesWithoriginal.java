/*
package practice.linkedList;

public class RemoveAllDuplicatesWithoriginal {

    public static void main(String[] args) {
        LnkdLstImplementation lnlst = new LnkdLstImplementation();
        lnlst.insert(1);
        lnlst.insert(2);
        lnlst.insert(2);
        lnlst.insert(3);
        lnlst.insert(4);
      //  lnlst.insert(4);
      //  lnlst.insert(5);

        Node node = lnlst.head;
        Node n = new Solution().deleteDuplicates(node);
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }

    }
}

class Solution {
    public Node deleteDuplicates(Node head) {  //  [ 1 1 2 2 3 4 5 5 6 ]

        Node prev = null;
        Node trav = head;

        while(trav != null && trav.next != null){
            if(trav.data != trav.next.data){
                prev = trav;
                trav = trav.next;
            }
            else{
                while(trav.next != null && trav.data == trav.next.data){
                    trav = trav.next;
                }
                trav = trav.next;
                if(prev != null){
                    prev.next = trav;
                }else{
                    head = trav;
                }
            }

        }

        return head;
    }

}





*/
