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

    public void append(float value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // insertion at head 
    void insertAtHead(float value){
        Node newNode  = new Node(value);
        newNode.next = head;
        head = newNode; 
    }


    // searching 

    void search(float value){
        Node current = head;
        while(current!=null){
            if(current.value==value){
                System.out.println("Value found");
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found");
    }

    // deletion of last node 
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }

    


    

}
