package queue;

public class LinkedListQueue {
    private Node front;
    private Node rear;

    // Constructor: Initializes empty linked list queue
    public LinkedListQueue() {
        this.makeNull(); // Initialize front = null, rear = null
    }

    // MAKENULL(): Makes Queue an empty list
    public void makeNull() {
        this.front = null;
        this.rear = null;
    }

    // EMPTY(): Returns true if Queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // ENQUEUE(x): Inserts element x at the rear node
    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) { // If queue is empty
            rear = newNode;
            front = rear;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // DEQUEUE(): Removes and returns the front node value
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Queue is Empty!");
            return -1;
        }

        Node temp = front; // Temporary reference
        int value = temp.data;
        front = front.next; // Move front pointer to next node

        if (front == null) { // Queue becomes empty after deletion
            rear = null;
        }

        return value;
    }

    // FRONT(): Returns data of the front node
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    // Display all elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
