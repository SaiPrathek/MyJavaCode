import java.util.Scanner;

public class Rot {
	char rotate(char c, int n) {
		for(int i=0;i<n;i++)
			if(c=='z')
				c='a';
			else
				c++;
		return c;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(), ns = "";
		int n = s.nextInt()%26;
		Rot r = new Rot();
		for(int i =0;i<str.length();i++) 
			ns+=r.rotate(str.charAt(i), n);
		System.out.println(ns);
		s.close();
	}

}
