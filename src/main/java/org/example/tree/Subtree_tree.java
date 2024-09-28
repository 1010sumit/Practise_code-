package org.example.tree;

public class Subtree_tree {
    static int ind = -1;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Check if two trees are identical
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    // Check if subRoot is a subtree of root
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Build a tree from an array (rootArray or subRootArray)
    public TreeNode buildTree(int[] arr) {
        ind++;
        if (ind >= arr.length || arr[ind] == -1) {
            return null;
        }

        TreeNode newNode = new TreeNode(arr[ind]);
        newNode.left = buildTree(arr);  // Build left subtree
        newNode.right = buildTree(arr); // Build right subtree

        return newNode;
    }

    public static void main(String[] args) {
        int[] rootArray = {3, 4, 5, 1, 2, -1, -1, -1, -1, -1, -1};
        int[] subRootArray = {4, 1, 2, -1, -1, -1, -1};

        Subtree_tree s = new Subtree_tree();

        ind = -1; // Reset the index before building the root tree
        TreeNode root = s.buildTree(rootArray);

        ind = -1; // Reset the index before building the subtree
        TreeNode subRoot = s.buildTree(subRootArray);

        // Check if subRoot is a subtree of root
        boolean result = s.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);
    }
}
