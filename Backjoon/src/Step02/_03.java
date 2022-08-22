package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 3번 : 윤년
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a%4==0) {
				if(a%400==0 || a%100!=0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
					System.out.println("0");
			}
	}
}
