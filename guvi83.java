package guvi;

import java.util.Scanner;

public class guvi83 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
            int option=scan.nextInt();
            int data1=scan.nextInt();
            int data2=scan.nextInt();
            switch(option)
            {
            case 1:
            	System.out.println(data1/data2);
            	break;
            case 2:
            	System.out.println(data1%data2);
            	break;
             default:
            	System.out.println("Enter valid no");
            }
		
		
		scan.close();
		
		
		

	}

}
