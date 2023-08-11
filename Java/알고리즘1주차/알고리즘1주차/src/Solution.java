import java.util.Scanner;
class Solution1_1 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[10];
			int m = -1;
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			for (int j = 0; j < 10; j++) {
				if(arr[j] > m)
					m = arr[j];
			}
			System.out.println("#"+test_case+" "+m);
		}
	}
}