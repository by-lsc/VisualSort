package com.bylsc.leetcode.ksum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 * @author lsc
 * @time 2016年4月8日16:47:23
 * @reference http://www.cnblogs.com/TenosDoIt/p/3649607.html
 * 			  http://blog.csdn.net/ljiabin/article/details/40620579
 */
public class Solution {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0)
			return result;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;// 重复的直接往下走
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				if (nums[l] + nums[r] == -nums[i]) {
					List<Integer> innerResult = new ArrayList<Integer>();
					innerResult.add(nums[i]);
					innerResult.add(nums[l]);
					innerResult.add(nums[r]);
					result.add(innerResult);
					while (l < r && nums[l] == nums[l+1]) l++;  
		            while (l < r && nums[r] == nums[r-1]) r--;  
		            l++;  
		            r--;  
				} else if (nums[l] + nums[r] < nums[i]) {
					l++;
				} else {
					r--;
				}
			}
		}

		return result;
	    }
	 public static void main(String[] args) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Solution s = new Solution();
//		int nums[] = {-1,0,1,2,-1,-4};
//		int nums[] = {0,0,0,0};//
		int nums[] = {1,-1,-1,0};//
						//[-4, -1, -1, 0, 1, 2]
		result = s.threeSum(nums);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j)  + " ");
			}
			System.out.println();
		}
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i]+ " ");
//		}
	}
}
