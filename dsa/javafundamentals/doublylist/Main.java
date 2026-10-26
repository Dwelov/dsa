package doublylist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.insertAtHead(40);
        dll.insertAtHead(50);
        dll.insertAtHead(60);
        dll.insertAtHead(70);
        dll.insertAtHead(80);
        dll.insertAtHead(90);
        dll.insertAtHead(100);

        dll.displayDll();

        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.insertAtTail(60);
        dll.insertAtTail(70);
        dll.insertAtTail(80);
        dll.insertAtTail(90);
        dll.insertAtTail(100);

         dll.displayDll();

        dll.insertAtAnyPoint(10, 1);
        dll.insertAtAnyPoint(20, 2);
        dll.insertAtAnyPoint(30, 3);
        dll.insertAtAnyPoint(40, 4);
        dll.insertAtAnyPoint(50, 5);
        dll.insertAtAnyPoint(60, 6);
        dll.insertAtAnyPoint(70, 7);
        dll.insertAtAnyPoint(80, 8);
        dll.insertAtAnyPoint(90, 9);
        dll.insertAtAnyPoint(100, 10);

         dll.displayDll();
    }
}
