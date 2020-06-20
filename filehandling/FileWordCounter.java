package filehandling;
import java.io.*;
import java.util.Scanner;

public class FileWordCounter {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The File Name : ");
			String filename = in.nextLine();
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line;
			System.out.println("Enter The String To Be Searched : ");
			String search = in.nextLine();
			line = br.readLine();
			while (line != null) {
				if (line.contains(search))
					System.out.println(line);
				line = br.readLine();
			}
			in.close();
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
