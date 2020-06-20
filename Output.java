class One{
	@SuppressWarnings("finally")
	public String test(){
		try{
			System.out.println("One");
		}
		finally{
			System.out.println("Two");
			return "Here";
		}
	}
}

public class Output{
	public static void main(String args[]) {
		One o = new One();
		o.test();
	}
}