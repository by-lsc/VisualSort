package com.bylsc.leetcode.movezeros;

/**
 * 
 * @author lsc
 * @create 2015Äê11ÔÂ25ÈÕ
 * @link https://leetcode.com/problems/move-zeroes/
 */

public class Solution {
	public void moveZeroes(int[] nums) {
		int count = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (count > 0) {
				nums[i - count] = nums[i];
			}
			if (nums[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			nums[len - i - 1] = 0;
		}
		
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + "   ");
//		}
	}
}
