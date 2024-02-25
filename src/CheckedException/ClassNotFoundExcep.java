package CheckedException;

public class ClassNotFoundExcep {
	public static void main(String[] args) throws ClassNotFoundException {
//When we do mistakes in Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}
