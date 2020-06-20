package collectionframeworks;

import java.io.*;

import java.util.*;
import java.util.regex.Pattern;

public class WordIndex {

	public static void main(String[] args) throws Exception {
		// System.out.println("Enter The Filename");
		// Scanner in = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\jdk 11\\java_file_handling\\SampleText.txt");
		BufferedReader br = new BufferedReader(fr);
		LineNumberReader lar = new LineNumberReader(br);
		TreeMap<String, Integer> find = new TreeMap<>();
		String text = br.readLine();
		String line[];
		// LinkedHashSet<Integer> index = new LinkedHashSet<>();
		int index[] = new int[200];
		int i, count = 0;
		while (text != null) {
			lar.setLineNumber(count);
			Pattern p = Pattern.compile("[^a-zA-z+]");
			line = p.split(text);
			lar.setLineNumber(count);
			for (i = 0; i < line.length; i++) {
				index[i] = lar.getLineNumber() + 1;
				find.put(line[i], index[i]);

			} 
			count++;
			text = br.readLine();
		}

		for (String key : find.keySet())
			System.out.println(key + " " + find.get(key));
		// in.close();
		fr.close();
		br.close();
	}

}
