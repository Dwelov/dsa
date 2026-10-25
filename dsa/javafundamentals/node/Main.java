package node;

public class Main {
    public static void main(String[] args) {

        // LinkedList newList = new LinkedList();
        // newList.append(1);
        // newList.append(2);
        // newList.append(3);
        // newList.append(4);
        // newList.append(5);
        // newList.displayList();
        // newList.insertAtHead(0);
        // newList.displayList();
        // newList.search(3);
        // newList.deleteLast();
        // newList.displayList();

        SortedLinkedList list = new SortedLinkedList();

        // Build list: 2.5, 7.9, 12.6
        list.appendNode(2.5f);
        list.appendNode(7.9f);
        list.appendNode(12.6f);
        System.out.print("Initial values: ");
        list.displayList(); // Output: 2.5 7.9 12.6

        // Insert in middle
        list.insertNode(10.5f);
        System.out.print("After inserting 10.5: ");
        list.displayList(); // Output: 2.5 7.9 10.5 12.6

        // Delete middle node
        list.deleteNode(7.9f);
        System.out.print("After deleting 7.9: ");
        list.displayList(); // Output: 2.5 10.5 12.6

        // Delete last node
        list.deleteNode(12.6f);
        System.out.print("After deleting 12.6: ");
        list.displayList(); // Output: 2.5 10.5

        // Delete head
        list.deleteNode(2.5f);
        System.out.print("After deleting 2.5: ");
        list.displayList(); // Output: 10.5

        
    }
}
