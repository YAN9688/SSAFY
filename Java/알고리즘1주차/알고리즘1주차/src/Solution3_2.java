import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int cnt = 0;
			int[][] map = new int[N + 2][N + 2];

			for (int r = 1; r <= N; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 1; c <= N; c++) {
					map[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int[][] rowSum = new int[N + 2][N + 2];
			int[][] colSum = new int[N + 2][N + 2];

			for (int r = 1; r <= N; r++) {
				for (int c = 1; c <= N; c++) {
					rowSum[r][c] = rowSum[r][c - 1] + map[r][c];
					colSum[r][c] = colSum[r - 1][c] + map[r][c];
				}
			}

			for (int r = 1; r <= N; r++) {
				for (int c = 1; c <= N; c++) {
					if (map[r][c] == 1) {
						if (c + K <= N + 1 && map[r][c - 1] == 0 && map[r][c + K] == 0
								&& rowSum[r][c + K - 1] - rowSum[r][c] == K - 1) {
							cnt++;
						}
						if (r + K <= N + 1 && map[r - 1][c] == 0 && map[r + K][c] == 0
								&& colSum[r + K - 1][c] - colSum[r][c] == K - 1) {
							cnt++;
						}
					}
				}
			}

			System.out.println("#" + tc + " " + cnt);
		}
	}
}