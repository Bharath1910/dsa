package stack;

public class Stack {
    int size;
    public Stack(int size) {
        this.size = size;
    }

    int[] stack = new int[size];

    public void push(int data) {
        this.stack[stack.length - 1] = data;
    }

    public int pop() {
        int data = this.stack[stack.length - 1];
        this.stack[stack.length - 1] = 0;

        return data;
    }

    public int peek() {
        return this.stack[stack.length - 1];
    }

    public void print() {
        for (int j : stack) {
            System.out.println(j);
        }
    }
}