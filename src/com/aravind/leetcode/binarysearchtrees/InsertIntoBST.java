package com.aravind.leetcode.binarysearchtrees;

public class InsertIntoBST {

    public static TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null)
            return new TreeNode(val);
        if(val < root.val)
        {
            if(root.left == null)
                root.left = new TreeNode(val);
            else
                insertIntoBST(root.left,val);
        }
        else
        {
            if(root.right == null)
                root.right = new TreeNode(val);
            else
                insertIntoBST(root.right,val);
        }

        return root;

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

        System.out.println(insertIntoBST(root,5).right.left.val);
    }
}
