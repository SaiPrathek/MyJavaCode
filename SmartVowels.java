import java.util.Scanner;

public class SmartVowels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vow = "AEIOUaeiou";
		String str = s.nextLine();
		for(int i=0;i<str.length();i++)
			if(vow.indexOf(str.charAt(i)) == -1)
				System.out.print(str.charAt(i));				
		s.close();
	}

}
