
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.init("Prathek", 1000);
		Employee e2 = new Employee();
		e2.setSalary(50000);
		e1.print();
		e2.print();
	}

}
