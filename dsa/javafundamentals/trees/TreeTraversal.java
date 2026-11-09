package trees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

    // traversal of the trees, in preorder, post order and in order 
    
    //preorder traversal - it is the depth first traversal of the tree in which there is first visting of the 
    // root and then the left subtree and then the right subtree

    public static void preOrder(Node root){
        List<String> order = new ArrayList<>();
        preOrder(root, order);
        System.out.println("Preorder  : " + String.join("-", order));
    }

    private static void preOrder(Node root, List<String> order){
        if(root == null){
            return;
        }
        order.add(root.data);
        preOrder(root.left, order);
        preOrder(root.right, order);
    }

    // Inorder Traversal  - in this there is first visting of the left subtree 
    // and then the root and then the right subtree and also called as the symmetry traversal

    public static void inOrder(Node root){
        List<String> order = new ArrayList<>();
        inOrder(root, order);
        System.out.println("Inorder   : " + String.join("-", order));
    }

    private static void inOrder(Node root, List<String> order){
        if(root == null){
            return;
        }
        inOrder(root.left, order);
        order.add(root.data);
        inOrder(root.right, order);
    }

    //postorder traversal - in this there is first visting of the left subtree 
    // and then the right subtree and then the root

    public static void  postOrder(Node root){
        List<String> order = new ArrayList<>();
        postOrder(root, order);
        System.out.println("Postorder : " + String.join("-", order));
    }

    private static void  postOrder(Node root, List<String> order){
        if(root == null){
            return;
        }
        postOrder(root.left, order);
        postOrder(root.right, order);
        order.add(root.data);
    }

    // Prints the tree in a 2D ASCII layout, where each node is drawn above
    // its children and connected with '/' and '\' branches.
    private static class Block {
        List<String> lines;
        int width, height, middle;

        Block(List<String> lines, int width, int height, int middle) {
            this.lines = lines;
            this.width = width;
            this.height = height;
            this.middle = middle;
        }
    }

    public static void printTree(Node root) {
        if (root == null) return;
        for (String line : build(root).lines) {
            System.out.println(line);
        }
    }

    private static String sp(int n) { return " ".repeat(Math.max(0, n)); }
    private static String us(int n) { return "_".repeat(Math.max(0, n)); }

    private static Block build(Node node) {
        String s = String.valueOf(node.data);
        int u = s.length();

        // Leaf
        if (node.left == null && node.right == null) {
            List<String> lines = new ArrayList<>();
            lines.add(s);
            return new Block(lines, u, 1, u / 2);
        }

        // Only left child
        if (node.right == null) {
            Block l = build(node.left);
            List<String> lines = new ArrayList<>();
            lines.add(sp(l.middle + 1) + us(l.width - l.middle - 1) + s);
            lines.add(sp(l.middle) + "/" + sp(l.width - l.middle - 1 + u));
            for (String line : l.lines) lines.add(line + sp(u));
            return new Block(lines, l.width + u, l.height + 2, l.width + u / 2);
        }

        // Only right child
        if (node.left == null) {
            Block r = build(node.right);
            List<String> lines = new ArrayList<>();
            lines.add(s + us(r.middle) + sp(r.width - r.middle));
            lines.add(sp(u + r.middle) + "\\" + sp(r.width - r.middle - 1));
            for (String line : r.lines) lines.add(sp(u) + line);
            return new Block(lines, r.width + u, r.height + 2, u / 2);
        }

        // Both children
        Block l = build(node.left);
        Block r = build(node.right);

        List<String> lines = new ArrayList<>();
        lines.add(sp(l.middle + 1) + us(l.width - l.middle - 1) + s
                + us(r.middle) + sp(r.width - r.middle));
        lines.add(sp(l.middle) + "/"
                + sp(l.width - l.middle - 1 + u + r.middle) + "\\"
                + sp(r.width - r.middle - 1));

        // Pad the shorter side so both have equal height
        List<String> ll = new ArrayList<>(l.lines);
        List<String> rl = new ArrayList<>(r.lines);
        for (int i = l.height; i < r.height; i++) ll.add(sp(l.width));
        for (int i = r.height; i < l.height; i++) rl.add(sp(r.width));

        for (int i = 0; i < ll.size(); i++) {
            lines.add(ll.get(i) + sp(u) + rl.get(i));
        }

        return new Block(lines, l.width + r.width + u,
                Math.max(l.height, r.height) + 2, l.width + u / 2);
    }

}
