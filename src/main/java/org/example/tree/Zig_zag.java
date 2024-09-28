package org.example.tree;

public class Zig_zag {
    static int ind =-1;
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode buildtree(int[] tree){
        ind++;

        if(tree[ind] == -1){
            return null;
        }
        TreeNode newNode = new TreeNode(tree[ind]);
        newNode.left = buildtree(tree);
        newNode.right = buildtree(tree);

        return newNode;

    }
    public static void actualzigzag(int[] tree){

    }
    public static void main(String[] args) {
        int[] tree = {1,4,6,-3,-1,-1,5,8,67,-1,9,-1};

    }
}
