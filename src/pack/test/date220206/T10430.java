package pack.test.date220206;

import java.util.Scanner;

public class T10430 {

	public static void main(String[] args) {
		
		//input
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.print(((A%C) * (B%C))%C);
        
        scan.close();
	}
}
