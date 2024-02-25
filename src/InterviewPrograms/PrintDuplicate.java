package InterviewPrograms;

public class PrintDuplicate {
	public static void main(String[] args) {
		
	int[] arr= {1,2,4,1,2,3,5,6,4,3};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.print(arr[i]+" ");
			}
		}	
	}
	System.out.println();
	char[] ch= {'a','b','a','c','d','e','b','f'};
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j])
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	System.out.println();
	String[] str= {"Aravindan","Chelladurai","Yuvaraj","Chelladurai","Thangesh","Yuvaraj"};
	for (int i = 0; i < str.length; i++) {
		for (int j = i+1; j < str.length; j++) {
			if(str[i]==str[j])
			{
				System.out.print(str[i]+" ");
			}
		}
		
	}
}
}
