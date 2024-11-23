package linkedlist;

public class Linkedlist {

    private ListNode head;
    private ListNode tail;
    private final int size;

    public Linkedlist() {
        this.size = 0;
    }


    public void removeDuplicateFromSorted(ListNode head) {
        ListNode currentListNode = head;
        while (currentListNode != null && currentListNode.next != null) {
            if (currentListNode.val == currentListNode.next.val) {
                currentListNode.next = currentListNode.next.next;
            } else {
                currentListNode = currentListNode.next;
            }
        }

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
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

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) return true;
        }
        return false;
    }

    public int cycleLength(ListNode head) {
        if (head == null) return 0;
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                int length = 0;
                do {
                    tortoise = tortoise.next;
                    length++;
                } while (tortoise != hare);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {

        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                tortoise = head;
                while (tortoise != hare) {
                    hare = hare.next;
                    tortoise = tortoise.next;
                }
                return hare;
            }
        }
        return null;
    }

    private class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
