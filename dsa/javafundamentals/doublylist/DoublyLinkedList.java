package doublylist;

public class DoublyLinkedList {

    DoublyNode head;
    DoublyNode tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAtAnyPoint(int data, int position) {
        if (position < 1)
            throw new IndexOutOfBoundsException();

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        DoublyNode current = head;

        for (int i = 1; i < position - 1; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();

            current = current.next;
        }

        if (current == null)
            throw new IndexOutOfBoundsException();

        DoublyNode newNode = new DoublyNode(data);

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null)
            current.next.prev = newNode;

        current.next = newNode;
    }


    void displayDll(){
       DoublyNode current  = head;
       while(current.next!=null){
        System.out.print(current.data+"-");
        current = current.next;
       }
       System.out.println(tail.data);
    }

}
