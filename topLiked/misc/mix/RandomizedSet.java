package mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RandomizedSet {

	Map<Integer, Integer> map;
	List<Integer> list;
	java.util.Random rand;
	/** Initialize your data structure here. */
	public RandomizedSet() {

		this.map = new HashMap<Integer, Integer>();
		this.list = new ArrayList<Integer>();
		this.rand = new java.util.Random();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already
	 * contain the specified element.
	 */
	public boolean insert(int val) {
		
		if(this.map.containsKey(val)){
			return false;
		}
		
		this.map.put(val, this.list.size());
		this.list.add(val);
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the
	 * specified element.
	 */
	public boolean remove(int val) {
		if(!this.map.containsKey(val)){
			return false;
		}
		
		int loc = this.map.get(val);
		int last = this.list.get(this.list.size()-1);
		this.list.set(loc, last);
		this.map.put(last, loc);
		
		this.list.remove(this.list.size()-1);
		this.map.remove(val);
		
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {

		return this.list.get(rand.nextInt(list.size()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
