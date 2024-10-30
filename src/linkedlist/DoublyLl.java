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

    public void insertLast(int val){
        Node node = new Node(val);

        node.next = null;

        if(head == null){
            node.previous = null;
            head = node;
            return;
        }

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        node.previous = tail;
        tail.next = node;
    }

    public Node findNode(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }

        return null;
    }
    public void insertAfterNode(int val,int nodeBefore){
        Node prevNode = findNode(nodeBefore);

        if(prevNode == null){
            System.out.print("Doesn't exist");
            return;
        }

        Node node = new Node(val);

        node.next = prevNode.next;
        node.previous = prevNode;
        prevNode.next = node;
        if(node.next != null){
            node.next.previous = node;
        }

    }

    public void display(){
        Node node = head;
        Node tail = node;
        while(node != null){
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }
        System.out.println("null");

        while (tail != null) {
            System.out.print(tail.val + " <- ");
            tail = tail.previous;
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
