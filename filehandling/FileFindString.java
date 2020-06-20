package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileFindString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The File Name : ");
		String filename = in.nextLine();
		try (FileReader fr = new FileReader("C:\\jdk 11\\java_file_handling\\" + filename + ".txt");
				BufferedReader br = new BufferedReader(fr);) {
			System.out.print("Enter The String To Be Found : ");
			String ch = in.nextLine();
			LineNumberReader lnr = new LineNumberReader(br);
			String line = br.readLine();
			int i = 1;
			int check = -1;
			while (line != null) {
				lnr.setLineNumber(i++);
				if (line.contains(ch)) {
					System.out.println(lnr.getLineNumber());
					check = 1;
				}
				line = br.readLine();
			}
			if (check == -1)
				System.out.println("String Not Found !!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		in.close();
	}

}
