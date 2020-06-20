package streams;

import java.util.Arrays;

public class EvenSorted {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 3, 5, 7, 6, 9, 8, 1, 10 };
		Arrays.stream(nums).filter(n -> n % 2 == 0).sorted().forEach(System.out::println);
	}
}
