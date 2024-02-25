package CrudOperationUsingStudent;

import java.util.ArrayList;
import java.util.Iterator;

public class Crud {
	public static void m1() {
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentName("Raj");
		s1.setStudentPhno("9818926735");
		s1.setStudentPlace("Trichy");

		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setStudentName("Ram");
		s2.setStudentPhno("7863667352");
		s2.setStudentPlace("Salem");

		Student s3 = new Student();
		s3.setStudentId(3);
		s3.setStudentName("Siva");
		s3.setStudentPhno("8726175463");
		s3.setStudentPlace("Madurai");

		// Create
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		// Read
		System.out.println(list);

		Student update = new Student();
		update.setStudentId(3);
		update.setStudentName("Nageshwaran");
		update.setStudentPhno("9089877298");
		update.setStudentPlace("Madurai");

		// Update
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getStudentId() == update.getStudentId()) {
				list.set(i, update);
			}
		}
		System.out.println(list);

		int id = 3;
//		list.removeIf((Student s) -> s.getStudentId() == id);
//		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getStudentId() == id) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}

