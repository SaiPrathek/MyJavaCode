import java.util.Scanner;

public class PalStringStars {
	static String pallindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString())) {
			str = "";
			for(int i=0;i<sb.length();i++) {
				str+='*';
			}
		}
		return str;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++)
			a[i] = PalStringStars.pallindrome(a[i]);
		System.out.println(String.join(" ", a));
		s.close();
	}

}
