package linked_list;

public class LinkedList {

    private Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);

        if (head == null || position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.next;
            }

            newNode.next = current;
            previous.next = newNode;
        }
    }

    public void delete(int data) {
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            // Element not found in the linked list.
            return;
        }

        if (previous == null) {
            // Element is the head of the linked list.
            head = head.next;
        } else {
            previous.next = current.next;
        }
    }

    public boolean search(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void traverse() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void display() {
        System.out.println("Linked list: ");
        traverse();
    }
}

