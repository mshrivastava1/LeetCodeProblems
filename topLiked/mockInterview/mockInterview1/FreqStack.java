package mockInterview1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;



public class FreqStack {

	PriorityQueue<Integer> queue;
	Map<Integer, Integer> map;
	List<Integer> list;
	public FreqStack() {
        
		this.map = new HashMap<Integer,Integer>();
		this.queue = new PriorityQueue<>((o1,o2)->map.get(o2)-map.get(o1));
		this.list = new ArrayList<Integer>();
    }
    
    public void push(int x) {
       
    	this.map.put(x, map.getOrDefault(x, 0)+1);
    	queue.add(x);
    	this.list.add(x);
    }
    
    public int pop() {
        
    	if(this.list.isEmpty()){
    		return -1;
    	}

    		int x = this.queue.poll();
        	
        	this.map.put(x, map.get(x)-1);
        	
        	this.queue.offer(x);
        	
        	for(int i=this.list.size()-1;i>=0;i--){
        		if(this.list.get(i)==x){
        			this.list.remove(i);
        		}
        	}
    	return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FreqStack stack = new FreqStack();
		
		stack.push(5);
		stack.push(7);
		stack.push(5);
		stack.push(7);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
  