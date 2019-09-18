package mockInterviewTelephonic1;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class ReverseLinkedList {

	public ListNode head;

	public ListNode reverseList(ListNode head) {

		if(head==null || head.next==null){
			return head;
		}
		
		ListNode temp = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(temp!=null){
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp=next;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedList list = new ReverseLinkedList();
		
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
	}

}
