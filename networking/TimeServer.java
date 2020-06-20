package networking;

import java.io.PrintWriter;
import java.net.*;
import java.util.Date;

public class TimeServer {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("TimeServer is Ready... ");
		while (true) {
			Socket cs = ss.accept();
			PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);
			pw.println(new Date().toString());
		}

	}

}
