package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder {
    static int ind =-1;
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
    public node buildtree(int[] tree ){
        ind++;
        if(tree[ind] ==-1){
            return null;
        }
        node newnode = new node( tree[ind]);
        newnode.left = buildtree(tree);
        newnode.right = buildtree(tree);
        return newnode;
    }
    public static void level(node root){
        if(root == null){
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curNode.val + " ");
                if(curNode.left != null){
                    q.add(curNode.left);
                }
                if(curNode.right != null){
                    q.add(curNode.right);

                }

            }
        }
    }

    public static void main(String[] args) {
        int[] tree = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        levelorder l = new levelorder();
        node root = l.buildtree(tree);
        level(root);

    }
}
