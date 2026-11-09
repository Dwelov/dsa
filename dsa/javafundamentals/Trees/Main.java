package Trees;

public class Main {

    public static void main(String[] args) {

        // creating a tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // // level order printing
        // Queue<TreeNode> q = new LinkedList<>(List.of(root));
        // while (!q.isEmpty()) {
        //     TreeNode n = q.poll();
        //     if (n != null) {
        //         System.out.print(n.data + " ");
        //         q.add(n.left);
        //         q.add(n.right);
        //     }
        // }
        // System.out.println();

        TreePrinter.printPyramid(root);

        // printing traversals
        System.out.println("Preorder Traversal: ");
        Traversal.preorder(root);
        System.out.println();

        System.out.println("Inorder Traversal: ");
        Traversal.inorder(root);
        System.out.println();

        System.out.println("Postorder Traversal: ");
        Traversal.postorder(root);
        System.out.println();
    }

}
