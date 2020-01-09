package Main;

import Main.MainSolution.ListNode;

public class ReverseLinkedList {
	
	public ListNode reverseLinkedList(ListNode head) {
		if(head ==null) return head;
		
		ListNode previous = null;
		ListNode current = head;
		ListNode next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

}
