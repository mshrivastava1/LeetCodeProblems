package mockInterviewTelephonic3;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class SwapPairs {

	ListNode head;
	public ListNode swapPairs(ListNode head) {

		if(head==null||head.next==null){
			return head;
		}
		
		return reverseInGroup(head,2);
	}
	
	public ListNode reverseInGroup(ListNode head, int size){
		
		ListNode temp = head;
		ListNode next = null;
		ListNode prev = null;
		int count =0;
		while(count<size && temp!=null){
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			count ++;
		}
		
		if(temp!=null){
			head.next = reverseInGroup(temp, size);
		}
		
		return prev;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
