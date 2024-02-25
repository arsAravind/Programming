package ExceptionHandling;

public class StudentFoundException extends Exception{

	@Override
	public String getMessage() {
		
		return "Student found";
	}
}
