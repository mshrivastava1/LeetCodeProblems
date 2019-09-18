package mockInterviewTelephonic7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashMap {

		List<int[]> map;
	 	public CustomHashMap() {
	        
	 		map = new ArrayList<int[]>();
	    }
	    
	    /** value will always be non-negative. */
	    public void put(int key, int value) {
	    	
	    	boolean isPresent = false;
	    	for(int i=0;i<map.size();i++){
	    		int[] pair = map.get(i);
	    		if(pair[0]==key){
	    			pair[1]=value;
	    			isPresent = true;
	    		}
	    	}
	    	
	    	if(!isPresent){
	    		int[] newPair = new int[2];
	    		newPair[0] = key;
	    		newPair[1] = value;
	    		map.add(newPair);
	    	}
	    }
	    
	    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	    public int get(int key) {
	        
	    	for(int i=0;i<map.size();i++){
	    		int[] pair = map.get(i);
	    		if(pair[0]==key){
	    			return pair[1];
	    		}
	    	}
	    	
	    	return -1;
	    }
	    
	    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
	    public void remove(int key) {
	       
	    	boolean isPresent = false;
	    	int index = -1;
	    	for(int i=0;i<map.size();i++){
	    		int[] pair = map.get(i);
	    		if(pair[0]==key){
	    			index = i;
	    			break;
	    		}
	    	}
	    	
	    	if(index>=0){
	    		this.map.remove(index);
	    	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
