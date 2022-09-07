package ProgramingTest;

public class star4 {
	public static void main(String[] args) {
		
		for(int x = 1; x <= 4; x++) {
			for(int y = 1; y <= 4-x; y++){
				System.out.print("☆");
			}
			for(int y = 1; y <= x*2-1; y++) {
				System.out.print("★");
			}
			for(int y = 1; y <= 4-x; y++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
