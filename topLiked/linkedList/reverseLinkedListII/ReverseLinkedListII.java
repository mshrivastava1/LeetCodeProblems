package reverseLinkedListII;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class ReverseLinkedListII {

	ListNode head;

	public ListNode reverseBetween(ListNode head, int m, int n) {
		
		if(head==null){
			return head;
		}
		
		ListNode fakeNode = new ListNode(0);
		fakeNode.next = head;
		ListNode prev = fakeNode;
		ListNode current = fakeNode.next;
		
		int i= 1;
		
		while(i<m){
			prev = current;
			current = current.next;
			i++;
		}
		
		ListNode node = prev;
		
		while(i<=n){
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current.next = next;
		}
		
		node.next.next = current;
		node.next = prev;
		
		return fakeNode.next;
	}
	
	
	public ListNode reverse(ListNode head){
		
		ListNode next = null;
		ListNode prev = null;
		ListNode current = head;
		
		
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static void main(String[] arg){
		ReverseLinkedListII list = new ReverseLinkedListII();
		
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next = new ListNode(4);
		list.head.next.next.next.next = new ListNode(5);
		
		list.head = list.reverseBetween(list.head, 2, 4);
		
		
	}
}
