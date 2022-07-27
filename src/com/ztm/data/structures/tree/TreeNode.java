package com.ztm.data.structures.tree;

public class TreeNode<T> {
    public T data;
    public TreeNode<T> left, right;
    public TreeNode(T data)
    {
        this.data=data;
        left=right=null;
    }
}
