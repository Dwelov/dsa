package Trees;

public class Toperations {
    public TreeNode root;

    public Toperations() {
        this.root = null;
    }

    // 1. Insert
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // 2. Search
    public TreeNode search(int data) {
        return searchRec(root, data);
    }

    private TreeNode searchRec(TreeNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        }
        return searchRec(root.right, data);
    }

    // 3. Minimum
    public TreeNode findMin(TreeNode node) {
        if (node == null)
            return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 4. Maximum
    public TreeNode findMax(TreeNode node) {
        if (node == null)
            return null;
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    // 5. Predecessor (Largest value smaller than target)
    public TreeNode getPredecessor(int data) {
        TreeNode curr = search(data);
        if (curr == null)
            return null;

        // Case 1: Left subtree exists -> maximum in left subtree
        if (curr.left != null) {
            return findMax(curr.left);
        }

        // Case 2: No left subtree -> lowest ancestor where target is in right child
        // branch
        TreeNode predecessor = null;
        TreeNode ancestor = root;
        while (ancestor != null && ancestor.data != data) {
            if (data > ancestor.data) {
                predecessor = ancestor;
                ancestor = ancestor.right;
            } else {
                ancestor = ancestor.left;
            }
        }
        return predecessor;
    }

    // 6. Successor (Smallest value greater than target)
    public TreeNode getSuccessor(int data) {
        TreeNode curr = search(data);
        if (curr == null)
            return null;

        // Case 1: Right subtree exists -> minimum in right subtree
        if (curr.right != null) {
            return findMin(curr.right);
        }

        // Case 2: No right subtree -> lowest ancestor where target is in left child
        // branch
        TreeNode successor = null;
        TreeNode ancestor = root;
        while (ancestor != null && ancestor.data != data) {
            if (data < ancestor.data) {
                successor = ancestor;
                ancestor = ancestor.left;
            } else {
                ancestor = ancestor.right;
            }
        }
        return successor;
    }

    // 7. Delete
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private TreeNode deleteRec(TreeNode root, int data) {
        if (root == null)
            return null;

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node with 0 or 1 child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Node with 2 children: replace with in-order successor (min of right subtree)
            TreeNode minRight = findMin(root.right);
            root.data = minRight.data;
            root.right = deleteRec(root.right, minRight.data);
        }
        return root;
    }
}