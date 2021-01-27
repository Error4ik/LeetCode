package com.company.leetcode.symmetric_tree;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkTree(root.left, root.right);
    }

    private boolean checkTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && checkTree(left.left, right.right) && checkTree(left.right, right.left);
    }
}
