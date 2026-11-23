package dsa.AVLtree;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Node root = null;
        int[] keys = {30, 10, 20, 40, 50, 35, 5};

        for (int key : keys) {
            root = tree.insert(root, key);
        }

        System.out.print("In-Order Traversal: ");
        tree.inOrder(root); // Output: 5 10 20 30 35 40 50
    }
}