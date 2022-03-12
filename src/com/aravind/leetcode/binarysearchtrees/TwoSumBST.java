package com.aravind.leetcode.binarysearchtrees;

import java.util.ArrayList;
import java.util.List;

public class TwoSumBST {

    public static  boolean findTarget(TreeNode root, int k) {
        List<Integer> inOrderList = new ArrayList<>();

        getInOrderList(root, inOrderList);

        int leftPointer = 0;
        int rightPointer = inOrderList.size() -1;

        while(leftPointer<rightPointer)
        {
            int sum = inOrderList.get(leftPointer) + inOrderList.get(rightPointer);
            if(sum < k)
                leftPointer++;
            else if (sum >k)
                rightPointer--;
            else
                return true;
        }

        return false;


    }

    public static void getInOrderList(TreeNode node, List<Integer> inOrderList)
    {
        if(node == null)
            return;

        if(node.left != null)
            getInOrderList(node.left,inOrderList);

        inOrderList.add(node.val);

        if(node.right != null)
            getInOrderList(node.right,inOrderList);

    }

    public static void main(String... args)
    {
        TreeNode root = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(1);
        TreeNode five = new TreeNode(3);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        System.out.println(findTarget(root,10));
    }
}
