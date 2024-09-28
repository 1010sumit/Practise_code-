package org.example.queue;

 class circular_Queue {
    static final int SIZE = 5; // Maximum size of the queue
    protected int[] a;
    int front = 0;
    int rear = 0;
    private int size = 0;

    public circular_Queue() {
        this.a = new int[SIZE]; // Initialize array with the correct size
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == SIZE;
    }

    public boolean add(int val) {
        if (isFull()) {
            return false;
        }
        a[rear] = val;        // Add element to the queue
        rear = (rear + 1) % SIZE; // Move rear forward, wrap around if necessary
        size++;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int remove = a[front]; // Get the element at the front
        front = (front + 1) % SIZE; // Move front forward, wrap around if necessary
        size--;
        return remove;
    }

    public int getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return a[front];
    }

    public int getRear() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        // Return the last added element, not the next available slot
        return a[(rear - 1 + SIZE) % SIZE];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print(a[i] + " <- ");
            i = (i + 1) % SIZE; // Wrap around the index
            count++;
        }
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        circular_Queue c = new circular_Queue();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.display(); // Should print: 1 <- 2 <- 3 <- 4 <- 5 <- End

        c.pop();     // Removes 1
        c.display(); // Should print: 2 <- 3 <- 4 <- 5 <- End

        c.add(6);    // Add element after wrapping around
        c.display(); // Should print: 2 <- 3 <- 4 <- 5 <- 6 <- End
        c.pop();
        c.pop();
        c.display();
    }
}
