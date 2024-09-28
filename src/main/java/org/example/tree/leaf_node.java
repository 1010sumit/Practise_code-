package org.example.tree;

public class leaf_node {
    static int ind = -1;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Method to print leaf nodes
    public void printLeafNodes(TreeNode root) {
        if (root == null) {
            return;
        }

        // If the node is a leaf node, print its value
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
        }

        // Recur for the left and right subtree
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    // Method to build a binary tree from an array (used for testing)
    public TreeNode buildTree(int[] arr) {
        ind++;
        if (arr[ind] == -1){
            return null;

        }

        TreeNode newNode = new TreeNode(arr[ind]);
        newNode.left = buildTree(arr);  // Build left subtree
        newNode.right = buildTree(arr); // Build right subtree

        return newNode;
    }

    public static void main(String[] args) {
        int[] treeArray = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};  // Tree structure

        leaf_node tree = new leaf_node();

        ind = -1;  // Reset index
        TreeNode root = tree.buildTree(treeArray);  // Build the tree

        System.out.print("Leaf nodes: ");
        tree.printLeafNodes(root);  // Print leaf nodes
    }
}
