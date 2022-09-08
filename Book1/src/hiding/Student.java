package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentNAme(String studentName) {
		this.studentName = studentName;
	}
}
