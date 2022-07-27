package com.ztm.data.structures.tree;


import java.util.ArrayList;

public class PrintPathRootToNode {
    public static boolean hasPath(TreeNode<Integer> treeNode, int x, ArrayList<Integer> arr ){
        if(treeNode==null){
            return false;
        }
        arr.add(treeNode.data);
        if (treeNode.data==x){
            return true;
        }
        if (hasPath(treeNode.left,x,arr)||hasPath(treeNode.right,x,arr)){
            return true;
        }
        arr.remove(arr.get(arr.size()-1));
        return false;
    }

    public static void main(String[] args) {
        TreeNode<Integer> node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left =node.left.left = new TreeNode(6);
        node.right.right = node.left.left = new TreeNode(7);
        ArrayList<Integer> list = new ArrayList<>();
        boolean hasPath = hasPath(node, 6, list);
        if (hasPath){
            for (int i = 0; i < list.size()-1 ; i++) {
                System.out.print(list.get(i)+" -> ");
            }
            System.out.print(list.get(list.size()-1));
        }
        else
            System.out.println("No Path Exist");

    }
}
