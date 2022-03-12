package com.aravind.leetcode.binarysearchtrees;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class SearchInBST {
    public static boolean searchBST(TreeNode root, int val) {
        if(root == null)
            return false;
        if(root.val == val)
            return true;
        else if(root.val > val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);
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

        System.out.println(searchBST(root,2));
    }
}
