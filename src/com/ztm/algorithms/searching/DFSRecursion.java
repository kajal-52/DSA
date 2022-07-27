//package com.ztm.algorithms.searching;
//
//import com.ztm.data.structures.tree.TreeNode;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Queue;
//
///**
// *       9
// *     /   \
// *    4    20
// *   / \   / \
// *  1 7  15  22
// *   DFS= [ 9, 4, 1, 7, 20, 15, 22]
// *   requires less memory
// *   better for checking if path exist
// *
// */
//public class DFSRecursive {
//    TreeNode<Integer> root;
//
//    public List<Integer> dfsTraversalInorder(Queue<TreeNode<Integer>> queue, List<Integer> list) {
//        if (queue.isEmpty()) {
//            return list;
//        }
//        TreeNode<Integer> currentNode = queue.poll();
//        list.add(currentNode.data);
//        if (currentNode.left != null) {
//            queue.add(currentNode.left);
//        }
//        if (currentNode.right != null) {
//            queue.add(currentNode.right);
//        }
//        return dfsTraversalInorder(queue, list);
//    }
//    public List<Integer> dfsTraversalInorder(Queue<TreeNode<Integer>> queue, List<Integer> list) {
//    }
//    public List<Integer> dfsTraversalInorder(Queue<TreeNode<Integer>> queue, List<Integer> list) {
//
//    }
//
//        public static void main(String[] args) {
//        DFSRecursive dfsr = new DFSRecursive();
//        dfsr.root = new TreeNode<>(9);
//        dfsr.root.left = new TreeNode<>(4);
//        dfsr.root.right = new TreeNode<>(20);
//        dfsr.root.left.left = new TreeNode<>(1);
//        dfsr.root.left.right = new TreeNode<>(7);
//        Queue<TreeNode<Integer>> queue = new ArrayDeque<>();
//        List<Integer> list = new ArrayList<>();
//        queue.add(bfsr.root);
//        List<Integer> list1=bfsr.bfsTraversalR(queue, list);
//        for (Integer l:list1) {
//            System.out.print(l+" ");
//        }
//    }
//
//
//}
