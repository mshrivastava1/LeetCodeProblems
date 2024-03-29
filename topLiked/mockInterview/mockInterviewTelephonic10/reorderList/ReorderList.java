package mockInterviewTelephonic10.reorderList;

import java.util.ArrayList;
import java.util.List;

class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class ReorderList {

	ListNode head;
	 public void reorderList(ListNode head) {
	        if (head == null) {
	            return;
	        }
	        
	        // Find the middle node
	        ListNode slow = head, fast = head.next;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        
	        // Reverse the second half
	        ListNode head2 = reverse(slow.next);
	        slow.next = null;
	        
	        // Link the two halves together
	        while (head != null && head2 != null) {
	            ListNode tmp1 = head.next;
	            ListNode tmp2 = head2.next;
	            head2.next = head.next;
	            head.next = head2;
	            head = tmp1;
	            head2 = tmp2;
	        }
	    }
	    
	    private ListNode reverse(ListNode n) {
	        ListNode prev = null;
	        ListNode cur = n;
	        while (cur != null) {
	            ListNode tmp = cur.next;
	            cur.next = prev;
	            prev = cur;
	            cur = tmp;
	        }
	        return prev;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReorderList list = new ReorderList();
		
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next= new ListNode(4);
		
		list.reorderList(list.head);
		
	}

}
