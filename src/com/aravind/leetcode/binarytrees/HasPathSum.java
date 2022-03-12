package com.aravind.leetcode.binarytrees;

public class HasPathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
            return false;

        System.out.println(root.val);
        System.out.println(targetSum-root.val);
        System.out.println();
        if(targetSum-root.val == 0 && root.left == null && root.right == null)
            return true;
        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(3);
        TreeNode five = new TreeNode(4);
        TreeNode siz = new TreeNode(4);
        TreeNode seven = new TreeNode(1);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.left = siz;
        three.right = seven;

        System.out.println(hasPathSum(root,4));
    }
}
