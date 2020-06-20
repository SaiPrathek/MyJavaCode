package collectionframeworks;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class WordFrequency {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Filename : ");
		String filename = in.nextLine();
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		TreeMap<String, Integer> frequency = new TreeMap<>();
		String text = br.readLine();
		String line[];
		while (text != null) {
			Pattern p = Pattern.compile("[^a-zA-z+]");
			line = p.split(text);
			for (int i = 0; i < line.length; i++) {
				if (frequency.containsKey(line[i]))
					frequency.put(line[i], frequency.get(line[i]) + 1);
				else
					frequency.put(line[i], 1);
			}
			text = br.readLine();
		}
		for (String key : frequency.keySet())
			System.out.printf("%s : %s\n", key, Integer.toString(frequency.get(key)));

		in.close();
		br.close();
		fr.close();
	}

}
