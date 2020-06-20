package networking;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BookClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 3000);
		Scanner keyboard = new Scanner(System.in);
		Scanner sin = new Scanner(cs.getInputStream());
		PrintWriter sout = new PrintWriter(cs.getOutputStream(), true);
		int bookno;
		String title;
		while (true) {
			System.out.println("Enter The Book Number [0 To Stop]: ");
			bookno = keyboard.nextInt();
			sout.println(bookno);
			if (bookno == 0)
				break;
			title = sin.nextLine();
			if (title.length() != 0) {
				System.out.println(title);
			} else
				System.out.println("Invalid Book Number ! ");
		}
		cs.close();
		keyboard.close();
		sin.close();
	}

}
