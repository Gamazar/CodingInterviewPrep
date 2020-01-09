package Main;

import Main.MainSolution.ListNode;

public class KthToLastElement {
	
	public ListNode kthToLastElement(ListNode head, int n) {
		if(head == null) return null;
		
		ListNode current = head;
		ListNode follower = head;
		
		for(int i = 0; i<n;i++) {
			if(current == null) return null;
			current = current.next;
		}
		
		while(current.next!=null) {
			current = current.next;
			follower = follower.next;
		}
		return follower;
		
	}
}
