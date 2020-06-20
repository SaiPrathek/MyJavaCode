public class InsufficientAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientAmountException() {
		super("Insufficient Balance");
	}

	public InsufficientAmountException(String msg) {
		super(msg);
	}

}
