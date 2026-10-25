package node;

public class Main {
    public static void main(String[] args) {

        LinkedList newList = new LinkedList();
        newList.append(1);
        newList.append(2);
        newList.append(3);
        newList.append(4);
        newList.append(5);
        newList.displayList();
        newList.insertAtHead(0);
        newList.displayList();
        newList.search(3);
        newList.deleteLast();
        newList.displayList();
    }
}
