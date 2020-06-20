package multithreading;
public class TestRethrowException {

	public static void main(String[] args) {
		RethrowException r = new RethrowException();
		try{
			r.m1(-4);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}