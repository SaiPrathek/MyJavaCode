import java.util.Scanner;

public class SumOf2Primes {
	boolean prime(int num) {
		for (int i = 2; i < num / 2; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = s.nextInt();
		int a = 2, b = 2;
		SumOf2Primes sop = new SumOf2Primes();
		do {
			if(sop.prime(a) && sop.prime(b))
				if(a + b == num) {
					System.out.println(a + " + " + b + " = " + num);
					break;
				}
			if(b==num) {
				a++;
				b = 2;
			}else
				b++;
		}while(true);
		s.close();
	}

}
