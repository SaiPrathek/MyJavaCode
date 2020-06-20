package filehandling;
import java.io.*;
import java.util.Scanner;

public class FileBlankLineDisplay {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter The File Name : ");
			String filename = in.nextLine();
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line;
			LineNumberReader count = new LineNumberReader(br);
			line = br.readLine();
			int i = 1;
			while (line != null) {
				count.setLineNumber(i++);
				if (line.length() == 0) {
					System.out.print(count.getLineNumber());
					System.out.println(line);
				}
				line = br.readLine();
			}
			in.close();
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
