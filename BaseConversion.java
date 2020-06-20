import java.util.Scanner;
public class BaseConversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Base");
		int op = s.nextInt();
		System.out.println("Enter The Number : ");
		int num = s.nextInt();
		int fnum = 0;
		for(int i=0;num!=0;i++) {
			fnum+=num%10 * Math.pow(op, i);
			num/=10;
		}
		System.out.println(fnum);
		s.close();
	}

}
