package copyListWithRandomPointer;

class Node {
	int val;
	Node next;
	Node random;

	Node() {

	}

	Node(int x, Node next, Node random) {
		this.val = x;
		this.next = next;
		this.random = random;
	}
}

public class RandomPointerList {

	public Node copyRandomList(Node head) {

		Node fakeHead = new Node(0,null,null);
		Node temp = fakeHead;
		Node node = head;
		
		while(node!=null){
			temp.next = new Node(node.val,node.next,node.random);
			node = node.next;
			temp = temp.next;
		}
		
		return fakeHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
