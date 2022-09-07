package ch05;

public class p148_StudentTest1 {
	public static void main(String[] args) {
		p129_Student student1 = new p129_Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		p129_Student student2 = new p129_Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
}
