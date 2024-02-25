package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ConversionProgram {

	public static void main(String[] args) {

		// Array To collection
		int[] arr = { 12, 22, 343, 434 };
		ArrayList list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);

		// Collection to array
		Object[] a = list.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		// String to Array
		String str = "Consistency";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

		// Array To String
		String s = Arrays.toString(ch);
		System.out.println(s);

		// Integer to String
		int a1 = 10;
		String s2 = Integer.toString(a1);
		System.out.println(s2);

		// String To Integer
		String stt = "6756";
		int aa = Integer.parseInt(stt);
		System.out.println(aa);

		// Primitive type data to Object
		Integer af = Integer.valueOf(10);
		System.out.println(af);

		// Object to primitive type data
		Integer ag = af.intValue();
		System.out.println(ag);

		// Decimal To Binarydecimal
		int n1 = 17;
		System.out.println(Integer.toBinaryString(n1));
		
		// Decimal To Hexadecimal
		int n = 17;
		System.out.println(Integer.toHexString(n));

	}

}
