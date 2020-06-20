//22 January 2019
public class Account {

	private int ano;
	private String ahname;
	private double balance;
	private static final double minbal = 5000;

	public Account(int ano, String ahname) {
		this.ano = ano;
		this.ahname = ahname;
	}

	public Account(int ano, String ahname, double balance) {
		this.ano = ano;
		this.ahname = ahname;
		this.balance = balance;
	}

	public void print() {
		System.out.println(ano);
		System.out.println(ahname);
		System.out.println(balance);
	}

	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double balance) {
		if (balance < this.balance && minbal < this.balance) {
			this.balance -= balance;

		}

		else {
			System.out.println("Sorry");
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getNo() {
		return ano;
	}

	public static double getMinBal() {
		return minbal;
	}
}