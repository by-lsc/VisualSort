package com.bylsc.leetcode.oddevenlinklist;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 * @author lsc
 *
 */
public class Solution {

	public ListNode oddEvenList(ListNode head) {
		if (head == null )
			return null;
		ListNode odd = new ListNode(0);  //奇数链表
        ListNode oddCurr = odd;          //奇数链表的链表尾节点
        ListNode even = new ListNode(0); //偶数链表
        ListNode evenCurr = even;        //偶数链表的链表尾节点
        
        ListNode tmp = head;
        int counter = 0;
        while (tmp != null) {
            counter++;
            if (counter % 2 != 0) {
                oddCurr.next = new ListNode(tmp.val);
                oddCurr = oddCurr.next;
            } else {
                evenCurr.next = new ListNode(tmp.val);
                evenCurr = evenCurr.next;
            }
            tmp = tmp.next;
        }
        oddCurr.next = even.next; //偶数链表接在奇数链表后面
        return odd.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
		Solution s= new Solution();
		ListNode result = s.oddEvenList(l1);
		while(result != null){
			System.out.print(result.val + "  ");
			result = result.next;
		}
	}
}
