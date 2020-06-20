package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.*;
import networking.Counter;

public class MultiThreadBookServer {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(3000, 10);
		System.out.println("Book Sevrer Is Ready...");
		ExecutorService executor = Executors.newFixedThreadPool(10);
		while (true) {
			Socket cs = ss.accept();
			Counter.increment();
			System.out.println("Accepted Client Request Number " + Counter.getCount() + "...");
			ClientHandler client = new ClientHandler(cs);
			executor.execute(client);
		}
	}

}

class ClientHandler implements Runnable {
	Socket cs;

	public ClientHandler(Socket cs) {
		this.cs = cs;
	}

	@Override
	public void run() {
		String books[] = { "abc", "pqr", "xyz" };
		try {
			Scanner scanner = new Scanner(cs.getInputStream());
			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			int bookno;
			String title;
			while (true) {
				bookno = scanner.nextInt();
				if (bookno == 0)
					break;
				if (bookno - 1 < books.length) {
					title = books[bookno - 1];
				} else
					title = "";
				pw.println(title);
			}
			System.out.println("Client Connection Lost");
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}