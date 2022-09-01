package Step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 박종협
 * 내용 : 백준 4단계 3번 : 나머지 두번째 방법
 */
public class _03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a%42;
		}
		Arrays.sort(arr);
		int cnum = arr[0];
		int count = 1;
		for(int x = 1; x<arr.length; x++) {
			if(cnum == arr[x]) {
				cnum = arr[x];
			}else {
				cnum = arr[x];
				count += 1;
			}
		}
		System.out.println(count);
	}
}
