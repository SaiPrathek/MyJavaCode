package multithreading;
class ChildThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Child : " + i);
		}
	}
}

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("In Main");
		ChildThread c = new ChildThread();
		c.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println("Main :  " + i);
		}

		System.out.println("End Of Main");

	}

}