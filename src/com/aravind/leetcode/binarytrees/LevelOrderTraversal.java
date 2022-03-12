package com.aravind.leetcode.binarytrees;

import java.util.*;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while(!queue.isEmpty())
        {
            List<Integer> levelNodes = new ArrayList<>();
            int size = queue.size();
            for(int i =0; i< size; i++)
            {
                if(!queue.isEmpty())
                {
                    TreeNode node = queue.poll();
                    levelNodes.add(node.val);

                    System.out.println(node.val);


                    if(node.left != null) {
                        queue.offer(node.left);
                    }
                    if(node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }

            result.add(levelNodes);

        }
        return  result;

    }

    public static  void main(String... arf)
    {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);

        root.left = two;
        root.right = three;
        two.left = four;

        List<List<Integer>> s = levelOrder(root);
        System.out.println(s.toString());



    }
}
