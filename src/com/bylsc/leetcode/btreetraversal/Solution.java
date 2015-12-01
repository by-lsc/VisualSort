package com.bylsc.leetcode.btreetraversal;

import java.util.List;

import com.bylsc.leetcode.btreedepth.TreeNode;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	if(root != null){
    		levelOrder(root.left);
    		Integer val = root.val;
    		
    	}
        return null;
    }
}