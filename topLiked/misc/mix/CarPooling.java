package mix;

import java.util.Arrays;
import java.util.Comparator;

public class CarPooling {

	public boolean carPooling(int[][] trips, int capacity) {

		if (trips == null || trips.length == 0) {
			return true;
		}

		if (capacity <= 0) {
			return false;
		}

		int[][] pickUps = new int[trips.length][2];
		int[][] drops = new int[trips.length][2];

		for (int i = 0; i < trips.length; i++) {
			pickUps[i][0] = trips[i][1];
			pickUps[i][1] = trips[i][0];
			drops[i][0] = trips[i][2];
			drops[i][1] = trips[i][0];
		}

		Arrays.sort(pickUps, new Comparator<int[]>() {

			public int compare(int[] a1, int[] a2) {

				return a1[0] - a2[0];
			}

		});
		Arrays.sort(drops, new Comparator<int[]>() {

			public int compare(int[] a1, int[] a2) {

				return a1[0] - a2[0];
			}

		});
		int noOfPassengers = 0;
		int dropLocation = 0;
		int i = 0;
		while (i < pickUps.length && dropLocation < pickUps.length) {
			if (pickUps[i][0] < drops[dropLocation][0]) {
				noOfPassengers += pickUps[i][1];
				i++;
			} else {
				noOfPassengers -= drops[dropLocation][1];
				dropLocation++;
			}
			if (noOfPassengers > capacity) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] trips = {{3,5,9},{4,2,5},{3,4,6},{9,1,4},{5,6,8},{5,4,6}};

		int capacity = 14;

		CarPooling obj = new CarPooling();

		System.out.println(obj.carPooling(trips, capacity));
	}

}
