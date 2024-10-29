package linkedlist;

public class DoublyLl {

    //reference var : by default refers to null
    Node head;
    int size;

    public DoublyLl() {
        this.size = 0;
    }
    

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        //? what if head is null?
        //! need if statement to check the NullPointerException
        if(head != null){
            head.previous = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    private class Node{

        int val;
        Node next;
        Node previous;

        //! alt+insert for constructors
        
        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }

        
    }
}
