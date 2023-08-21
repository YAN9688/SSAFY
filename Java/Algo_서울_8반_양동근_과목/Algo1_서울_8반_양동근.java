import java.util.Scanner;

public class Algo1_서울_8반_양동근 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[][] map = new int[8][8];
			int r = 0;
			int c = 0;
			for (r = 0; r < 8; r++) {
				for (c = 0; c < 8; c++) {
					map[r][c] = sc.nextInt();
				}
			}
//			2차원 배열 순회
			int ans = 0;
			outer: for (r = 0; r < 8; r++) {
				for (c = 0; c < 8; c++) {
					int i = 1;
					int j = 1;
					int cnt_r = 1;
					int cnt_c = 1;
//					시작점이 0인경우 스킵
					if (map[r][c] == 0)
						continue;
//					시작점이 0이 아니면 반복문 시작
//					대각선을 배제하므로, 델타 대신 오른쪽-아래쪽 두 방향 직접 입력
//					오른쪽 먼저 탐색
					while (r + i < 8 && map[r + i][c] == 1) {
						i++;
						cnt_r++;
					}
//					바둑알이 6개인 경우를 배제해야 하므로, loop를 다 돌고 나서 5인지 확인
					if (cnt_r == 5) {
						ans = 1;
						break outer;
					}

//					같은 방식으로 아래쪽 탐색
					while (c + j < 8 && map[r][c + j] == 1) {
						j++;
						cnt_c++;
					}
					if (cnt_c == 5) {
						ans = 1;
						break outer;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
