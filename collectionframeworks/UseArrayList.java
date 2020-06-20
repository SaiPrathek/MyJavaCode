package collectionframeworks;

import java.util.Scanner;
import java.io.FileWriter;
import java.util.*;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Filename : ");
		String filename = s.nextLine();
		System.out.println("Enter The Names [Enter 'end' To End] : ");
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			names.add(s.nextLine());
		FileWriter fw = new FileWriter(filename);
		Collections.sort(names);

		for (String a : names)
			fw.write(a + "\n");

		s.close();
		fw.close();
	}

}
