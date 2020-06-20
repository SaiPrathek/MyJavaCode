package filehandling;

import java.io.*;
import java.util.Scanner;

public class FileEnterMarks {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter The File Name : ");
		String filename = in.nextLine();
		try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
			raf.seek(0);
			System.out.print("Enter The Roll Number : ");
			int roll = in.nextInt();
			System.out.print("Enter The Marks : ");
			int marks = in.nextInt();
			while (true) {
				System.out.print("Enter The Roll Number : ");
				roll = in.nextInt();
				if (roll < 0)
					break;
				raf.seek((roll - 1) * 4);
				System.out.print("Enter The Marks : ");
				marks = in.nextInt();
				raf.writeInt(marks);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		in.close();
	}
}