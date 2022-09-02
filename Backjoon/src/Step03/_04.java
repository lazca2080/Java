package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 4번 : 영수증
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int total = 0;
		
		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			total +=(a*b);
		}
		if(total == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
