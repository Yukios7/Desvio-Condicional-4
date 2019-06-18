package EDNA4;

import java.util.Scanner;

public class Titia4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ops = new Scanner(System.in);
		int B1 = ops.nextInt();
		int B2 = ops.nextInt();
		int B3 = ops.nextInt();
		int B4 = ops.nextInt();
		int r = ((B1+B2+B3+B4)/4);
		 if (r >=6) {
			 System.out.println("Aprovado");
		 }
		 else if (r <3) {
			 System.out.println("Retido");
		 }
		 else if (r >=3 && r <6) {
			 System.out.println("Exame");
		 }
	}

}
