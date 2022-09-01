package Step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 박종협
 * 내용 : 백준 4단계 5번 : OX퀴즈
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		int count = 0;
		int acount = 0;
		
		for(int x = 0; x<arr.length; x++) {
			String a = sc.next();
			arr[x] = a;
			for(int y = 0; y<arr[x].length(); y++) {
				char[] arr1 = new char[arr[x].length()];
				arr1[y] = arr[x].charAt(y);
				if(arr1[0] == arr1[y]) {
					arr1[0] = arr1[y];
					count++;
					acount +=count;
				}else {
					count = 0;
					
				}
				
			}
			System.out.println(acount);
		}
		
		
		
	}
	

}
