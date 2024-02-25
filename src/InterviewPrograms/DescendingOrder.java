package InterviewPrograms;

public class DescendingOrder 
{
	public static void main(String[] args) 
	{
		int[] arr= {12,21,34,43,39,76,34};
		System.out.println("Before sorting");
		m1(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{	
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("After sorting for descending");
		m1(arr);
	}
	
	public static void m1(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
