package org.example.tree;

import org.example.thread.Mythread;

public class Count_node {
    static int ind=-1;
    class node {
        int val;
        node left;
        node right;

        public node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public node buildtree(int[] tree){
        ind++;
        if(tree[ind]== -1){
            return null;
        }
        node newnode = new node(tree[ind]);
        newnode.left = buildtree(tree);
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
    public static int countnode(node root){
        if(root == null){
            return 0;
        }
        int x = countnode(root.left);
        int y = countnode(root.right);

        return x+y+1;
    }
    public static int sum_nodes(node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum_nodes(root.left);
        int rightsum = sum_nodes(root.right);
         return leftsum+rightsum+root.val;
    }
    public static int height(node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight,rightheight) +1;
    }
    //Approach 1 for calculating diameter through max of (dia1,dia2,dia3)
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) +1;

        return Math.max(dia3, Math.max(dia1,dia2));
    }

    // Approach 2 to solve diameter question through calculating continuous height and diameter
    static class treeinfo{
        int height;
        int diameter;

        public treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static treeinfo diameterApp2(node root){
        if(root == null){
            return new treeinfo(0,0);
        }
        treeinfo left = diameterApp2(root.left);
        treeinfo right = diameterApp2(root.right);
        int myheight = Math.max(left.height, right.height)+1;

        int dia1= left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height +1;

        int myDiameter = Math.max(Math.max(dia1,dia2), dia3);

        treeinfo t = new treeinfo(myheight,myDiameter);
        return t;

    }



    public static void main(String[] args) {
        int[] tree = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Count_node c  = new Count_node();
        node root = c.buildtree(tree);
        System.out.print("Preorder Traversal: ");
        preorder(root); // Display preorder traversal of the tree
        System.out.println();

        int totalNodes = countnode(root); // Count total nodes in the tree
        System.out.println("Total number of nodes: " + totalNodes);
        int sum = sum_nodes(root);
        System.out.println("sum of nodes is : " + sum);
        int heightOfTree = height(root);
        System.out.println("height of tree is : " + heightOfTree);
        System.out.println("diameter of tree is o(n^2) :" +diameter(root));
        System.out.println("Approach 2 to calculate diameter is O(n) :" +diameterApp2(root).diameter);

    }
}
