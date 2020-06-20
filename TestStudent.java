abstract class Student {

	protected int adno;
	protected String name;

	public Student(int adno, String name) {
		this.adno = adno;
		this.name = name;
	}

	public void print() {
		System.out.println(this.adno);
		System.out.println(this.name);
	}

	public abstract int getMarks();
}

class JavaStudent extends Student {
	protected int tmarks;

	public JavaStudent(int adno, String name, int tmarks) {
		super(adno, name);
		this.tmarks = tmarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.tmarks);
	}

	public int getMarks() {
		return this.tmarks;
	}
}

class PythonStudent extends Student {
	protected int lmarks;

	public PythonStudent(int adno, String name, int lmarks) {
		super(adno, name);
		this.lmarks = lmarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.lmarks);
	}

	public int getMarks() {
		return this.lmarks;
	}
}

public class TestStudent {

	public static void main(String[] args) {

		Student s = new JavaStudent(1, "Sai", 89);
		s.print();
		System.out.println("" + "");

		if (s.getMarks() >= 50)
			System.out.println("Pass");
		else
			System.out.println("Fail");

		s = new PythonStudent(2, "Naveen", 8);
		s.print();

		if (s.getMarks() >= 50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		s = new JavaStudent(3, "Adi", 65);
		
		s.print();
		

	}

}
