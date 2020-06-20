package networking;

public class Counter {
	static int count = 0;

	public static void increment() {
		Counter.count++;
	}

	public static void decrement() {
		Counter.count--;
	}

	public static int getCount() {
		return Counter.count;
	}

	public static void print() {
		System.out.println(Counter.count);
	}
}
