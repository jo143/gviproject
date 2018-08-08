package guvi;

import java.util.Scanner;

public class guvi82 {
	public static void main ( String arg[]) {
		Scanner scan= new Scanner(System.in);
		Double length=scan.nextDouble();
		Double breath=scan.nextDouble();
		Double area;
		area=length*breath;
		System.out.printf("%.5f",area);
		
		
		scan.close();
		
	}
}
