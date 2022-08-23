package Step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 박종협
 * 내용 : 백준 2단계 5번 : 알람 시계
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int h = sc.nextInt();
		 int m = sc.nextInt();
		 
		 int x = m-45;
		 
		 if(h>0 && x>=0) {
			 System.out.print(h+" ");
			 System.out.println(x);
		 }else if(h>0 && x<0) {
			 System.out.print(h-1+" ");
			 System.out.println(x+60);			 
		 }else if(h<=0 && x>=0) {
			 System.out.print(h +" ");
			 System.out.println(x);
		 }else if(h<=0 && x<0) {
			 System.out.print((h+24)-1 +" ");
			 System.out.println(x+60);
		 }else {
		 }
	}
}
