package InterviewPrograms;

public class PatternMultiplication {
	public static void main(String[] args) {
		
		int n=10;
		int data=1;
		int a=1;//2,4  when comes second iteration it becomes 1
		for (int i = 1; i < n; i++) { //2
			
			for (int j = 1; j < i+1; j++) {	
				a=data*(j+1);
				//System.out.print(i*j+" ");
			}
			data++;
			System.out.println();
		}
	}
}
