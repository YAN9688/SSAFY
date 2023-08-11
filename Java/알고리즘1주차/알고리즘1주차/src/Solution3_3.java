import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int tc = 0;
		while (tc < 10) {
			tc = sc.nextInt();
			int[][] map = new int[100][102];
			for (int r = 0; r < 100; r++) {
				for (int c = 1; c <= 100; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			int t_c = 0;

			for (int c = 1; c <= 100; c++) {
				if (map[99][c] == 2) {
					t_c = c;
					break;
				}
			}
			int r = 99;
            while (r > 0) {

                if (map[r][t_c - 1] == 1) {
                    int i = 0;
                    while (true) {
                        i++;
                        if (map[r][t_c - i] == 0)
                            break;
                    }
                    t_c = t_c - (i - 1);
                    r--;
                } else if (map[r][t_c + 1] == 1) {
                    int i = 0;
                    while (true) {
                        i++;
                        if (map[r][t_c + i] == 0)
                            break;
                    }
                    t_c = t_c + (i - 1);
                    r--;
                } else
                    r--;
            }
            int fc = t_c - 1;
            System.out.println("#" + tc + " " + fc);
        }
    }
}

