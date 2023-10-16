package queues;

public class ArrayQueue {
    int size;
    int[] queue;
    int rear;
    int front;

    public ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];

        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (front == -1 && rear == -1) {
            queue[0] = data;
            front = 0;
            rear = 0;

            return;
        }

        queue[rear + 1] = data;
        rear += 1;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        }

        System.out.println("Dequeued element is: " + queue[front]);
        front += 1;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}
