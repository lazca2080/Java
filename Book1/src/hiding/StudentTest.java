package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.setStudentNAme("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
