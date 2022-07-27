package com.ztm.algorithms.searching;

import com.ztm.data.structures.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSRecursive {
    TreeNode<Integer> root;

    public List<Integer> bfsTraversalR(Queue<TreeNode<Integer>> queue, List<Integer> list) {
        if (queue.isEmpty()) {
            return list;
        }
        TreeNode<Integer> currentNode = queue.poll();
        list.add(currentNode.data);
        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }
        return bfsTraversalR(queue, list);
    }

    public static void main(String[] args) {
        BFSRecursive bfsr = new BFSRecursive();
        bfsr.root = new TreeNode<>(9);
        bfsr.root.left = new TreeNode<>(4);
        bfsr.root.right = new TreeNode<>(20);
        bfsr.root.left.left = new TreeNode<>(1);
        bfsr.root.left.right = new TreeNode<>(7);
        Queue<TreeNode<Integer>> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        queue.add(bfsr.root);
        List<Integer> list1=bfsr.bfsTraversalR(queue, list);
        for (Integer l:list1) {
            System.out.print(l+" ");
        }
    }
}
