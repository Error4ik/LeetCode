package com.company.leetcode.path_sum;

/**
 * 112. Path Sum.
 * <p>
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 * <p>
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 * <p>
 * Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there are no root-to-leaf paths.
 *
 * @author Alexey Voronin.
 * @since 15.05.2023.
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return this.hasSum(root, 0, targetSum);
    }

    private boolean hasSum(TreeNode node, int currentSum, int targetSum) {
        if (node == null) {
            return false;
        }

        currentSum += node.val;
        if (node.left == null && node.right == null) {
            return currentSum == targetSum;
        }

        return hasSum(node.left, currentSum, targetSum) || hasSum(node.right, currentSum, targetSum);
    }
}
