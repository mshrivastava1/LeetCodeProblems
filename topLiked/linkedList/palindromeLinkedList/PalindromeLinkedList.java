package palindromeLinkedList;

import java.util.Stack;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int x){
		this.val = x;
		this.next = null;
	}
}
public class PalindromeLinkedList {

/*	public boolean isPalindrome(ListNode head){
		
		if(head==null){
			return true;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		ListNode temp = head;
		
		while(temp!=null){
			stack.push(temp.val);
			temp = temp.next;
		}
		
		temp = head;
		
		while(temp!=null){
			if(temp.val!=stack.pop()){
				return false;
			}
			temp = temp.next;
		}
		
		return true;
	}*/
	
	public boolean isPalindrome(ListNode head){
	
		if(head==null){
			return true;
		}
		
		ListNode slow = head;
		ListNode fast  = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast!=null){
			slow = slow.next;
		}
	
		slow = reverse(slow);
		fast = head;
		while(slow!=null && fast!=null){
			if(slow.val!=fast.val){
				return false;
			}
			slow = slow.next;
			fast=fast.next;
		}
		
		return true;
	}
	
	public ListNode reverse(ListNode head){
		
		ListNode prev = null;
		ListNode next = null;
		
		ListNode temp = head;
		
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

		PalindromeLinkedList plindromeList = new PalindromeLinkedList();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);
		
		System.out.println(plindromeList.isPalindrome(head));
	}

}
