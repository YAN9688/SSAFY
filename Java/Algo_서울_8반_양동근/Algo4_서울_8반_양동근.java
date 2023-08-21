import java.util.Scanner;

public class Algo4_서울_8반_양동근 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		방향전환 :반시계(하 우 상 좌), 델타 정의
		int[] dr = { 1, 0, -1, 0 };
		int[] dc = { 0, 1, 0, -1 };
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
//			N입력 받고 배열 생성, 변수 선언 및 초기화
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			int r = 0;
			int c = 0;
			int d = 0;
			int cnt = 1;
//			N*N까지 반복
			while (cnt <= N * N) {
				int nr = r + dr[d];
				int nc = c + dc[d];
//				다음 위치 미리 탐색 후, 만약 인덱스를 벗어나거나 이미 값이 있는 경우 방향 전환
				if (nr >= N || nr < 0 || nc >= N || nc < 0 || map[nr][nc] > 0) {
//					4방향이므로, 나머지연산을 통해 반복가능
					d = (d + 1) % 4;
					nr = r + dr[d];
					nc = c + dc[d];
				}
//				배열을 채우고, 다음 위치로 이동 
				map[r][c] = cnt++;
				r = nr;
				c = nc;
			}
			System.out.println("#" + tc);
			for (r = 0; r < N; r++) {
				for (c = 0; c < N; c++) {
					System.out.print(map[r][c] + " ");
				}
				System.out.println("");
			}
		}
	}
}
