package com.company.leetcode.binary_tree_maximum_path_sum;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 15.05.2023.
 */
public class TreeNode {
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
