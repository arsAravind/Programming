package InterviewPrograms;

public class ThiyInt {
	public static void main(String[] args) {
		
		int[] arr;
		arr=new int[100];
		int a=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=a++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				if(arr[i]%2==0)
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
