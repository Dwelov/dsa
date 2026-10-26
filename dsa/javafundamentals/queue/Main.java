package queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQ = new ArrayQueue(5);
        arrayQ.enqueue(14);
        arrayQ.enqueue(22);
        arrayQ.enqueue(13);
        arrayQ.enqueue(-6);
        arrayQ.display(); // Output: 14 22 13 -6

        System.out.println("Front element: " + arrayQ.front()); // 14
        System.out.println("Dequeued: " + arrayQ.dequeue());  // Removes 14
        arrayQ.display(); // Output: 22 13 -6

        arrayQ.enqueue(9);
        arrayQ.enqueue(20);
        arrayQ.display(); // Demonstrates circular wrap-around!

        System.out.println("\n--- Linked List Queue Test ---");
        LinkedListQueue listQ = new LinkedListQueue();
        listQ.enqueue(1);
        listQ.enqueue(7);
        listQ.enqueue(5);
        listQ.enqueue(2);
        listQ.display(); // Output: 1 7 5 2

        System.out.println("Front element: " + listQ.front()); // 1
        System.out.println("Dequeued: " + listQ.dequeue());   // Removes 1
        listQ.display(); // Output: 7 5 2

        listQ.makeNull();
        System.out.println("Is empty after makeNull()? " + listQ.isEmpty()); // true
    }
}
