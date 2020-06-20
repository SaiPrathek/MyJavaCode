package collectionframeworks;

import java.io.*;
import java.util.*;

public class SortedText {

	public static void main(String[] args) throws Exception {
		System.out.print("Enter Filename : ");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String text = br.readLine();
		String line[];
		ArrayList<String> words = new ArrayList<>();
		while (text != null) {
			line = text.split(" ");
			for (int i = 0; i < line.length; i++) {
				words.add(line[i]);
			}
			text = br.readLine();
		}
		Collections.sort(words);
		for (String a : words)
			System.out.println(a);
		s.close();
		fr.close();
		br.close();

	}

}
