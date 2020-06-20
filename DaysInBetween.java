import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;

public class DaysInBetween {

	public static void main(String[] args) {
		System.out.println("Enter The Start Date (dd-MM-yyyy) : ");
		Scanner sd = new Scanner(System.in);
		String sdate  = sd.nextLine();
		LocalDate sdate1 = LocalDate.parse(sdate , DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println("Enter The End Date (dd-MM-yyyy) : ");
		Scanner ed = new Scanner(System.in);
		String edate  = ed.nextLine();
		LocalDate edate1 = LocalDate.parse(edate , DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		// LocalDate date = LocalDate.of();
		Period p = Period.between(sdate1, edate1);
		System.out.print(p);
		System.out.println(p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days");
	
		sd.close();
		ed.close();
	}

}
