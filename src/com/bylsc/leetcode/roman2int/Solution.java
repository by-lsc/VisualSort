package com.bylsc.leetcode.roman2int;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * @author lsc 
 * @create on 2016年4月12日14:21:51
 */
public class Solution {
	public int romanToInt(String s) {
		if(s == null) return 0;
		if(s.length() <= 1) return char2int(s.charAt(0));
		int result = char2int(s.charAt(0));
		int cur = 0,pre =0;
		for (int i = 1; i < s.length(); i++) {
			pre = char2int(s.charAt(i-1));
			cur = char2int(s.charAt(i));
			if(pre >= cur){
				result = result + cur;
			}else{
				result = cur + result - pre *2;
			}
		}
		return result;
	}

	private int char2int(char c) {
		int n = 0;
		switch (c) {
		case 'I':
			n = 1;
			break;
		case 'V':
			n = 5;
			break;
		case 'X':
			n = 10;
			break;
		case 'L':
			n = 50;
			break;
		case 'C':
			n = 100;
			break;
		case 'D':
			n = 500;
			break;
		case 'M':
			n = 1000;
			break;
		default:
			return 0;
		}
		return n;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "";
//		String str = "XIX";//19 = 10 + (11) - 1*2
//		System.out.println(s.char2int(str.charAt(2)));
		System.out.println(s.romanToInt(str));
	}
}
