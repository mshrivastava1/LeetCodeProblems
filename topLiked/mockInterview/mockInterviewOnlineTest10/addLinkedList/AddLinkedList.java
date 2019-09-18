package mockInterviewOnlineTest10.addLinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class AddLinkedList {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if(l1==null && l2==null){
			return null;
		}
		
		if(l1==null){
			return l2;
		}
		
		if(l2==null){
			return l1;
		}
		
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		
		ListNode result = null;
		ListNode temp = null;
		
		int sum = 0;
		int carry = 0;
		while(temp1!=null || temp2!=null){
			
			sum = carry+(temp1==null?0:temp1.val) + (temp2==null?0:temp2.val);
			carry = sum/10;
			
			sum = sum%10;
			
			if(result==null){
				result = new ListNode(sum);
				temp = result;
			}else{
				temp.next = new ListNode(sum);
				temp=temp.next;
			}
			temp1= temp1.next;
			temp2 = temp2.next;
			
		}
		if(carry>0){
			temp.next = new ListNode(carry);
		}
		
		result = reverse(result);
		temp = result;
		while(temp!=null){
			System.out.println(temp.val);
		}
		
		return result;
	}

	public ListNode reverse(ListNode head){
		
		if(head==null){
			return head;
		}
		
		ListNode prev = null;
		ListNode temp = head;
		ListNode next = null;
		
		while(temp!=null){
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
