package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\JAVA\\j.txt");
		FileWriter writer=new FileWriter(file);
		writer.write("Hi how are you");
		writer.close();
		
		FileReader fr=new FileReader(file);
		int x=0;
		while((x=fr.read())!=-1)
		{
			char ch=(char)x;
			System.out.print(ch+"");
		}
		
		
	}
}
