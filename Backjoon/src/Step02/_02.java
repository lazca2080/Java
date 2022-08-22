package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 2번 : 시험 성적
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 
		 	if(a<=100 && a>=90) {
		 		System.out.println("A");
		 	}else if(a<90 && a>=80) {
		 		System.out.println("B");
		 	}else if(a<80 && a>=70) {
		 		System.out.println("C");
		 	}else if(a<70 && a>=60) {
		 		System.out.println("D");
		 	}else {
		 		System.out.println("F");
		 	}
	}
}
