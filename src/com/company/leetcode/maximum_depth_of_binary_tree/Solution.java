package com.company.leetcode.maximum_depth_of_binary_tree;

public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        return maxDepth(root, depth);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        return Math.max(maxDepth(root.left, depth), maxDepth(root.right, depth));
    }
}
