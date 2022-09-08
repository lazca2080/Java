package Step05;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int y = S.indexOf("a");
		
		if(y == -1) {
			System.out.println(-1);
		}else {
			System.out.println(y);
		}
		
	}
}
