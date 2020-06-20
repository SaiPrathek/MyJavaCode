package networking;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 2000);
		InputStream is = cs.getInputStream();
		Scanner scanner = new Scanner(is);
		String line = scanner.nextLine();
		System.out.println(line);
		cs.close();
		scanner.close();
	}

}
