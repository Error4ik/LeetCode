package com.company.leetcode.sum_of_left_leaves;

public class Solution {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        this.getSum(root);
        return sum;
    }

    private void getSum(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
    }
}
