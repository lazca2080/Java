package ProgramingTest;

import java.util.Scanner;

public class star4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int x = 1; x <= N; x++) {
			for(int y = 1; y <= N-x; y++){
				System.out.print("☆");
			}
			for(int y = 1; y <= x*2-1; y++) {
				System.out.print("★");
			}
			for(int y = 1; y <= N-x; y++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
