package CheckedException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotSupportedExcep {
	public static void main(String[] args) throws IOException {
		// When we do any mistakes while setting the file directory path
		File file = new File("C:\\check\\fdff\\hi.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("hjvch");
		fw.close();

	}

}
