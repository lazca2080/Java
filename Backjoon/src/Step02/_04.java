package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 4번 : 사분면 고르기
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 if(a>0 && b>0) {
			 System.out.println("1");
		 }else if(a<0 && b>0) {
			 System.out.println("2");
		 }else if(a<0 && b<0) {
			 System.out.println("3");			 
		 }else {
			 System.out.println("4");
		 }
	}
}
