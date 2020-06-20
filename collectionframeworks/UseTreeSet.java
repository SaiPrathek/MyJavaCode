package collectionframeworks;

// import java.io.FileWriter;
import java.util.Scanner;
import java.util.*;

public class UseTreeSet {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		// System.out.println("Enter The File Name : ");
		// String filename = s.nextLine();
		System.out.println("Enter The Names [Enter 'end' To End] : ");
		ArrayList<String> names = new ArrayList<>();
		String e = s.nextLine();
		while (true) {
			if (e == "end")
				break;
			else {
				names.add(e);
				e = s.nextLine();
			}
		}
		// FileWriter fw = new FileWriter(filename);
		// while(fw.write(names);) {
		for (String a : names)
			System.out.println(a);

		// }
		// fw.close();
		s.close();
	}

}
