package ch05;

public class p146_StudentTest {
	public static void main(String[] args) {
		p129_Student studentAhn = new p129_Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
