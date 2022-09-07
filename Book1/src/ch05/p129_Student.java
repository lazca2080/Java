package ch05;

public class p129_Student {
	int studenID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}		
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		p129_Student studentAhn = new p129_Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
