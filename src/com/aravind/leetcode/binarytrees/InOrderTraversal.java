package com.aravind.leetcode.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public static List<Integer> inOrderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        inOrderTraversalRecursion(root, result);
        return result;
    }

    public static void inOrderTraversalRecursion(TreeNode root, List<Integer> result)
    {
        if(root == null)
            return;

        inOrderTraversalRecursion(root.left,result);

        System.out.println(root.val);
        result.add(root.val);

        inOrderTraversalRecursion(root.right,result);
    }

    public static  void main(String... arf)
    {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);

        root.left = two;
        root.right = three;

        inOrderTraversal(root);
    }
}
