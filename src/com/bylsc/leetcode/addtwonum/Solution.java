package com.bylsc.leetcode.addtwonum;

public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		int sum = l1.val + l2.val;
		int n = 0;
		if (sum >= 10) {
			n = 1;
		}
		ListNode result = new ListNode(sum % 10);
		result.next = addTwoNumbersFlag(l1.next, l2.next, n);
		return result;
	}

	public static ListNode addTwoNumbersFlag(ListNode l1, ListNode l2, int n) {
		// 处理最后一步

		// if(l1 == null ) return l2;
		// if(l2 == null ) return l1;
		int v1 = 0;
		int v2 = 0;
		if(l1 == null && l2 != null /*&& n == 1*/){
			v2 = l2.val;
		}
		if(l1 != null && l2 == null /*&& n == 1*/){
			v2 = l1.val;
		}
		if(l1 == null && l2 == null && n == 1)
			return new ListNode(n);
		if (l1 == null && l2 == null)
			return null;
		if(l1 !=null & l2!= null){
			v1 = l1.val;
			v2 = l2.val;
		}
		ListNode result = null;
		int sum = v1 + v2 + n;
		result = new ListNode(sum % 10);
		n = 0;
		if ((sum +n) >= 10) {
			n = 1;
		}
		result.next = addTwoNumbersFlag(l1 == null?null:l1.next, l2 == null?null:l2.next, n);

		return result;
	}

	public static void main(String[] args) {
		// System.out.println(10%10);
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(0);
//		 ListNode l13 = new ListNode(3);
		l11.next = l12;
//		 l12.next = l13;

		ListNode l21 = new ListNode(9);
//		 ListNode l22 = new ListNode(9);
//		 ListNode l23 = new ListNode(4);
//		 l21.next = l22;
//		 l22.next = l23;
		ListNode l = addTwoNumbers(l11, l21);
		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}
}
