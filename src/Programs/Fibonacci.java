package Programs;

public class Fibonacci {
	public static void main(String[] args) {
		
//		fib=0,1,1,2,3,5,8,13......
		int n=5;
		int fib1=0;//1,1,2
		int fib2=1;//1,2,3
		int fib3=fib1+fib2;//2,3,5
		while(n>0)
		{
			System.out.println(fib1);
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
			n--;
		}
	}
}
