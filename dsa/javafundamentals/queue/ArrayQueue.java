package queue;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor: Creates an array queue of fixed capacity
    public ArrayQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.makeNull(); // Initialize front = -1, rear = -1
    }

    // MAKENULL(): Resets Queue to an empty state
    public void makeNull() {
        this.front = -1;
        this.rear = -1;
    }

    // EMPTY(): Returns true if Queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Helper: Checks if Circular Queue is full
    public boolean isFull() {
        return (rear == size - 1 && front == 0) || (rear == front - 1);
    }

    // ENQUEUE(x): Inserts element x at the rear
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow: Queue is Full!");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0; // Wrap around to index 0
        } else {
            rear = rear + 1;
        }
        queue[rear] = x;
    }

    // DEQUEUE(): Deletes and returns the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Queue is Empty!");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            // Last remaining element was dequeued
            makeNull();
        } else if (front == size - 1) {
            front = 0; // Wrap around to index 0
        } else {
            front = front + 1;
        }
        return item;
    }

    // FRONT(): Returns the element at the front
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue[front];
    }

    // Display all queue elements in FIFO order
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}