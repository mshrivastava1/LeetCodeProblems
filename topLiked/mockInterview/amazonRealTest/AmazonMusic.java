package amazonRealTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class AmazonMusic {

	public ArrayList<Integer> IDsOfSongs(int rideDuration, ArrayList<Integer> songDurations) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(songDurations.isEmpty() || rideDuration<=30){
			return result;
		}
		
		int target = rideDuration - 30;
		int max = 0;
	
		
		PriorityQueue<int[]> pQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(songDurations.get(o2[0])>songDurations.get(o1[0]) && songDurations.get(o2[0])>songDurations.get(o1[1])){
					return songDurations.get(o1[0]) - songDurations.get(o2[0]);
				}else if(songDurations.get(o2[1])>songDurations.get(o1[0]) && songDurations.get(o2[1])>songDurations.get(o1[1])){
					return songDurations.get(o1[1]) - songDurations.get(o2[0]);
				}else if(songDurations.get(o1[1])>songDurations.get(o2[0]) && songDurations.get(o1[1])>songDurations.get(o2[1])){
					return (songDurations.get(o2[0]) - songDurations.get(o1[1]));
				}else{
					return (songDurations.get(o2[0]) - songDurations.get(o1[0]));
				}
			}
		});
		for(int i=0;i<songDurations.size()-1;i++){
			for(int j=i+1;j<songDurations.size();j++){
				
				int sum = songDurations.get(i) + songDurations.get(j);
				if(sum<=target){
					if(max<=sum){
						max = Math.max(sum, max);
						int[] pair = {i,j};
						pQueue.add(pair);
					}
					
				}
			}
		}
		
		if(!pQueue.isEmpty()){
			int[] pair = pQueue.poll();
			result.add(pair[0]);
			result.add(pair[1]);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> songDurations = new ArrayList<Integer>();
		songDurations.add(100);
		songDurations.add(180);
		songDurations.add(40);
		songDurations.add(120);
		songDurations.add(10);
		
	/*	songDurations.add(20);
		songDurations.add(70);
		songDurations.add(90);
		songDurations.add(30);
		songDurations.add(60);
		songDurations.add(110);*/
		
		int rideDuration = 250;
		
		AmazonMusic obj = new AmazonMusic();
		
		obj.IDsOfSongs(rideDuration, songDurations);
		
	}

}
