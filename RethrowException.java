class Ex1 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ex1() {
		super("Rethrow Exception");
	}
}

class Ex2 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

public class RethrowException {

	public void m1(int v) throws Ex1, Ex2 {
		try {
			if (v < 0)
				throw new Ex1();
			else if (v > 10)
				throw new Ex2();
		} catch (Exception ex) {
			throw ex;
		}
	}

}
