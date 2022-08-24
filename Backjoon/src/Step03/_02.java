package Step03;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 2번 : 구구단
 */
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b+c);
		}
	}
}
