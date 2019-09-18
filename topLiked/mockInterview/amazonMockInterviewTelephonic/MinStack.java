package amazonMockInterviewTelephonic;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack;
	Stack<Integer> minStack;
	 public MinStack() {
	       
		 this.stack = new Stack<Integer>();
		 this.minStack = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        
	    	if(this.stack.isEmpty()){
	    		this.minStack.push(x);
	    		this.stack.push(x);
	    	}else{
	    		this.stack.push(x);
	    		if(this.minStack.peek()>x){
	    			this.minStack.push(x);
	    		}else{
	    			this.minStack.push(this.minStack.peek());
	    		}
	    	}
	    }
	    
	    public void pop() {
	        
	    	if(this.stack.isEmpty() || this.minStack.isEmpty()){
	    		return;
	    	}
	    	
	    	this.stack.pop();
	    	this.minStack.pop();
	    }
	    
	    public int top() {
	        
	    	if(this.stack.isEmpty()){
	    		return Integer.MIN_VALUE;
	    	}
	    	
	    	return this.stack.peek();
	    }
	    
	    public int getMin() {
	        
	    	if(this.minStack.isEmpty()){
	    		return Integer.MIN_VALUE;
	    	}
	    	
	    	return this.minStack.peek();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());   
		minStack.pop();
		System.out.println(minStack.top());  
		System.out.println(minStack.getMin());
	}

}
