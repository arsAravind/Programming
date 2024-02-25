package ProgramIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupPeople {
	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 3, 3, 2 };
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		List<Integer> l4=new ArrayList<Integer>();

		int[] copy = new int[arr.length]; // {1,2,2,3,3,3}
		int small = arr[0];
		int secSmall = arr[1];
		int thirdSmall=arr[2];
		for (int i = 0; i < arr.length; i++) {
			
			  if (arr[i] < small) {
				secSmall = small;
				small = arr[i];
			} else if (arr[i] < secSmall) {
				thirdSmall=secSmall;
				secSmall = arr[i];
			}
			else if(arr[i]<thirdSmall)
			{
				thirdSmall=arr[i];
				}
			}
			for (int i = 0; i < copy.length; i++) {
				if(small==arr[i])
				{
					l1.add(i);
				}
			}	
			for (int i = 0; i < copy.length; i++) {
				if(secSmall==arr[i])
				{
					l2.add(i);
				}
			}	
			for (int i = 0; i < copy.length; i++) {
				if(thirdSmall==arr[i])
				{
					l3.add(i);
				}
			}	
		
			l4.addAll(l1);
			l4.addAll(l2);
			l4.addAll(l3);
			for (int i = 0; i < l4.size(); i++) {
				System.out.println(l4.get(i));
			}

	}

}
