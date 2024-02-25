package CrudOperationUsingStudent;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPlace;
	private String studentPhno;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPlace() {
		return studentPlace;
	}

	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}

	public String getStudentPhno() {
		return studentPhno;
	}

	public void setStudentPhno(String studentPhno) {
		this.studentPhno = studentPhno;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPlace=" + studentPlace
				+ ", studentPhno=" + studentPhno + "]";
	}

}
