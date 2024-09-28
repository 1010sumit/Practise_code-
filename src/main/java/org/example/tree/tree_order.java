package org.example.tree;

public class tree_order {
    static int ind = -1;

    // Node class to represent each node of the tree
    static class node {
        int val;
        node left;
        node right;

        // Constructor to initialize node with a value
        public node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Method to build a tree from a given array using preorder traversal
    public node buildtree(int[] tree) {
        ind++;
        // If the current index is -1, this represents a null node
        if (tree[ind] == -1) {
            return null;
        }

        // Create a new node with the current value
        node newnode = new node(tree[ind]);
        // Recursively build the left subtree
        newnode.left = buildtree(tree);
        // Recursively build the right subtree
        newnode.right = buildtree(tree);

        return newnode;
    }
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    public static void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val + " ");
    }

    // Main method to test the tree building
    public static void main(String[] args) {
        int[] tree = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};  // Preorder traversal
        tree_order t = new tree_order();

        // Build the tree from the given array
        node root = t.buildtree(tree);

        // Print the value of the root node to verify tree construction
//        System.out.println("Root of the tree: " + root.val);
        System.out.println("preorder");

        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
    }
}
