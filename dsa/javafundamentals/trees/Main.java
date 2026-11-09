package trees;

public class Main {

    public static void main(String[] args) {

        // initializing the nodes in the binary tree
        Node firstNode = new Node("A");
        Node secondNode = new Node("B");
        Node thirdNode = new Node("C");
        Node fourthNode = new Node("D");
        Node fifthNode = new Node("E");

        // Connect binary tree nodes
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
        secondNode.right = fifthNode;

        // implementing the traversal of the tree
        TreeTraversal.preOrder(firstNode);
        TreeTraversal.inOrder(firstNode);
        TreeTraversal.postOrder(firstNode);

        System.out.println();

        // print the tree using the printTree function
        TreeTraversal.printTree(firstNode);

    }

}
