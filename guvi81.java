package guvi;

import java.util.Scanner;

public class guvi81 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int warrior=scan.nextInt();
		int  opponent=scan.nextInt();
		int fight =0;
		if (warrior>=Math.pow(2, 32) && opponent>=Math.pow(2, 32) )
		{
			System.out.println("end of the file");
		}
		else
		{
			fight=opponent-warrior;
			System.out.println(fight);

		}

		scan.close();
	}

}
