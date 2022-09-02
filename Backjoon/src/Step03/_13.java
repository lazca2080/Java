package Step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 박종협
 * 내용 : 백준 3단계 13번 : 더하기 사이클
 */
public class _13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N;
		int nN = 0;
		int count = 0;
		while(N != nN) {
			nN = a;
			count ++;
			if(N < 10) {
			N =	N*10+N;
			}else {
			N = N%10*10+((N/10+N%10))%10;
			}
		}
		if(N == 0) {
			count ++;
		}
		System.out.println(count);
	}
}
