package com.company.leetcode.binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        LinkedList<List<Integer>> lists = new LinkedList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = treeNodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = treeNodeQueue.poll();
                if (treeNode != null) {
                    list.add(treeNode.val);
                    if (treeNode.left != null) {
                        treeNodeQueue.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        treeNodeQueue.add(treeNode.right);
                    }
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
