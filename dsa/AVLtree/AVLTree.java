package dsa.AVLtree;

public class AVLTree {

    // Helper: Get height safely
    int height(Node n) {
        return (n == null) ? -1 : n.height;
    }

    // Helper: Calculate Balance Factor
    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    // Single Right Rotation (Fixes LL)
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights bottom-up
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root of subtree
    }

    // Single Left Rotation (Fixes RR)
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights bottom-up
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root of subtree
    }

    // Insert a key and rebalance
    Node insert(Node node, int key) {
        // 1. Standard BST insertion
        if (node == null) return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // Duplicates not allowed

        // 2. Update height of ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Check balance factor
        int bf = getBalance(node);

        // LL Case
        if (bf > 1 && key < node.left.key)
            return rightRotate(node);

        // RR Case
        if (bf < -1 && key > node.right.key)
            return leftRotate(node);

        // LR Case
        if (bf > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (bf < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}