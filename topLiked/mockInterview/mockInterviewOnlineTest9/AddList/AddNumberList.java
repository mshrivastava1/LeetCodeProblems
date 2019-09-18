package mockInterviewOnlineTest9.AddList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class AddNumberList {

	ListNode l1;
	ListNode l2;

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if(l1==null && l1==null){
			return l1;
		}
		
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		
		long num1 = 0;
		long num2 = 0;
		ListNode temp = l1;
		
		while(temp!=null){
			
			num1=num1*10 + temp.val;
			temp = temp.next;
		}
		
		temp = l2;
		
		while(temp!=null){
			num2 = num2*10 + temp.val;
			temp = temp.next;
		}
		
		ListNode result = null;
		temp = null;
		
		long resultNum = num1+num2;
		
		if(resultNum==0){
			return (new ListNode(0));
		}
		while(resultNum>0){
			
			int newVal = (int) (resultNum%10);
			resultNum = resultNum/10;
			
			ListNode newNode = new ListNode(newVal);
			newNode.next = result;
			result = newNode;
		}
	
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddNumberList num = new AddNumberList();
		
		num.l1 = new ListNode(3);
		num.l1.next = new ListNode(9);
		num.l1.next.next = new ListNode(9);
		num.l1.next.next.next = new ListNode(9);
		num.l1.next.next.next.next = new ListNode(9);
		num.l1.next.next.next.next.next = new ListNode(9);
		num.l1.next.next.next.next.next.next = new ListNode(9);
		num.l1.next.next.next.next.next.next.next = new ListNode(9);
		num.l1.next.next.next.next.next.next.next.next = new ListNode(9);
		num.l1.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		
		num.l2 = new ListNode(7);
	/*	num.l2.next = new ListNode(6);
		num.l2.next.next = new ListNode(4);*/
		
		
		num.addTwoNumbers(num.l1, num.l2);
	}

}
