package practice.linkedList;

public class RemoveDuplicatesFinalSol {
    public static void main(String[] args) {
        LnkdLstImplementation lnlst = new LnkdLstImplementation();
        lnlst.insert(1);
        lnlst.insert(1);
        lnlst.insert(2);
      //  lnlst.insert(2);
        lnlst.insert(3);
        lnlst.insert(3);
      //  lnlst.insert(4);
        lnlst.insert(5);
     //   lnlst.insert(5);

        Node node = lnlst.head;
      //  Node newNode =new Solution1().deleteDuplicates(node);

        Node newNode = new SolutionWithRecusrion().deleteDuplicates(node);

        while(newNode != null ){
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }
}

class Solution1 {
    public Node deleteDuplicates(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        if(head.data != head.next.data){
            head.next = deleteDuplicates(head.next);
            return head;
        }

        Node tracker = head;
        while(tracker != null && tracker.data == head.data){
            tracker = tracker.next;
        }
        return deleteDuplicates(tracker);
    }
}

class SolutionWithTrav {
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

class SolutionWithRecusrion {
    public Node deleteDuplicates(Node head) {  //  [ 1 1 2 2 3 4 5 5 6 ]

        if(head == null || head.next == null) return head;

            if(head.next != null && head.data == head.next.data){
                while(head.next != null && head.data == head.next.data){
                    head = head.next;
                }
                head = head.next;
                return deleteDuplicates(head);
            }else{
                head.next = deleteDuplicates(head.next);
            }

        return head;
    }
}
