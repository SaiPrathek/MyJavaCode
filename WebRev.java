import java.util.Scanner;

public class WebRev {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		String str = s.nextLine();
		String a[] = str.split(" ");
		for(int i=0;i<a.length;i++) {
			StringBuffer sb = new StringBuffer(a[i]);
			a[i] = sb.reverse().toString();
		}
		System.out.println(String.join(" ", a));
		s.close();
	}

}
