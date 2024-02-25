package CheckedException;

public class CloneNotFoundExcep implements Cloneable{
	int x=10;
	int y=20;
	
	//When we are implements Cloneable(I) while using clone()
	
	@Override
	public String toString()
	{
		return x+" "+y;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneNotFoundExcep c1=new CloneNotFoundExcep();
		System.out.println(c1);
		
		Object clone = c1.clone();
		CloneNotFoundExcep c2=(CloneNotFoundExcep) clone;
		System.out.println(c2);
	}
	
	
}