import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int[] arr = new int[100];
			int move = sc.nextInt();

			int diff = 0;
			int max = -1;
			int min = 101;

			int min_i = 0;
			int max_i = 0;
//			System.out.println(move);
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
//			입력완료

			while (move > 0) {
				for (int i = 0; i < 100; i++) {
					if (max < arr[i]) {
						max = arr[i];
						max_i = i;
					}

					if (min > arr[i]) {
						min = arr[i];
						min_i = i;
					}
				}
				if (max - min <= 1)
					break;
				move--;
				arr[max_i] -= 1;
				arr[min_i] += 1;

			}
			diff = max - min;

			System.out.println("#" + test_case + " " + diff);
		}
	}
}