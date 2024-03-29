package mockInterviewOnlineTest4;

import java.util.Arrays;
import java.util.HashSet;

import javafx.scene.control.Cell;

public class PrisonerAfterNdays {

	public int[] prisonAfterNDays(int[] cells, int N) {
		if (cells == null || cells.length == 0 || N <= 0)
			return cells;
		boolean hasCycle = false;
		int cycle = 0;
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int[] next = nextDay(cells);
			String key = Arrays.toString(next);
			if (!set.contains(key)) { // store cell state
				set.add(key);
				cycle++;
			} else { // hit a cycle
				hasCycle = true;
				break;
			}
			cells = next;
		}
		if (hasCycle) {
			N %= cycle;
			for (int i = 0; i < N; i++) {
				cells = nextDay(cells);
			}
		}
		return cells;
	}

	private int[] nextDay(int[] cells) {
		int[] tmp = new int[cells.length];
		for (int i = 1; i < cells.length - 1; i++) {
			tmp[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
		}
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] cells = {0,1,0,1,1,0,0,1};
		int[] cells = { 0, 1, 0, 1, 1, 0, 0, 1 };
		int N = 1000000000;

		PrisonerAfterNdays obj = new PrisonerAfterNdays();

		System.out.println(obj.prisonAfterNDays(cells, N));
	}

}
