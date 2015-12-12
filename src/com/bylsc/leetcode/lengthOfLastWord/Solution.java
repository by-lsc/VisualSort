package com.bylsc.leetcode.lengthOfLastWord;

/**
 * 
 * @author lsc
 * @time 2015年12月12日17:29:16
 * @link https://leetcode.com/problems/length-of-last-word/
 */
public class Solution {

	public static int lengthOfLastWord(String s) {
		if (s == null || s.length() < 1) {
			return 0;
		}
		String[] ss = s.split(" ");
		if(ss.length == 0 )
			return 0;
		return ss[ss.length - 1].length();
	}

	public static void main(String[] args) {
		String s = "    ";
		int l = lengthOfLastWord(s);
		System.out.println(l);
	}

}
