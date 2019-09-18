package removeElement;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class RemoveElement {

	public ListNode removeElements(ListNode head, int val) {

		if(head==null){
			return head;
		}
		
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		ListNode prev = fakeHead;
		ListNode current = head;
		
		while(current!=null){
			
			if(current.val==val){
				prev.next = current.next;
				current = current.next;
			}else{
				prev = current;
				current = current.next;
			}
		}
		
		return fakeHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
