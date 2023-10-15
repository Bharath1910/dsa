import stack.Stack;
import linked_list.LinkedList;
import linked_list.DoublyLinkedList;
import queues.LinkedListQueue;

public class Main {
    static void implementStack() {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.print();
    }

    static void implementLinkedList() {
        LinkedList list = new LinkedList();

        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 1);

        list.display();
    }

    static void implementDoublyLinkedList() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);

        list.display();

        list.delete(2);

        list.display();

        System.out.println("Is element 3 present in the doubly linked list? " + list.search(3));
    }

    static void implementLinkedListQueue() {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.display();
        System.out.println("--------------------");

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.display();
        System.out.println("--------------------");

        queue.enqueue(5);
        queue.enqueue(6);

        queue.display();
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
//        Main.implementStack();
//        Main.implementLinkedList();
//        Main.implementDoublyLinkedList();
        Main.implementLinkedListQueue();
    }
}