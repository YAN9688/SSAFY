import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 0;
        while (tc < 10) {
            tc = Integer.parseInt(br.readLine());
            int[][] map = new int[100][102];
            for (int r = 0; r < 100; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int c = 1; c <= 100; c++) {
                    map[r][c] = Integer.parseInt(st.nextToken());
                }
            }
			int r = 99;
			int c;
			for (c = 1; c <= 100; c++) {
				if (map[99][c] == 2)
					break;
			}
			while (r > 0) {
				if (map[r][c - 1] == 1) {
					while (map[r][c - 1] == 1)
						c--;
				} else if (map[r][c + 1] == 1) {
					while (map[r][c + 1] == 1) {
						c++;
					}
				}
				r--;
			}
			System.out.println("#" + tc + " " + (c - 1));
		}
	}
}
