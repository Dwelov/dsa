package dsa.AVLtree;

class Node {
    int key, height;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.height = 0; // Leaf height = 0 (null = -1)
    }
}