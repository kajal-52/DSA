package com.ztm.data.structures.tree;

public class BinaryTree {
    TreeNode<Integer> root;
    public BinaryTree(){
        this.root=null;
    }

    public BinaryTree insert(int val){
        TreeNode<Integer> node= new TreeNode(val);
        if(root==null){
            root=node;
        }
        else{
            TreeNode<Integer> currNode = this.root;
            while (true){
                if (val<currNode.data){
                    if(currNode.left==null){
                        currNode.left= node;
                        return this;
                    }
                    currNode=currNode.left;
                }
                else {
                    if (currNode.right==null){
                        currNode.right= node;
                        return this;
                    }
                    currNode=currNode.right;
                }
            }
        }
        return this;
    }
    public boolean lookup(int val) {
        if (root == null) {
            return false;
        }
        else {
            TreeNode<Integer> currNode = this.root;
            while (currNode != null) {
                if (val < currNode.data) {
                    currNode = currNode.left;
                } else if (val > currNode.data) {
                    currNode = currNode.right;
                } else{
                    return true;
                }
            }
            return false;
        }
    }
    public TreeNode<Integer> traverse(int data ){
        TreeNode<Integer> node=new TreeNode<>(data);
        TreeNode<Integer> currNode= root;
        if(currNode==null){
            return null;
        }
        System.out.print(currNode.data+"-->");
        while (currNode.data!=node.data){
            if(node.data<currNode.data){
                currNode=currNode.left;
                System.out.print(currNode.data+"-->");
            }
            else if(node.data>currNode.data) {
                currNode=currNode.right;
                System.out.print(currNode.data+"-->");
            }
        }
        return currNode;

    }
    public void remove(int data){

    }
}
