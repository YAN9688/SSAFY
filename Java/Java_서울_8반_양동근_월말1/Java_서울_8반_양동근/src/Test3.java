
public class Test3 {
	public static void main(String[] args) {
		// 변수 선언
		int m = 10000;
		int p = 4510;
		int c_1000 = 0;
		int c_500 = 0;
		int c_100 = 0;
		int c_10 = 0;
		int sum = 0;
		int c = 0;
		int c_temp = 0;

		// 최종 출력을 위해 거스름돈c와 남은거스름돈c_temp 따로 할당
		c = m - p;
		c_temp = c;

		// 1000원짜리 거스름돈
		while (c_temp >= 1000) {
			c_temp -= 1000;
			c_1000++;
		}
		// 500원짜리 거스름돈
		while (c_temp >= 500) {
			c_temp -= 500;
			c_500++;
		}
		// 100원짜리 거스름돈
		while (c_temp >= 100) {
			c_temp -= 100;
			c_100++;
		}
		// 10원짜리 거스름돈
		while (c_temp >= 10) {
			c_temp -= 10;
			c_10++;
		}

		// 총개수 구하기
		sum = c_1000 + c_500 + c_100 + c_10;

		// 출력
		System.out.println("투입금액:" + m + "\n상품금액:" + p + "\n거스름돈:" + c);
		System.out.println("--------------------");
		System.out.println("1000원:" + c_1000 + "\n500원:" + c_500 + "\n100원:" + c_100 + "\n10원:" + c_10);
		System.out.println("\n\n 총 개수:" + sum);
	}

}
