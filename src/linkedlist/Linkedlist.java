package linkedlist;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        this.size = 0;
    }
    

    class Node{

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
