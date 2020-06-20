package exceptionhandling;

public class Accounts {
	String acno;
	double balance;

	public Accounts(String acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount < 1000) {
			throw new InvalidAmountException();
		}
		this.balance += amount;
	}

	public void withdraw(double amount) throws InvalidAmountException, InsufficientAmountException {
		if (amount < 100) {
			throw new InvalidAmountException();
		}
		if (this.balance < amount) {
			throw new InsufficientAmountException();
		}
		this.balance -= amount;
	}

	public void printBalance() {
		System.out.println(this.balance);
	}
}
