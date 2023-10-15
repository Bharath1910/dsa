package queues;

public class LinkedListQueue {
    Node head;
    Node tail;

    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (head.next == null) {
            tail = newNode;
            head.next = tail;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        int data = head.data;
        head = head.next;

        return data;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
