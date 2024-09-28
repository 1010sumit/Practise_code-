package org.example.stack;

public class Stack_eg {
    protected static final int DEFAULT_SIZE = 5;
    protected int[] a;
    protected int top;

    public Stack_eg() {
        this.a = new int[DEFAULT_SIZE];
        this.top = -1;
    }

    public void push(int val) {
        if (top < DEFAULT_SIZE - 1) {
            a[++top] = val;
        } else {
            System.out.println("Stack is overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return a[top--];
        } else {
            System.out.println("Stack is underflow");
            return -1; // Return a sentinel value or handle appropriately
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_eg stack = new Stack_eg();
        stack.push(22);
        stack.push(44);
        stack.push(12);
        stack.pop(); // Pop the top element (12)
        stack.display(); // Display the stack elements
    }
}
