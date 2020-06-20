import java.util.Scanner;

public class NextSmallPal {
	boolean pallindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		if(sb.reverse().toString().equals(str))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		NextSmallPal nsp = new NextSmallPal();
		do{
			if(nsp.pallindrome(Integer.toString(num))) {
				System.out.println(num);
				break;
			}
			num++;
		}while(true);
		s.close();
	}

}
