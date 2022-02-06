package pack.test.date220206;

import java.util.Scanner;

public class T1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A, B;
		A = scan.nextInt();
		B = scan.nextInt();

		if (A > B) {
			System.out.println(">");
		}
		else if(A < B) {
			System.out.println("<");
		}
		else if(A == B) {
			System.out.println("==");
		}
		
		scan.close();

	}
}
