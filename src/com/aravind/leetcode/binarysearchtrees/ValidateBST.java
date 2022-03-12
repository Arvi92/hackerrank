package com.aravind.leetcode.binarysearchtrees;

import java.util.LinkedList;
import java.util.Queue;

/*

Better solution
https://www.youtube.com/watch?v=s6ATEkipzow&ab_channel=NeetCode



 */
public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        Queue<Integer> preOrderQueue = new LinkedList<>();

        isValidBSTRecur(root, preOrderQueue);

        int min = preOrderQueue.poll();
        while(!preOrderQueue.isEmpty())
        {
            int polledVal = preOrderQueue.poll();
            System.out.println(polledVal);
            if(polledVal <= min)
            {
                return false;
            }
            min = polledVal;
        }
        return true;
    }

    public static void isValidBSTRecur(TreeNode node, Queue<Integer> preOrderQueue)
    {
        if(node == null)
            return;

        if(node.left != null)
            isValidBSTRecur(node.left,preOrderQueue);

        preOrderQueue.offer(node.val);

        if(node.right != null)
            isValidBSTRecur(node.right,preOrderQueue);

    }

    public static boolean isValidBST2(TreeNode root) {

        long left = Long.MIN_VALUE;
        long right = Long.MAX_VALUE;

        return isValidBST2Recursion(root,left,right);
    }

    public static boolean isValidBST2Recursion(TreeNode node, long left, long right)
    {
        if(node == null)
            return true;

        System.out.println(node.val + " " + left + " " + right);
        if(node.val <= left || node.val >= right)
            return false;
        boolean leftValid = true;
        boolean rightValid = true;
        if(node.left != null)
            leftValid = isValidBST2Recursion(node.left, left,node.val);
        if(node.right != null)
            rightValid = isValidBST2Recursion(node.right, node.val,right);

        return leftValid && rightValid;
    }


    public static void main(String... args)
    {
        TreeNode root = new TreeNode(2147483647);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(1);
        TreeNode five = new TreeNode(3);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;

        System.out.println(isValidBST2(root));
    }
}
