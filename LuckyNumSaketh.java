import java.util.Scanner;

public class LuckyNumSaketh {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int size = 0;
		String sum = "", a[] = new String[10];
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= '1' && ch <= '9')
				sum+=ch;
			else if(sum.length()!=0){
				a[size++] = sum;
				sum = "";
			}else if(ch == ' ')
				break;
		}
		int su = 0;
		for(int i=0;i<size;i++)
			su += Integer.parseInt(a[i]);
		String i  = ""+str.charAt(str.length()-1);
		System.out.println(su%Integer.parseInt(i));
		s.close();
	}

}
