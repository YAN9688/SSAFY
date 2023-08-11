import java.util.Scanner;

public class Test2 {

	// 절대값을 구하는 메서드 구현
	public static int myAbs(int num) {
		// 음수일 경우 부호를 바꿔줌
		if (num < 0)
			num = -num;
		return num;

	}

	public static void main(String[] args) {

		// 배열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력 후, 배열을 입력하세요:");
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 두 번째로 큰 수 second 찾기
		int second = -101;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if (arr[i] < arr[j])
					cnt++;
			}
			// 자신보다 큰 수가 1개일 때 그 값을 반환(중복된 수가 없음을 가정하였으므로)
			if (cnt == 1)
				second = arr[i];
		}

		// 가장 작은 수 min찾기
		int min = 101;
		for (int i = 0; i < N; i++) {
			// 이전 최소값보다 더 작을경우 최소값을 갱신
			if (min > arr[i])
				min = arr[i];
		}

		// 두 수의 곱의 절대값(위에서 정의한 myAbs 활용)
		int x = -1;
		x = second * min;
		x = myAbs(x);

		// 출력
		System.out.println("두번째로 큰 값 : " + second + ", 최소값 : " + min + "\n두수의 곱의 절댓값 : " + x);

	}

}
