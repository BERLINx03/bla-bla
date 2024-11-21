package linkedlist;

public class Linkedlist {

    private Node head;
    private Node tail;
    private final int size;

    public Linkedlist(){
        this.size = 0;
    }


    public void removeDuplicateFromSorted(Node head){
        Node currentNode = head;
        while(currentNode != null && currentNode.next != null){
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }else {
                currentNode = currentNode.next;
            }
        }

    }


    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node dummy = new Node();
        Node current = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1 == null ? list2 : list1;

        return dummy.next;

    }

    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node tortoise = head;
        Node hare = head;
        while(hare.next != null && hare.next.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare) return true;
        }
        return false;
    }


    private class Node{

        int val;
        Node next;

        Node(){}
        Node(int val){
            this.val = val;
        }

        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
