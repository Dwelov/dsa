package doublylist;

/**
 * A doubly linked list implementation.
 *
 * <p>Supports insertion at head/tail/any position, deletion at head/tail/any
 * position/by value, search, size, and forward/reverse traversal.
 * All positions are 1-based.
 */
public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /** Returns true if the list contains no nodes. */
    public boolean isEmpty() {
        return head == null;
    }

    /** Returns the number of nodes in the list. */
    public int getSize() {
        return size;
    }

    /**
     * Inserts a node at the head of the list. O(1)
     */
    public void insertAtHead(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * Inserts a node at the tail of the list. O(1)
     */
    public void insertAtTail(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    /**
     * Inserts a node at the given 1-based position.
     * position == 1      -> insert at head
     * position == size+1 -> insert at tail
     * Throws IndexOutOfBoundsException if position is out of range.
     */
    public void insertAtPosition(int data, int position) {
        if (position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException(
                    "Invalid position " + position + ". List size is " + size);
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        // position is between 2 and size, so current.next is never null here
        DoublyNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.getNext();
        }

        DoublyNode newNode = new DoublyNode(data);
        newNode.setNext(current.getNext());
        newNode.setPrev(current);
        current.getNext().setPrev(newNode);
        current.setNext(newNode);
        size++;
    }

    /**
     * Removes the node at the head. O(1)
     * Throws IllegalStateException if the list is empty.
     */
    public void deleteAtHead() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }

        if (head == tail) {
            // Only one node
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
    }

    /**
     * Removes the node at the tail. O(1)
     * Throws IllegalStateException if the list is empty.
     */
    public void deleteAtTail() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
    }

    /**
     * Removes the node at the given 1-based position.
     * Throws IndexOutOfBoundsException if position is out of range.
     */
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            throw new IndexOutOfBoundsException(
                    "Invalid position " + position + ". List size is " + size);
        }

        if (position == 1) {
            deleteAtHead();
            return;
        }

        if (position == size) {
            deleteAtTail();
            return;
        }

        // Walk to the node at the given position (2 .. size-1)
        DoublyNode current = head;
        for (int i = 1; i < position; i++) {
            current = current.getNext();
        }

        current.getPrev().setNext(current.getNext());
        current.getNext().setPrev(current.getPrev());
        size--;
    }

    /**
     * Removes the first node whose data equals the given key.
     * Throws IllegalArgumentException if the key is not found.
     */
    public void deleteByValue(int key) {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }

        DoublyNode current = head;
        while (current != null && current.getData() != key) {
            current = current.getNext();
        }

        if (current == null) {
            throw new IllegalArgumentException("Value not found: " + key);
        }

        if (current == head) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null; // list became empty
            }
        } else if (current == tail) {
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null; // list became empty
            }
        } else {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        size--;
    }

    /**
     * Returns true if the list contains a node with data equal to key.
     */
    public boolean search(int key) {
        DoublyNode current = head;
        while (current != null) {
            if (current.getData() == key) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /** Removes all nodes from the list. */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /** Prints the list from head to tail. */
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" <-> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    /** Prints the list from tail to head (demonstrates the prev links). */
    public void displayReverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        DoublyNode current = tail;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getPrev() != null) {
                System.out.print(" <-> ");
            }
            current = current.getPrev();
        }
        System.out.println();
    }
}
