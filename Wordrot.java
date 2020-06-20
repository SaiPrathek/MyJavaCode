import java.util.Scanner;

public class Wordrot {
	String rotate(String str) {
		char temp = str.charAt(0);
		String ns = "";
		for(int i=1;i<str.length();i++) 
			ns+=str.charAt(i);
		ns+=temp;
		return ns;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();
		Wordrot w = new Wordrot();
		for(int i=0;i<n;i++)
			str = w.rotate(str);
		System.out.println(str);
		s.close();
	}

}
