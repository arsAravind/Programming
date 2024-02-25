package InterviewPrograms;

import java.util.Objects;

public class ObjectClassProperties {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Aravindan");
		System.out.println(s1);
 		Student s2 = new Student(2, "Aravindan");
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
}

class Student extends ObjectClassProperties {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name == s.name;
	}

}
