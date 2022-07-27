package com.ztm.data.structures.tree;

public class Runner {
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.insert(9);
        tree.insert(67);
        tree.insert(8);
        tree.insert(50);
        tree.insert(4);
        tree.insert(13);
        boolean found = tree.lookup(0);
//        System.out.println(found);
        TreeNode<Integer> treeNode=tree.traverse(7);

    }
}
