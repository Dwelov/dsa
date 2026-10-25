package node;

public class SortedLinkedList {
    private Node head;

    // add a node at the end of the list
    public void appendNode(float num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node nodePtr = head;
            while (nodePtr.next != null) {
                nodePtr = nodePtr.next;
            }
            nodePtr.next = newNode;
        }
    }

    // insert a node so that the list stays sorted
    public void insertNode(float num) {
        Node newNode = new Node(num);
        Node previousNode = null;
        if (head == null) {
            head = newNode;
        } else {
            Node nodePtr = head;
            while (nodePtr != null && nodePtr.value < num) {
                previousNode = nodePtr;
                nodePtr = nodePtr.next;
            }
            if (previousNode == null) {
                head = newNode;
                newNode.next = nodePtr;
            } else {
                previousNode.next = newNode;
                newNode.next = nodePtr;
            }
        }
    }

    // delete the first node holding num
    public void deleteNode(float num) {
        if (head == null) {
            return;
        }
        if (head.value == num) {
            head = head.next;
            return;
        }
        Node nodePtr = head;
        Node previousNode = null;
        while (nodePtr != null && nodePtr.value != num) {
            previousNode = nodePtr;
            nodePtr = nodePtr.next;
        }
        if (nodePtr != null) {
            previousNode.next = nodePtr.next;
        }
    }

    // print every value in the list
    public void displayList() {
        Node nodePtr = head;
        while (nodePtr != null) {
            System.out.print(nodePtr.value + " ");
            nodePtr = nodePtr.next;
        }
        System.out.println();
    }

}
