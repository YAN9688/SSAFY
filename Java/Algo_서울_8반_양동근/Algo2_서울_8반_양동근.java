import java.util.Arrays;
import java.util.Scanner;

public class Algo2_서울_8반_양동근 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		월당 일수를 담은 배열 생성. 첫칸을 0으로 두면서 out index 방지 
		int[] ms = { 0, 65, 66, 64, 66, 62, 62, 63, 56, 65, 62, 56 };
//		누적합 배열로 변경
		for (int i = 1; i < ms.length; i++) {
			ms[i] += ms[i - 1];
		}
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
//			입력값 받기 및 변수 선언
			String case1 = sc.next();
			String case2 = sc.next();
			int mon1 = 0;
			int day1 = 0;
			int mon2 = 0;
			int day2 = 0;
//			next로 받은 문자열을 '/'을 기준으로 mon와 day 나누기
			int i = 0;
//			첫번째 문자열 처리
//			'/'위치 탐색
			for (i = 0; i < case1.length(); i++) {
				if (case1.charAt(i) == '/')
					break;
			}
//			월,일이 십의 단위로 넘어가는 케이스를 확인해보기
			if (i == 1)
				mon1 = case1.charAt(0) - 48;
			else
				mon1 = 10 * (case1.charAt(0) - 48) + case1.charAt(1) - 48;

			if ((case1.length() - i) == 2)
				day1 = case1.charAt(i + 1) - 48;
			else
				day1 = 10 * (case1.charAt(i + 1) - 48) + case1.charAt(i + 2) - 48;

//			같은 방법으로 두번째 문자열 처리
			for (i = 0; i < case2.length(); i++) {
				if (case2.charAt(i) == '/')
					break;
			}
			if (i == 1)
				mon2 = case2.charAt(0) - 48;
			else
				mon2 = 10 * (case2.charAt(0) - 48) + case2.charAt(1) - 48;

			if ((case2.length() - i) == 2)
				day2 = case2.charAt(i + 1) - 48;
			else
				day2 = 10 * (case2.charAt(i + 1) - 48) + case2.charAt(i + 2) - 48;
//		     누적합 배열을 이용하여, 주어진 날짜가 1년 중 몇번째 날인지 확인하고 둘의 차이를 반환
			int days1 = ms[mon1 - 1] + day1;
			int days2 = ms[mon2 - 1] + day2;
			int diff = days2 - days1;
			System.out.println("#" + tc + " " + diff);
		}
	}
}
