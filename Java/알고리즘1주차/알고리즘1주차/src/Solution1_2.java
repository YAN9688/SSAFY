import java.util.Scanner;

class Solution1_2 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int avg = 0;
			int sum = 0;
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < 10; i++) {
				sum += arr[i];
			}
			avg = (int) Math.round(sum / 10.0);
			System.out.println("#" + test_case + " " + avg);
		}
	}
}