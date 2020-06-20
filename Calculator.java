
public class Calculator {

	public int Square(int n) {
		return n *= n;
	}

	public int Minus(int n,int y) {
		return n -= y;
	}

	public int Add(int n,int y) {
		return n += y;
	}

	public void Power(int n) {
		System.out.println(n ^ n);
	}

	public int Quotient(int n,int y) {
		return n /= y;
	}

	public int Factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}
}