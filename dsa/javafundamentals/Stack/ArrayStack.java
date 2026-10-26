package Stack;

public class ArrayStack {

    private int[] stack;
    private int top;    
    private int stackSize;

    public ArrayStack(int size) {
        this.stackSize = size;
        this.stack = new int[stackSize];
        this.top = -1; // Stack initially empty [8]
    }

    // Push: Add item to top [6, 8]
    public void push(int element) {
        if (top == stackSize - 1) {
            System.out.println("Stack is full"); // Overflow check [8]
        } else {
            stack[++top] = element;
        }
    }

    // Pop: Remove item from top [6]
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty"); // Underflow check [6]
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Top / Peek: View top element without removing [6]
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // IsEmpty: Check if stack is empty [11]
    public boolean isEmpty() {
        return top == -1;
    }

    // display the stack 

    void displayStack(){
        for(int i = 0 ; i<=top ; i++){
            System.out.print(stack[i] + " ");
        }   
        System.out.println();
    }
}
