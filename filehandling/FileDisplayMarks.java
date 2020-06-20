package filehandling;

import java.io.*;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileDisplayMarks {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter The File Name : ");
		String filename = in.nextLine();
		try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
			System.out.print("Enter The Roll Number : ");
			int roll = in.nextInt();
			raf.seek((roll - 1) * 4);
			while (raf.getFilePointer() < roll * 4)
				System.out.print(raf.readInt());
			// raf.seek(0);
			// System.out.println(" ");
			// for (int i = 0; i < 5; i++) {
			// System.out.println(raf.readInt());
			// }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		in.close();
	}

}
