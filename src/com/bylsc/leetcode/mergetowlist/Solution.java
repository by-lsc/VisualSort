package com.bylsc.leetcode.mergetowlist;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * @author lsc
 * 
 */
public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode curr = new ListNode(0);
		ListNode head = curr ;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				curr.next = new ListNode(l1.val);
				l1 = l1.next;
			}else{
				curr.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if(l1 == null){
			curr.next = l2;
		}else{
			curr.next = l1;
		}
		return head.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(11);
		ListNode l2 = new ListNode(22);
		ListNode l3 = new ListNode(33);
		ListNode l4 = new ListNode(44);
		ListNode l5 = new ListNode(55);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		ListNode ll1 = new ListNode(23);
		ListNode ll2 = new ListNode(41);
		ListNode ll3 = new ListNode(35);
		ListNode ll4 = new ListNode(45);
		ListNode ll5 = new ListNode(56);
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;
		ll4.next = ll5;
		
		Solution s = new Solution();
		ListNode result = s.mergeTwoLists(l1, ll1);
		while(result != null){
			System.out.print(result.val + "  ");
			result = result.next;
		}
	}
}
