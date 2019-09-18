package mockInterviewTelephonic11.linkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class RemoveNode {

	ListNode head;

	public ListNode removeElements(ListNode head, int val) {

		if(head==null){
			return head;
		}
		
		
		
		while(head.val == val){
			 head = head.next;
		}
		ListNode temp = head;
		//temp = temp.next;
		while(temp.next!=null){
			
			if(temp.next.val==val){
				if(temp.next.next==null){
					temp.next=null;
					break;
				}else{
					temp.next = temp.next.next;
				}
			}
			temp = temp.next;
		}
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
