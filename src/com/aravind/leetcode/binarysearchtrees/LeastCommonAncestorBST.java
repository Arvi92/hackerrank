package com.aravind.leetcode.binarysearchtrees;

public class LeastCommonAncestorBST {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null)
            return root;
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        else if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        else
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
        System.out.println(lowestCommonAncestor(root,four,five));
    }
}
