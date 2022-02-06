package pack.test.date220206;

import java.util.Scanner;
import java.util.stream.Stream;

public class T2588 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		//숫자를 자릿수별 배열로 쪼개기
		int[] num2digit = Stream.of(String.valueOf(num2).split("")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = num2digit.length - 1; i >= 0 ; i--) {
			System.out.println(num1*num2digit[i]);
		}
		System.out.println(num1*num2);
		
		scan.close();
	}

}