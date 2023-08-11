import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				String[] input = br.readLine().trim().split(" ");
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(input[j]);
				}
			}
			int r = 0;
			outerLoop: for (int i = 0; i < 9; i++) {
				int[] temp = new int[9];
				for (int j = 0; j < 9; j++) {
					temp[j] = arr[i][j];
				}
				if (!all(temp))
					break outerLoop;
				for (int j = 0; j < 9; j++) {
					temp[j] = arr[j][i];
				}
				if (!all(temp))
					break outerLoop;
				for (int j = 0; j < 9; j++) {
					temp[j] = arr[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3];
				}
				if (!all(temp))
					break outerLoop;
				r++;
			}
			System.out.println("#" + tc + " " + (r == 9 ? 1 : 0));
		}
	}

	static boolean all(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (int num : a) {
			if (!set.add(num)) {
				return false;
			}
		}
		return true;
	}
}
