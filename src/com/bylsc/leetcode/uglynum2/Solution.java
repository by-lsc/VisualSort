package com.bylsc.leetcode.uglynum2;

/**
 * 
 * @author lsc
 * @time 2015年12月12日14:30:24
 * @link https://leetcode.com/problems/ugly-number-ii/
 * @reference http://my.oschina.net/Tsybius2014/blog/495962
 */

public class Solution {
	public static int nthUglyNumber(int n) {
		if(n < 1) return 0;
		int index2 = 0,index3 = 0,index5 = 0;
		int[] nums = new int[n];
		nums[0] = 1;
		int count = 0;
		while(count < n-1){
			int min = getMin(nums[index2] * 2, nums[index3] * 3, nums[index5] * 5);
			if(min == nums[index2] * 2){
				index2 ++;
			}
			if(min == nums[index3] * 3){
				index3 ++;
			}
			if(min == nums[index5] * 5){
				index5 ++;
			}
			nums[++count] = min;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		return nums[n-1];
	}
	private static  int getMin(int n1,int n2,int n3){
		int t = n1 < n2 ?n1:n2;
	return t < n3 ? t : n3;
	}
	public static void main(String[] args) {
//		System.out.println(getMin(3, 2, 9));
//		System.out.println(getMin(1, 2, 4));
//		System.out.println(nthUglyNumber(0));
	}
}
