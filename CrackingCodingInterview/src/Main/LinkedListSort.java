package Main;

import Main.MainSolution.ListNode;

public class LinkedListSort {

    public ListNode sortList(ListNode head) {
        
    	if(head == null || head.next == null) return head;
    	
    	ListNode firstEnd = head;
    	ListNode slow = head;
    	ListNode fast = head;
    	
    	while(fast != null && fast.next !=null) {
    		firstEnd = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	
    	firstEnd.next = null;
    	
    	ListNode left_side = sortList(head); //We do this here because we set firstEnd.next = null
    										//So, it will modify head's first half next to null, so it's not the full list.
    	
    	ListNode right_side = sortList(slow);
    	
    	
    	return merge(left_side,right_side);
    }
    
    private ListNode merge(ListNode left, ListNode right) {
    	
    	ListNode sorted = new ListNode(0);
    	ListNode current = sorted;
    	
    	while(left!=null && right !=null) {
    		if(left.val < right.val) {
    			current.next = left;
    			left = left.next;
    		}
    		else {
    			current.next = right;
    			right = right.next;
    		}
    		current = current.next;
    	}
    	if(left !=null) {
    		current.next = left;
    	}
    	if(right != null) current.next = right;
    	
    	return sorted.next;
    }
}
