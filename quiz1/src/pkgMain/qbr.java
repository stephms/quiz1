package pkgMain;

import java.util.Scanner;
public class qbr {

	public static void main(String[]args) {
		System.out.println(qbRating());
	}

	public static double qbRating() {
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Number of touchdowns: ");
		int tds = input.nextInt();
		System.out.println("Total yards: ");
		int yds = input.nextInt();
		System.out.println("Number of interceptions: ");
		int ints = input.nextInt();
		System.out.println("Number of completions: ");
		int comps = input.nextInt();
		System.out.println("Number of passes attempted: ");
		int attempts = input.nextInt();
		input.close();
		
		double a = ((comps/attempts)-.3)*5.0;
		double b = ((yds/attempts)-3)*.25;
		double c = (tds/attempts)*20.0;
		double d = 2.375-((ints/attempts)*25.0);
		return ((mm(a)+mm(b)+mm(c)+mm(d))/6)*100;
		
	}
	
	public static double mm(double d) {
		if (d < 0) return 0;
		if (d > 2.375) return 2.375;
		return d;
	}
}
