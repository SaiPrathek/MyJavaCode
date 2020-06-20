package exceptionhandling;

public class InvalidAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAmountException() {
		super("Invalid Amount Transaction");
	}

	public InvalidAmountException(String msg) {
		super(msg);
	}

}
