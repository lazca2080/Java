package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 박종협
 * 내용 : 사용자로부터 입력받은 세 개의 부동소수점을 합하기
 */
public class p67_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("첫 번째 수를 입력하세요. : ");
		a = sc.nextDouble();
		
		System.out.print("두 번째 수를 입력하세요. : ");
		b = sc.nextDouble();		
		
		System.out.print("세 번째 수를 입력하세요. : ");
		c = sc.nextDouble();
		
		double sum = a + b + c;
		System.out.println("세 부동소수점의 합은 : "+sum+"입니다.");
		
	}

}
