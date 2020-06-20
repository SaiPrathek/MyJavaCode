package networking;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Download {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The URL : ");
		String url = s.nextLine();
		System.out.println("Enter The Filename : ");
		String file = s.nextLine();
		URL urlobj = new URL(url);
		InputStream is = urlobj.openStream(); /* IMPORTANT IMPORTANT IMPORTANT */
		FileOutputStream os = new FileOutputStream(file);
		int ch = is.read();
		while (ch != -1) {
			os.write(ch);
			ch = is.read();
		}
		os.close();
		is.close();
		s.close();
	}
}
