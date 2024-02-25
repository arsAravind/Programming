package ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentName("Ram");

		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setStudentName("Raj");

		Student s3 = new Student();
		s3.setStudentId(3);
		s3.setStudentName("Rahul");

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();

		ArrayList a1 = new ArrayList();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);

		int count = 0;
		for (int i = 0; i < a1.size(); i++) {
			Object object = a1.get(i);
			Student stu = (Student) object;
			if (stu.getStudentId() == a) {

			} else {
				count++;
			}
		}

		if (count == a1.size()) {
			try {
				throw new StudentNotFoundException();
			} catch (StudentNotFoundException sh) {
				System.out.println(sh.getMessage());
			}
		} else {
			try {
				throw new StudentFoundException();
			} catch (StudentFoundException exception) {
				System.out.println(exception.getMessage());
			}
		}
	}

}
