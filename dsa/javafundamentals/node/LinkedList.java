package node;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // displaying the list
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
        }
    }

    // appending in the list

    public void append(float value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // insertion at head
    void insertAtHead(float value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // searching
    void search(float value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                System.out.println("Value found");
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found");
    }

    // deletion of last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // size of list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // insert at given position
    public void insertAtPosition(float value, int position) {
        // checking if position is valid

        if (position < 0 || position > size()) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(value);

        if (position == 0) {
            insertAtHead(value);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    // deletion at the specific site

    void deleteAtPosition(int position) {

        if (position < 0 || position > size()) {
            System.out.println("Invalid position");
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;

    }

  void delete(int val) {
    if (head == null) return;

    if (head.value == val) {          // value is in the first node
        head = head.next;
        return;
    }

    Node current = head;
    while (current.next != null) {
        if (current.next.value == val) {         // look one node ahead
            current.next = current.next.next;    // skip it
            return;
        }
        current = current.next;                  // move forward
    }
}

}
