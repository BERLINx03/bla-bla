package linkedlist;

public class App {
    public static void main(String[] args) {
    
        DoublyLl list = new DoublyLl();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(100);
        list.insertAfterNode(55, 4);
        list.display();
    }
}