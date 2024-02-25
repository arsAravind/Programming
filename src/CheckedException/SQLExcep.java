package CheckedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExcep {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//When we do mistakes while give the connection
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String db = "jdbc:mysql://localhost:3306/student?user=root&password=root";
		Connection connection = DriverManager.getConnection(db);
	}
}
