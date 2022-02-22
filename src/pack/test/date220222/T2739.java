package pack.test.date220222;
/*N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2739 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
