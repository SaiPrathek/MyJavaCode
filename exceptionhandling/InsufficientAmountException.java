package exceptionhandling;

public class InsufficientAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InsufficientAmountException() {
		super("Invalid Amount Transaction");
	}
	public InsufficientAmountException(String msg) {
		super(msg);
	}
}