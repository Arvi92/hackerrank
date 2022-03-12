package com.aravind.leetcode.binarytrees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {

        return isMirror(root.left,root.right);

    }

    public static boolean isMirror(TreeNode one, TreeNode two)
    {
        if(one ==null && two == null)
            return true;
        else if(one ==null && two != null)
            return false;
        else if(one !=null && two == null)
            return false;

        if(one.val != two.val)
            return false;
        return isMirror(one.left,two.right) && isMirror(one.right,two.left);
    }

    public static void main(String... args)
    {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(3);
        TreeNode five = new TreeNode(4);
        TreeNode siz = new TreeNode(4);
        TreeNode seven = new TreeNode(3);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.left = siz;
        three.right = seven;
       System.out.println(isSymmetric(root));
    }
}
