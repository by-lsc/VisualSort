package com.bylsc.leetcode.btreedepth;

/**
 * 
 * @author lsc
 * @time 	2015年12月1日16:32:32
 * @link 	https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null){
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            depth = ldepth > rdepth?ldepth+1 : rdepth + 1;
        }
        return depth;
    }
}