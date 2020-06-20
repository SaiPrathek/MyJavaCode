package filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberAlphabetSeparator {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The File Name : ");
			String filename = in.nextLine();
			ArrayList<String> i = new ArrayList<>();
			ArrayList<String> s = new ArrayList<>();
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			String text[];
			int j;
			Pattern p = Pattern.compile("[0-99999999]");
			while (line != null) {
				text = line.split(" ");
				for (j = 0; j < text.length; j++) {
					if (p.matcher(line) == null)
						i.add(text[j]);
					else {
						s.add(text[j]);
					}
				}
				line = br.readLine();
			}
			for (String a : i) {
				System.out.println(a);
			}
			in.close();
			fr.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
