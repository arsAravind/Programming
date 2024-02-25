package InterviewPrograms;

public class StringImportantMethods {

	public static void main(String[] args) {
		System.out.println("String Methods");
		System.out.println("---------------");
		
		String str="SpringBoot";
		System.out.println("length()");
		System.out.println(str.length());
		
		System.out.println("charAt()");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		System.out.println("codePointAt()");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"-"+str.codePointAt(i));  //*
		}
		
		System.out.println("substring()");
		String s1=str.substring(5); // *  6 is inclusive and 10 is exclusive
		System.out.println(s1);
		
		System.out.println("replace()");
		String s2=str.replace('o','y');
		System.out.println(s2);
		
		System.out.println("indexOf()");
		int i1 = str.indexOf('B');
		int i2=str.lastIndexOf('o');//8
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("split()");
		String sp="Java is a programming language";
		String[] sj = sp.split(" ");// *-" "{"java","is","a","programming","language"};
		for (int i = 0; i < sj.length; i++) {
			System.out.println(sj[i]);
		}
		String[] st=sp.split("");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		System.out.println("join()");
		String data1="Hi";
		String data2="Hello";
		String data3="Bye";
		
		String jo = String.join(" ",data1,data2,data3); //*-" "
		System.out.println(jo);
		
		System.out.println("trim()");
		String re=" HTML is a MarkUp language ";
		String re1 = re.trim();  //strip()
		System.out.println(re1);
		
		System.out.println("replace() to remove space");
		String re3=re.replace(" ",""); //*
		System.out.println(re3);
		
		System.out.println("Space removed without using inbuild methods");
		char[] ch=re.toCharArray(); // *  {' ','H','T','M'..args.}
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]);
			}
		}
		
		System.out.println();
		System.out.println("equals() or contentEqual(),equalsIgnoreCase()"); //*
		String e1="java";
		String e2="Java";
		System.out.println(e1.equals(e2));
		System.out.println(e1.equalsIgnoreCase(e2));
		
		System.out.println("contains()");
		boolean f=e1.contains("va");
		System.out.println(f);
		
		System.out.println("startsWith(),endsWith()");
		System.out.println(e1.startsWith("aj"));
		System.out.println(e1.endsWith("va"));
		
		System.out.println("concat()");
		String con=e1.concat(" is OOP language");
		System.out.println(con);
	}
		
}


