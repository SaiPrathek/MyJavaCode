import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  rnum = (int)Math.round(Math.random()) * 14 + 1;
		int num = -1, chance = -1;
		System.out.println("The Guessing Game !!");
		for(int i=1;i<=3 && rnum != num;i++) {
			System.out.println("Chance " + i + " ");
			num = s.nextInt();
			if(num==rnum) {
				System.out.println("\n You Win !!");
				chance = 1;
				break;
			} else if(num >rnum) {
				if (i==3)
					continue;
				System.out.println("Guess a Smaller Number");
			}else {
				if (i==3)
					continue;
				System.out.println("Guess A Bigger Number");
			}
			
		}
		

		if (chance == -1)
			System.out.println("\nYou Lost. The Number is : " + rnum);
		
		s.close();
	}

}