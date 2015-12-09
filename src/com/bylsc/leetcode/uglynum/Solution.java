package com.bylsc.leetcode.uglynum;
/**
 * 
 * @author lsc
 * @time 2015年12月9日15:11:53
 * @link https://leetcode.com/problems/ugly-number/
 * @reference http://www.nowamagic.net/librarys/veda/detail/260 
 * 
 */

public class Solution {
	
	public boolean isUgly(int num) {
		if (num <= 0) {
			return false;
		}
		while (num % 2 == 0) {
			num = num / 2;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}
		return num == 1 ? true : false;
	}
}
