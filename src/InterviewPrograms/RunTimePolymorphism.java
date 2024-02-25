package InterviewPrograms;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Child c1=new Child();
		c1.car();

	}
	
}

class Parent {
	public void car() {
		System.out.println("Tata");
	}
}

class Child extends Parent {
	@Override
	public void car() {
		System.out.println("Benz");
	}
}
