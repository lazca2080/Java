package Step05;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/26
 * 이름 : 박종협
 * 내용 : 백준 5단계 1번 : 정수 N개의 합
 */
public class Test {
	public static long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
