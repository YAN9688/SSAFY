import java.util.Scanner;

public class Algo3_서울_8반_양동근 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
//			입력 받아서 배열 만들기
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int ans = 0;
//			배열의 i번째마다, 배열 전체를 순회. 
//			arr[i]보다 큰 수를 만날때마다 cnt를 증가하여 arr[i]보다 큰 수의 갯수 찾기
			for (int i = 0; i < N; i++) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i] < arr[j])
						cnt++;
				}
//			수의 중복이 없다고 가정하였으므로, 보다 큰 수가 2개인 경우 정답으로 반환후 break
				if (cnt == 2) {
					ans = arr[i];
					break;
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
