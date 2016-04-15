package com.bylsc.leetcode.int2roman;
/**
 * https://leetcode.com/problems/integer-to-roman/
 * @author lsc
 * @reference http://baike.baidu.com/view/42061.htm
 */
public class Solution {
	public String intToRoman(int num) {
		if(num < 1 || num > 3999) return "";
		String roman[][] = { { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }, 
				{ "", "M", "MM", "MMM" } };
		StringBuffer result = new StringBuffer();
		result.append(roman[3][num / 1000]);
		result.append(roman[2][num / 100 % 10]);
		result.append(roman[1][num / 10 % 10]);
		result.append(roman[0][num % 10]);
		
		return result.toString();
	}
	public static void main(String[] args) {
//		System.out.println(5%1000);
//		int i = 19;
		int i = 459;
		Solution s = new Solution();
		System.out.println(s.intToRoman(i));
	}
}
