package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.displayStack();
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.top());
        System.out.println(arrayStack.isEmpty());
        arrayStack.displayStack();


        ListStack listStack = new ListStack();
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        listStack.displayStack();
        System.out.println(listStack.pop());
        System.out.println(listStack.top());
        System.out.println(listStack.isEmpty());
        listStack.displayStack();
    }
}
