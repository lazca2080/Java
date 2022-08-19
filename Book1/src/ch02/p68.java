package ch02;

/*
 * 날짜 : 2022/08/18
 * 이름 : 박종협
 * 내용 : 명시적 형 변환
 */
public class p68 {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; //각각 따로 형 변환이 일어남
		int iNum4 = (int)(dNum1 + fNum2);  	 //괄호로 인해 동시에 형 변환이 일어남
		System.out.println(iNum3); //따라서 (1) + (0) = 1
		System.out.println(iNum4); //(1.2+0.9)=(2.1)=2
		
	
	}

}
