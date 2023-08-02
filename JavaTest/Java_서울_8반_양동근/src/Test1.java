import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		// 스캐너를 활용하여 정수N 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 N을 입력하세요");
		int N = sc.nextInt();

		// N을 홀수로 가정하였으므로, (N+1)/2를 경계로 나눠 모양 구현
		// 별의 갯수가 증가하는 구간
		for (int i = 0; i < (N + 1) / 2; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		// 별의 갯수가 감소하는 구간
		for (int i = (N + 1) / 2; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
