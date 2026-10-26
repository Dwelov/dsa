package doublylist;

/**
 * Demonstration and test driver for the doubly linked list.
 */
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // --- Insert at head ---
        System.out.println("=== Insert 10..100 at head ===");
        for (int i = 10; i <= 100; i += 10) {
            dll.insertAtHead(i);
        }
        dll.display();           // expected: 100 <-> 90 <-> ... <-> 10
        dll.displayReverse();    // expected: 10 <-> 20 <-> ... <-> 100

        // --- Insert at tail ---
        System.out.println("\n=== Insert 110..200 at tail ===");
        for (int i = 110; i <= 200; i += 10) {
            dll.insertAtTail(i);
        }
        dll.display();           // 100 ... 10 <-> 110 ... 200
        System.out.println("Size: " + dll.getSize());

        // --- Insert at position ---
        System.out.println("\n=== Insert 999 at position 1 (head) ===");
        dll.insertAtPosition(999, 1);
        dll.display();

        System.out.println("\n=== Insert 888 at last position (tail) ===");
        dll.insertAtPosition(888, dll.getSize() + 1);
        dll.display();

        System.out.println("\n=== Insert 777 at position 5 ===");
        dll.insertAtPosition(777, 5);
        dll.display();

        // --- Search ---
        System.out.println("\n=== Search ===");
        System.out.println("Search 777: " + dll.search(777));   // true
        System.out.println("Search 9999: " + dll.search(9999)); // false

        // --- Delete at head / tail ---
        System.out.println("\n=== Delete at head ===");
        dll.deleteAtHead();
        dll.display();

        System.out.println("\n=== Delete at tail ===");
        dll.deleteAtTail();
        dll.display();

        // --- Delete at position ---
        System.out.println("\n=== Delete at position 3 ===");
        dll.deleteAtPosition(3);
        dll.display();

        // --- Delete by value ---
        System.out.println("\n=== Delete value 200 ===");
        dll.deleteByValue(200);
        dll.display();

        // --- Edge cases: empty list ---
        System.out.println("\n=== Emptying the list ===");
        while (!dll.isEmpty()) {
            dll.deleteAtHead();
        }
        dll.display();           // List is empty
        System.out.println("Size after clearing: " + dll.getSize());

        // --- Invalid operations (expected exceptions) ---
        System.out.println("\n=== Invalid position test ===");
        try {
            dll.insertAtPosition(1, 5); // position > size+1 on empty list
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            dll.deleteAtHead(); // empty list
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n=== All tests completed ===");
    }
}
