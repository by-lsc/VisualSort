package com.bylsc.leetcode.countandsay;
/**
 * 
 * @author lsc
 * @create 2015年1月25日16:16:06
 * @link https://leetcode.com/problems/count-and-say/
 */

public class Solution {
	public String countAndSay(int n) {
        String s = "1";
		for (int i = 1; i < n; i++) {
			s = getString(s);
		}
		return s;
    }
	
    public  String getString(String ts) {
		String result = "";
		byte[] bytes = ts.getBytes();
		int count = 1;
		byte pos = bytes[0];
		for (int i = 1; i <= bytes.length; i++) {
			if(i == bytes.length ){
				result += count + String.valueOf((char) bytes[i - 1]);
				break;
			}
			if ( pos == bytes[i]) {
				count++;
			} else {
//				System.out.println(count + "  " + (char) bytes[i - 1]);
				result += count + String.valueOf((char) bytes[i - 1]);
					pos = bytes[i];
					count = 1;
			}

		}
		return result;
	}
}
