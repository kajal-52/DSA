package com.ztm.algorithms.searching;

import com.ztm.data.structures.tree.BinaryTree;
import com.ztm.data.structures.tree.TreeNode;

import java.util.*;

/**
 *       9
 *     /   \
 *    4    20
 *   / \   / \
 *  1 7  15  22
 *   BFS= [ 9, 4, 20, 1, 7, 15, 22]
 *   requires data structure for storing child
 *   is better use to find the shortest path
 */
public class BFS {
    TreeNode<Integer> root;
    public List<Integer> traverse(){
        TreeNode<Integer> currentNode = this.root;
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode<Integer>> queue=new ArrayDeque<>();;
        queue.add(currentNode);
        while (!queue.isEmpty()){
            currentNode=queue.poll();
            result.add(currentNode.data);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BFS bfs =new BFS();
        bfs.root=new TreeNode<>(9);
        bfs.root.left=new TreeNode<>(4);
        bfs.root.right=new TreeNode<>(20);
        bfs.root.left.left =new TreeNode<>(1);
        bfs.root.left.right =new TreeNode<>(7);
        List<Integer> list=bfs.traverse();
        for (Integer l:list) {
            System.out.print(l+" ");
        }
    }

}
