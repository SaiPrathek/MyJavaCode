package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHorizontalToVertical {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("C:\\jdk 11\\java_file_handling\\Names.txt");
				FileWriter fw = new FileWriter("C:\\jdk 11\\java_file_handling\\NewNames.txt")) {
			int line = fr.read();
			while (fr != null) {
				if (line == ',')
					fw.write(" \n ");
				else
					fw.write(line);
				line = fr.read();
				if (line == -1)
					break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}  

}
